package eg.edu.alexu.csd.datastructure.linkedList.cs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class singleListTest {

	@Test
	void test() {

	singleLinkedList l =new singleLinkedList();
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(19);
	l.add(12);
	l.add(0);
	
	assertEquals(1,l.get(0));
	assertEquals(2,l.get(1));
	assertEquals(3,l.get(2));
	assertEquals(19,l.get(3));
	assertEquals(12,l.get(4));
	assertEquals(0,l.get(5));
	assertEquals(null,l.get(14));
	
	l.add(3, 999);
	
	//(1,2,3,999,19,12,0)
	assertEquals(1,l.get(0));
	assertEquals(2,l.get(1));
	assertEquals(3,l.get(2));
	assertEquals(999,l.get(3));
	assertEquals(19,l.get(4));
	assertEquals(12,l.get(5));
	assertEquals(0,l.get(6));

	
	l.set(5, "try");
	//(1,2,3,999,19,"try",0)
	assertEquals(1,l.get(0));
	assertEquals(2,l.get(1));
	assertEquals(3,l.get(2));
	assertEquals(999,l.get(3));
	assertEquals(19,l.get(4));
	assertEquals("try",l.get(5));
	assertEquals(0,l.get(6));

	l.set(5, 88);
	////(1,2,3,999,19,88,0)
	singleLinkedList m=(singleLinkedList)l.sublist(1, 4);
	
	
	assertEquals(4,m.size());
	assertEquals(2,m.get(0));
	assertEquals(3,m.get(1));
	assertEquals(999,m.get(2));
	assertEquals(19,m.get(3));
////(1,2,3,19,88,0)
     
	l.remove(3);
	assertEquals(6,l.size());
    m.remove(1);
	assertEquals(3,m.size());
	
	
	assertEquals(false,l.contains(888));

	assertEquals(true,l.contains(88));
	assertEquals(false,l.isEmpty());

	
	l.clear();
	
	assertEquals(true,l.isEmpty());

	
	}

}
