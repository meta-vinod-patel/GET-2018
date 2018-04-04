package DataStructureOne;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoublyLinkedListTest {

	@Test
	public void add() {
		DoublyLinkedList<String> s = new DoublyLinkedList<>();
		s.add("1");
		s.add(0, "2");
		s.add("3");
		String[] expected = new String[] {"2","1","3"};
		assertArrayEquals(expected, s.toArray());
	}
	
	@Test
	public void removeAElement() {
		DoublyLinkedList<String> s = new DoublyLinkedList<>();
		s.add("1");
		s.add("2");
		s.add("3");
		String expected = "1";
		assertEquals(expected, s.remove(0));  
	}
	
	@Test
	public void remove() {
		DoublyLinkedList<String> s = new DoublyLinkedList<>();
		s.add("1");
		s.add("2");
		s.add("3");
		boolean expected = true;
		assertEquals(expected, s.remove("2"));  
	}
	
	@Test
	public void getElement(){
		DoublyLinkedList<String> s = new DoublyLinkedList<>();
		s.add("1");
		s.add("2");
		s.add("3");
		String expected = "1";
		assertEquals(expected, s.getElement(0));  
	}
	
	@Test
	public void reverse() {
		DoublyLinkedList<String> s = new DoublyLinkedList<>();
		s.add("1");
		s.add("2");
		s.add("3");
		s.reverse();
		String[] expected = new String[] {"3","2","1"};
		assertArrayEquals(expected, s.toArray());
	}
	
	@Test
	public void sort() {
		DoublyLinkedList<String> s = new DoublyLinkedList<>();
		s.add("2");
		s.add("1");
		s.add("3");
		s.sort();
		String[] expected = new String[] {"1","2","3"};
		assertArrayEquals(expected, s.toArray());
	}

}
