package eg.edu.alexu.csd.datastructure.linkedList.cs;

import java.awt.Point;

public class PolynomialSolver {

	private singleLinkedList A=new singleLinkedList();
	private singleLinkedList B=new singleLinkedList();
	private singleLinkedList C=new singleLinkedList();
	private singleLinkedList R=new singleLinkedList();

	
	public singleLinkedList sortList(singleLinkedList a) {
		  Point z[]=new Point[a.size()];
			 for(int i=0;i<z.length;i++) {
				 z[i]=(Point) a.get(i);
			 }
			 boolean flag=true;Point temp0;
				while(flag) {
					flag=false;
					for(int i=0;i<z.length-1;i++) {
						if(z[i+1].y>z[i].y) {flag=true;
						temp0=z[i];
						z[i]=z[i+1];
						z[i+1]=temp0;}
					}
				}
				singleLinkedList temp=new singleLinkedList();
			for (int i=0; i<z.length; i++) {
				temp.add(z[i]);
			}
				
			return temp; 	
	}
	
	
	
	
	public int[][] toArray(singleLinkedList a)
	{
		int [][] arr = new int [a.size()][2];
		for (int i = 0 ; i < a.size() ;i++){
		for (int j = 0 ; j < 2;j++)
			{
				java.awt.Point p = (Point) a.get(i);
				arr[i][0] = p.x;
				arr[i][1] = p.y;
			      }
          }
		return arr;
	}
	
	
	
	
	public singleLinkedList addingSameExponents(singleLinkedList A) {
	singleLinkedList tmp=new singleLinkedList() ;
	java.awt.Point p;
	 
	int y=-999999999,temp;
	 for(int i=0; i<A.size(); i++) {
	    	p=(java.awt.Point)A.get(i);
		     temp=p.y;
		    if(temp>y) {
		    	y=temp;
		    }
	 
	 }
	 int z=999999999;
	 for(int i=0; i<A.size(); i++) {
	    	p=(java.awt.Point)A.get(i);
		     temp=p.y;
		    if(temp<z) {
		    	z=temp;
		    }
	 
	 }
	 int x;
	 for(int j=y; j>=z; j--) {
		 x=0;
		 for(int i=0; i<A.size(); i++) {
		    	p=(java.awt.Point)A.get(i);
			     temp=p.y;
			    if(temp==j) {
			        x+=p.x; 
 			    }}
		 if(x!=0) {
			 p=new Point(x,j);
			 tmp.add(p);
		 }
		  
	 }    
		
	
  return tmp;

}


	
	public void setPolynomial(char poly, int[][] terms) {
		// TODO Auto-generated method stub
		singleLinkedList temp = new singleLinkedList ();
		Point p;
		for (int i = 0;i < terms.length;i++)
		{
			p = new Point(terms[i][0],terms[i][1]);		
			
	    	//System.out.print(p.y);

			temp.add(p);
		}
	    if(poly=='a' || poly=='A') {
	    	this.A=addingSameExponents(temp);
	    }
	    else if(poly=='B' || poly=='b') {
	    	B=addingSameExponents(temp);
	    }
	    else if(poly=='C' || poly=='c') {
	    	C=addingSameExponents(temp);
	    }
	    else if(poly=='R' || poly=='R') {
	    	R=addingSameExponents(temp);
	    }
	    else {
	    	System.out.println("enter a valid choice");
	    }
	    

    	

	
	
	}

