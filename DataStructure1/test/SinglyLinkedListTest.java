package DataStructureOne;

import static org.junit.Assert.*;

import org.junit.Test;

public class SinglyLinkedListTest {

	@Test
	public void add() {
		SinglyLinkedList<String> s = new SinglyLinkedList<>();
		s.add("1");
		s.add("2");
		s.add(2, "3");
		s.add("4");
		s.add(4, "5");
		String[] expected = new String[] {"1","2","3","4","5"};
		assertArrayEquals(expected, s.toArray());  
	}

	@Test
	public void remove() {
		SinglyLinkedList<String> s = new SinglyLinkedList<>();
		s.add("1");
		s.add("2");
		s.add("3");
		String expected = "1";
		assertEquals(expected, s.remove(0));  
	}	
	
	@Test
	public void reverse() {
		SinglyLinkedList<String> s = new SinglyLinkedList<>();
		s.add("1");
		s.add("2");
		s.add("3");
		s.reverse();
		String[] expected = new String[] {"3","2","1"};
		assertArrayEquals(expected, s.toArray());
	}
	
	@Test
	public void sort() {
		SinglyLinkedList<String> s = new SinglyLinkedList<>();
		s.add("2");
		s.add("1");
		s.add("3");
		s.sort();
		String[] expected = new String[] {"1","2","3"};
		assertArrayEquals(expected, s.toArray());
	}
}
