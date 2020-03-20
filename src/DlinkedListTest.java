package eg.edu.alexu.csd.datastructure.linkedList.cs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ILinkedListTest {

	@Test
	void test() {
		DLinkedList test=new DLinkedList();
		//first index is 1
		test.add("aa");test.add(2, "v3");
		test.add('f');test.add(4,3);
		test.add(55,1);test.add(1,"zx");
		test.add(3,"rtt");
		assertEquals(null,test.get(0));
		assertEquals("zx",test.get(1));
		assertEquals("aa",test.get(2));
		assertEquals("rtt",test.get(3));
		assertEquals("v3",test.get(4));
		assertEquals('f',test.get(5));
		assertEquals(3,test.get(6));
		test.set(5,"qww");
		assertEquals("qww",test.get(5));
		test.set(1,63);
		assertEquals(63,test.get(1));
		Object[] sub=new Object[] {63,"aa","rtt"};
		Object[] subTest=new Object[]{test.sublist(1,3).get(1),test.sublist(1,3).get(2),test.sublist(1,3).get(3)};
		assertArrayEquals(sub,subTest);
		assertEquals(3,test.sublist(1,3).size());
		test.remove(4);
		assertEquals(5,test.size());
		assertEquals("rtt",test.get(3));
		assertEquals("qww",test.get(4));
		assertEquals(true,test.contains(63));
		assertEquals(false,test.contains(0));
		test.clear();
		assertEquals(0,test.size());
		assertEquals(true,test.isEmpty());
		assertEquals(null,test.get(1));
	}

}