	public String print(char poly) {
		String st ="";
		singleLinkedList tmp=null;
		
		
		 if(poly=='a' || poly=='A') {
		    tmp=A;
		      }
		    else if(poly=='B' || poly=='b') {
		    tmp=B;
		    }
		    else if(poly=='C' || poly=='c') {
		    	tmp=C;
		    }
		    else if(poly=='r' || poly=='R') {
		    	tmp=R;
		    }
		    else {
		    	System.out.println("enter a valid choice");
		    }
		if(tmp!=null) {
        Point z[]=new Point[tmp.size()];
		 for(int i=0;i<z.length;i++) {
			 z[i]=(Point) tmp.get(i);
		 }
		 boolean flag=true;Point temp0;
			while(flag) {
				flag=false;
				for(int i=0;i<z.length-1;i++) {
					if(z[i+1].y>z[i].y) {flag=true;
					temp0=z[i];
					z[i]=z[i+1];
					z[i+1]=temp0;}
				}
			}
		 
		for (int i = 0 ; i < z.length ;i++) {
			Point p = z[i];

			if(p.x!=0) {
				if(st=="") {
					if(p.y!=0) {
					    if(p.x!=1 && p.y!=1) {st+=p.x+"x^"+p.y;}
						else if(p.x==1 && p.y!=1) {st+="x^"+p.y;} 
						else if(p.x!=1 && p.y==1) {st+=p.x+"x";}
						else if(p.x==1 && p.y==1) {st+="x";}
					}
					else {
						st+=p.x;
						
					}
				}
				else {
					if(p.y!=0) {
						if(p.x>0) {
						    if(p.x!=1 && p.y!=1) {st+="+"+p.x+"x^"+p.y;}
							else if(p.x==1 && p.y!=1) {st+="+"+"x^"+p.y;} 
							else if(p.x!=1 && p.y==1) {st+="+"+p.x+"x";;}
							else if(p.x==1 && p.y==1) {st+="+"+"x";}
							
						}
						else {
							if(p.x!=1 && p.y!=1) {st+=p.x+"x^"+p.y;}
							else if(p.x==1 && p.y!=1) {st+="x^"+p.y;} 
							else if(p.x!=1 && p.y==1) {st+=p.x+"x";;}
							else if(p.x==1 && p.y==1) {st+="-x";}
						
						}
					}
					else {
						if (p.x>0) { st+="+"+p.x;}
						else {st+=p.x;}
					}
				}
			
			
		}
			}
		}
		if(st=="") {
			st+=0;
		}
		
		return st;
    
	}

	
	public void clearPolynomial(char poly) {
		// TODO Auto-generated method stub
		   if(poly=='a' || poly=='A') {
		    	A.clear();
		    }
		    else if(poly=='B' || poly=='b') {
		    	B.clear();
		    }
		    else if(poly=='C' || poly=='c') {
		    	C.clear();
		    }
		    else if(poly=='r' || poly=='R') {
		    	R.clear();
		    }
		    else {
		    	System.out.println("enter a valid choice");
		    }
	}

	
	public float evaluatePolynomial(char poly, float value) {
		// TODO Auto-generated method stub
		singleLinkedList tmp=null;;
		java.awt.Point p;

		float answer=0;
		 if(poly=='a' || poly=='A') {
		    tmp=A;
		      }
		    else if(poly=='B' || poly=='b') {
		    tmp=B;
		    }
		    else if(poly=='C' || poly=='c') {
		    	tmp=C;
		    }
		    else if(poly=='r' || poly=='R') {
		    	tmp=R;
		    }
		    else {
		    	System.out.println("enter a valid choice");
		    }
		 if(tmp==null) {}
				
		 
		 for (int i = 0 ; i < tmp.size() ;i++) {
				p = (java.awt.Point) tmp.get(i);
				answer+=p.x *Math.pow(value, p.y);
		 }
		 return answer;
	}

	
	public int[][] add(char poly1, char poly2) {
		// TODO Auto-generated method stub
		singleLinkedList tmp=null,tmp2=null;
		if(poly1=='a' || poly1=='A') {
		    tmp=A;
		      }
		    else if(poly1=='B' || poly1=='b') {
		    tmp=B;
		    }
		    else if(poly1=='C' || poly1=='c') {
		    	tmp=C;
		    }
		if(poly2=='a' || poly2=='A') {
		    tmp2=A;
		      }
		    else if(poly2=='B' || poly2=='b') {
		    tmp2=B;
		    }
		    else if(poly2=='C' || poly2=='c') {
		    	tmp2=C;
		    }
	
		R.clear();
	if(tmp==null || tmp2==null) {
		return null;}
	
		Point t =new Point();
for(int i=0; i<tmp2.size(); i++) {
	t=(Point) tmp2.get(i);
	
	R.add(t);
}		
		//System.out.print(R.get(3));
		int flag=0;
		Point p,p1,p3=new Point();
		for(int i=0; i<tmp.size(); i++) {
		    flag=0; 
			p=(Point) tmp.get(i);
			for(int j=0; j<R.size(); j++) {
			 p1=(Point) R.get(j);
			 if(p.y==p1.y) {
				 p3=new Point((p.x+p1.x),p.y);
				 R.set(j, p3);
			   flag=1;
			   break;
			 }}
			 if(flag==0) {
				 R.add(p);
			 }}
		
			  R=addingSameExponents(R);
		
		
		R=sortList(R);
	
     int [][] arr=toArray(R);
	
     return arr;
	}
	

	
	public int[][] subtract(char poly1, char poly2) {
		// TODO Auto-generated method stub
		
		singleLinkedList tmp=null,tmp2=null;
		if(poly1=='a' || poly1=='A') {
		    tmp=A;
		      }
		    else if(poly1=='B' || poly1=='b') {
		    tmp=B;
		    }
		    else if(poly1=='C' || poly1=='c') {
		    	tmp=C;
		    }
		if(poly2=='a' || poly2=='A') {
		    tmp2=A;
		      }
		    else if(poly2=='B' || poly2=='b') {
		    tmp2=B;
		    }
		    else if(poly2=='C' || poly2=='c') {
		    	tmp2=C;
		    }


		
		R.clear();
		if(tmp==null || tmp2==null) {
			return null;}
		
		if(tmp2==tmp) {
	Point x=new Point(0,0);
	R.add(x);
}
		
else {	
		Point t;
for(int i=0; i<tmp2.size(); i++) {
	t=(Point) tmp2.get(i);
   t=new Point(-t.x,t.y);
	R.add(t);
}
int  flag=0;
		Point p,p1,p3=new Point();
		
		for(int i=0; i<tmp.size(); i++) {
		    flag=0; 
			p=(Point) tmp.get(i);
			for(int j=0; j<R.size(); j++) {
			 p1=(Point) R.get(j);
			 if(p.y==p1.y) {
				 p3=new Point((p.x+p1.x),p.y);
				 R.set(j, p3);
			   flag=1;
			   break;
			 }}
			 if(flag==0) {
				
				 R.add(p);
			 }}
		
			  R=addingSameExponents(R);
		  /// returning tmp2 to it's original value
			  }
	
R=sortList(R);
     int [][] arr=toArray(R);
    
     
     return arr;
		
	
	}

	
	public int[][] multiply(char poly1, char poly2) {
		// TODO Auto-generated method stub
				singleLinkedList tmp=null,tmp2=null;
				if(poly1=='a' || poly1=='A') {
				    tmp=A;
				      }
				    else if(poly1=='B' || poly1=='b') {
				    tmp=B;
				    }
				    else if(poly1=='C' || poly1=='c') {
				    	tmp=C;
				    }
				if(poly2=='a' || poly2=='A') {
				    tmp2=A;
				      }
				    else if(poly2=='B' || poly2=='b') {
				    tmp2=B;
				    }
				    else if(poly2=='C' || poly2=='c') {
				    	tmp2=C;
				    }
				if(tmp==null || tmp2==null) {
					return null;}
				
				Point []k=new Point[tmp.size()*tmp2.size()];int v=0;int min=1000,max=-1000;
				Point []kr=new Point[tmp.size()*tmp2.size()];
		        Point count=new java.awt.Point(0,0);
				Point c;Point c1;Point c2;boolean flag=false;int z=0;
				for(int i=0;i<tmp.size();i++) {
					for(int j=0;j<tmp2.size();j++) {
						c1=(java.awt.Point)tmp.get(i);c2=(java.awt.Point)tmp2.get(j);
						c= new java.awt.Point((c1.x*c2.x),(c1.y+c2.y));
						if(c.y<min) {min=c.y;}if(c.y>max) {max=c.y;}
						k[v++]=c;
					}
				}
				for(int i=min;i<(max)+1;i++) {count=new java.awt.Point(0,0);flag=false;
					for(int j=0;j<k.length;j++) {if(k[j].y==i) {if(k[j].x!=0)flag=true;
					   count.x+=k[j].x;count.y=k[j].y;
					}
					}
					if(flag)
					{if(count.x!=0) {kr[z++]=count;}}
				}
				int [][]kz=new int[z][2];
				for(int i=0;i<z;i++) {kz[i][0]=kr[i].x;kz[i][1]=kr[i].y;}
				flag=true;int temp0=0,temp1=0;
				while(flag) {
					flag=false;
					for(int i=0;i<kz.length-1;i++) {
						if(kz[i+1][1]>kz[i][1]) {flag=true;
						temp0=kz[i][0];temp1=kz[i][1];
						kz[i][0]=kz[i+1][0];kz[i][1]=kz[i+1][1];
						kz[i+1][0]=temp0;kz[i+1][1]=temp1;}
					}
				}
				Point q;
				singleLinkedList tempq = new singleLinkedList ();
				for(int i=0;i<kz.length;i++) {q=new Point(kz[i][0],kz[i][1]);
				tempq.add(q);}
				R=tempq;
				return kz;
}}
