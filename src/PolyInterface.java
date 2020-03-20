package eg.edu.alexu.csd.datastructure.linkedList.cs;

import java.util.InputMismatchException;
import java.util.Scanner;
public class PolyInterface {

	private static int[]z=new int[] {0,0,0,0};
	public static void main(String[] args) {Scanner s=new Scanner(System.in);
	PolynomialSolver xr = new PolynomialSolver();
	while(true) {
	System.out.println("Please choose an action\r\n" + 
			"-----------------------\r\n" + 
			"1- Set a polynomial variable\r\n" + 
			"2- Print the value of a polynomial variable\r\n" + 
			"3- Add two polynomials\r\n" + 
			"4- Subtract two polynomials\r\n" + 
			"5- Multiply two polynomials\r\n" +
			"6- Evaluate a polynomial at some point\r\n" +
			"7- Clear a polynomial variable\r\n" +
			"====================================================================\r\n");

	String choice = null;
	try
	{choice=s.next();}catch (InputMismatchException e) {
	    System.out.println("Invalid input");
	}
	switch(choice) {
	case "1":
		System.out.println("Insert the variable name: A, B or C:\r\n");
		char c1=s.next().charAt(0);
		if(c1!='a'&&c1!='A'&&c1!='b'&&c1!='B'&&c1!='c'&&c1!='C') {
			try{throw new RuntimeException("Invalid input");}
			catch(RuntimeException e){System.out.println(e.getMessage());}}
		else {
			/*if(c1=='a'||c1=='A') {z[0]=1;}
			else if(c1=='b'||c1=='B') {z[1]=1;}
			else if(c1=='c'||c1=='C') {z[2]=1;}*/
		System.out.println("Insert the polynomial terms in the form:\r\n"+
			"(coeff1, exponent1), (coeff2, exponent2), ..\r\n");
		Scanner ss=new Scanner(System.in);
	    String b=ss.nextLine();if(b.length()==0) {try{throw new RuntimeException("Invalid input");}
	    catch(RuntimeException e){System.out.println(e.getMessage());}}
	    else {
	    	if(c1=='a'||c1=='A') {z[0]=1;}
			else if(c1=='b'||c1=='B') {z[1]=1;}
			else if(c1=='c'||c1=='C') {z[2]=1;}
	    String []x=b.trim().split("\\s+");
	    String c="";for(int i=0;i<x.length;i++) {c+=x[i];}
	    String []v1=c.split(",");int[][] u=new int[v1.length/2][2];int r=0;
	    for(int i=0;i<v1.length;i++) {v1[i]=v1[i].replaceAll("[()]", "");
	    v1[i]=v1[i].replaceAll("\\s+", "");}
	 for(int i=0;i<v1.length/2;i++) {
	 	for(int j=0;j<2;j++) {u[i][j]=Integer.parseInt(v1[r++]);	
	 		}}
	    xr.setPolynomial(c1,u);
	    System.out.println("Polynomial "+c1+" is set\r\n");}}
	    break;
	case "2":
		System.out.println("Insert the variable name: A, B, C or R\r\n");
		char c2=s.next().charAt(0);
		if(c2!='a'&&c2!='A'&&c2!='b'&&c2!='B'&&c2!='c'&&c2!='C'&&c2!='r'&&c2!='R') 
		{try{throw new RuntimeException("Invalid input");}
		catch(RuntimeException e){System.out.println(e.getMessage());}}
		else {int t=0;
		        if(c2=='a'||c2=='A') {t=0;}
		        else if(c2=='b'||c2=='B') {t=1;}
	        	else if(c2=='c'||c2=='C') {t=2;}
	        	else if(c2=='c'||c2=='C') {t=3;}
		        if(z[t]==0) {try{throw new RuntimeException("variable not set");}
		        catch(RuntimeException e){System.out.println(e.getMessage());}}
		        else {
			System.out.println(c2+" value in "+c2+":"+xr.print(c2)+"\r\n");}
		}
		break;
	case "3":
		System.out.println("Choose two defined polynomials to add them : ");
		char c3=s.next().charAt(0);
		if(c3!='a'&&c3!='A'&&c3!='b'&&c3!='B'&&c3!='c'&&c3!='C') {
			try{throw new RuntimeException("Invalid input");}
			catch(RuntimeException e){System.out.println(e.getMessage());}}
		char c4=s.next().charAt(0);
		if(c4!='a'&&c4!='A'&&c4!='b'&&c4!='B'&&c4!='c'&&c4!='C') {
			try{throw new RuntimeException("Invalid input");}
			catch(RuntimeException e){System.out.println(e.getMessage());}}
		else {int t=0,t1=0;
	        if(c3=='a'||c3=='A') {t=0;}
	        else if(c3=='b'||c3=='B') {t=1;}
	    	else if(c3=='c'||c3=='C') {t=2;}
	        if(c4=='a'||c4=='A') {t1=0;}
	        else if(c4=='b'||c4=='B') {t1=1;}
	    	else if(c4=='c'||c4=='C') {t1=2;}
	        if(z[t]==0 || z[t1]==0) {try{throw new RuntimeException("variable not set");}
	        catch(RuntimeException e){System.out.println(e.getMessage());}}
	        else {String st1="";
		int [][]rr=xr.add(c3, c4);
		xr.setPolynomial('R', rr);
		z[3]=1;
		for(int i=0;i<rr.length;i++) {st1+="(";st1+=rr[i][0];st1+=",";st1+=rr[i][1];st1+=")";
		if(i==rr.length-1) {}
		else {st1+=",";}
		}
		System.out.println("Result set in R is : "+ st1);
		}}
		break;
	case "4":
		System.out.println("Choose two defined polynomials to subtract them : ");
		char c5=s.next().charAt(0);
		if(c5!='a'&&c5!='A'&&c5!='b'&&c5!='B'&&c5!='c'&&c5!='C') {
			try{throw new RuntimeException("Invalid input");}
			catch(RuntimeException e){System.out.println(e.getMessage());}}
		char c6=s.next().charAt(0);
		if(c6!='a'&&c6!='A'&&c6!='b'&&c6!='B'&&c6!='c'&&c6!='C'){
			try{throw new RuntimeException("Invalid input");}
			catch(RuntimeException e){System.out.println(e.getMessage());}}
		else {int t=0,t1=0;
	    if(c5=='a'||c5=='A') {t=0;}
	    else if(c5=='b'||c5=='B') {t=1;}
		else if(c5=='c'||c5=='C') {t=2;}
	    if(c6=='a'||c6=='A') {t1=0;}
	    else if(c6=='b'||c6=='B') {t1=1;}
		else if(c6=='c'||c6=='C') {t1=2;}
	    if(z[t]==0 || z[t1]==0) {try{throw new RuntimeException("variables not set");}
	    catch(RuntimeException e){System.out.println(e.getMessage());}}
	    else {String st1="";
			int [][]rrr=xr.subtract(c5, c6);
			xr.setPolynomial('R',rrr);
			z[3]=1;
			for(int i=0;i<rrr.length;i++) {st1+="(";st1+=rrr[i][0];st1+=",";st1+=rrr[i][1];st1+=")";
			if(i==rrr.length-1) {}
			else {st1+=",";}
			}
			System.out.println("Result set in R is : "+ st1);
			}}
		break;
	case "5":
		System.out.println("Choose two defined polynomials to Multiply them : ");
		char c7=s.next().charAt(0);
		if(c7!='a'&&c7!='A'&&c7!='b'&&c7!='B'&&c7!='c'&&c7!='C') {
			try{throw new RuntimeException("Invalid input");}
		catch(RuntimeException e){System.out.println(e.getMessage());}}
		char c8=s.next().charAt(0);
		if(c8!='a'&&c8!='A'&&c8!='b'&&c8!='B'&&c8!='c'&&c8!='C') {
			try{throw new RuntimeException("Invalid input");}
		catch(RuntimeException e){System.out.println(e.getMessage());}}
		else {int t=0,t1=0;
	    if(c7=='a'||c7=='A') {t=0;}
	    else if(c7=='b'||c7=='B') {t=1;}
		else if(c7=='c'||c7=='C') {t=2;}
	    if(c8=='a'||c8=='A') {t1=0;}
	    else if(c8=='b'||c8=='B') {t1=1;}
		else if(c8=='c'||c8=='C') {t1=2;}
	    if(z[t]==0 || z[t1]==0) {try{throw new RuntimeException("variables not set ");}
	    catch(RuntimeException e){System.out.println(e.getMessage());}}
	    else {String st1="";
			int [][]rrrr=xr.multiply(c7, c8);
			xr.setPolynomial('R',rrrr);
			z[3]=1;
			for(int i=0;i<rrrr.length;i++) {st1+="(";st1+=rrrr[i][0];st1+=",";st1+=rrrr[i][1];st1+=")";
			if(i==rrrr.length-1) {}
			else {st1+=",";}
			}
			System.out.println("Result set in R is : "+ st1);
			}}
		break;
	case "6":
		Scanner sss=new Scanner(System.in);
		System.out.println("Choose defined polynomial to evaluate it: ");
		char c9=sss.next().charAt(0);
		if(c9!='a'&&c9!='A'&&c9!='b'&&c9!='B'&&c9!='c'&&c9!='C'&&c9!='r'&&c9!='R') {
			try{throw new RuntimeException("Invalid input");}
		catch(RuntimeException e){System.out.println(e.getMessage());}}
		else {
			int t=0;
	        if(c9=='a'||c9=='A') {t=0;}
	        else if(c9=='b'||c9=='B') {t=1;}
	    	else if(c9=='c'||c9=='C') {t=2;}
	    	else if(c9=='c'||c9=='C') {t=3;}
	        if(z[t]==0) {try{throw new RuntimeException("variable not set ");}
	        catch(RuntimeException e){System.out.println(e.getMessage());}}
	        else {boolean xer=true;
	        while(xer) {xer=false;
			System.out.println("give a numric value to the point at which the polynomia will be evaluated :");
			String z=s.next();
			if(z.matches("^[a-zA-Z]*$")) {xer=true;System.out.println("invalid input ");}
			else
			{float ru,ruu;
	        ruu=Float.parseFloat(z);
			ru=xr.evaluatePolynomial(c9,ruu);
			System.out.println("The value is : "+ ru);}}}
		}
		break;
	case "7":
		Scanner ccs=new Scanner(System.in);
		System.out.println("Choose defined polynomial to clear it: ");
		char c10=ccs.next().charAt(0);
		if(c10!='a'&&c10!='A'&&c10!='b'&&c10!='B'&&c10!='c'&&c10!='C'&&c10!='r'&&c10!='R') 
		{try{throw new RuntimeException("Invalid input");}
		catch(RuntimeException e){System.out.println(e.getMessage());}}
		else {int t=0;
	    if(c10=='a'||c10=='A') {t=0;}
	    else if(c10=='b'||c10=='B') {t=1;}
		else if(c10=='c'||c10=='C') {t=2;}
		else if(c10=='r'||c10=='R') {t=3;}
	    if(z[t]==0) {try{throw new RuntimeException("variable not set  ");}
	    catch(RuntimeException e){System.out.println(e.getMessage());}}
	    else {
			xr.clearPolynomial(c10);
			z[3]=0;}
		}
		break;
	default:
	{try{throw new RuntimeException("Invalid input");}
	catch(RuntimeException e){System.out.println(e.getMessage());}}
	}
	System.out.println("====================================================================");
	}}//(3,2),(-3,5),(6,0)//(-2,-1),(2,2)
	}