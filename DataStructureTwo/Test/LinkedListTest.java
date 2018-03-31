package DataStructureTwo;

import static org.junit.Assert.*;

import org.junit.Test;

import DataStructureOne.DoublyLinkedList;
import DataStructureOne.SinglyLinkedList;

public class LinkedListTest {

	@Test
	public void add() {
		LinkedList<String> s = new LinkedList<>();
		s.add("1");
		s.add("2");
		s.insertAtPosition("3", 3);
		s.add("4");
		s.insertAtPosition("5", 5);
		String[] expected = new String[] {"1","2","3","4","5"};
		assertArrayEquals(expected, s.toArray());  
	}
	
	@Test
	public void testStart(){
		LinkedList<String> str = new LinkedList<>();
		str.add("1");
		str.add("2");
		str.add("3");
		String expected = "1";
		assertEquals(expected, str.getStart());
	}
	
	@Test
	public void testEnd(){
		LinkedList<String> str = new LinkedList<>();
		str.add("1");
		str.add("2");
		str.add("3");
		String expected = "3";
		assertEquals(expected, str.getEnd());
	}
	
	@Test
	public void testSize(){
		LinkedList<String> str = new LinkedList<>();
		str.add("1");
		str.add("2");
		str.add("3");
		str.add("test");
		int expected = 4;
		assertEquals(expected, str.getSize());
	}
	
	@Test
	public void testElemetByPosition(){
		LinkedList<String> str = new LinkedList<>();
		str.add("1");
		str.add("ter");
		str.add("test");
		str.add("tert");
		String expected = "test";
		assertEquals(expected, str.getElement(3));
	}
	
	@Test
	public void testElementAtPosition(){
		LinkedList<String> str = new LinkedList<>();
		str.add("1");
		str.add("2");
		str.add("4");
		String expected = "3";
		str.insertAtPosition("3", 3);
		assertEquals(expected, str.getElement(3));
	}
	
	@Test
	public void testElementAtPosition1(){
		LinkedList<String> str = new LinkedList<>();
		str.add("1");
		str.add("2");
		str.add("4");
		String[] expected = new String[] {"1","2","3","4"};
		str.insertAtPosition("3", 3);
		assertArrayEquals(expected, str.toArray());
	}
	
	@Test
	public void testDeleteItemAtPosition(){
		LinkedList<String> str = new LinkedList<>();
		str.add("1");
		str.add("2");
		str.add("3");
		str.add("4");
		String[] expected = new String[]{"1","3","4"};
		str.deleteItemAtPosition(2);
		assertArrayEquals(expected,str.toArray());
	}
	
	@Test
	public void testDeleteByItem(){
		LinkedList<String> str = new LinkedList<>();
		str.add("1");
		str.add("2");
		str.add("3");
		str.add("4");
		String[] expected = new String[]{"1","3","4"};
		str.deleteByItem("2");
		assertArrayEquals(expected, str.toArray());
	}

}
