package eg.edu.alexu.csd.datastructure.linkedList.cs;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class PolyAppTest {

	@Test
	void test() {
		PolynomialSolver test=new PolynomialSolver();
		int [][] polyA=new int[][]{{3,2},{-3,5},{6,0}};
		int [][] polyB=new int[][]{{-2,-1},{2,2}};
		test.setPolynomial('A',polyA);
		test.setPolynomial('B',polyB);
		String PoA="-3x^5+3x^2+6";
	    String PoB="2x^2-2x^-1";
	    assertEquals(PoA,test.print('A'));
	    assertEquals(PoB,test.print('B'));
	    int [][] polyBc=new int[][]{{3,0},{0,3}};
	    String Poc="3";
	    test.setPolynomial('C', polyBc);
	    assertEquals(Poc,test.print('C'));
	    test.clearPolynomial('C');
	    assertEquals("0",test.print('C'));
	    assertEquals(0f,test.evaluatePolynomial('B', 1));
	    assertEquals(6.02997f,test.evaluatePolynomial('A', 0.1f));
	    assertEquals(6.03003f,test.evaluatePolynomial('A', -0.1f));
	    assertArrayEquals(new int[][]{{-3,5},{5,2},{6,0},{-2,-1}},test.add('A', 'B'));
	    assertArrayEquals(new int[][]{{3,5},{-1,2},{-6,0},{-2,-1}},test.subtract('B', 'A'));
	    assertArrayEquals(new int[][]{{-6,7},{12,4},{12,2},{-6,1},{-12,-1}},test.multiply('A', 'B'));
	    assertArrayEquals(new int[][] {{0,0}},test.subtract('A', 'A'));

	}

}
