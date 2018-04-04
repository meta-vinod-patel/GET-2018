package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.metacube.ArrayList;

public class ArrayListTest {

	@Test
	public void testAddGet() {
		String expected = "this is test";
		ArrayList<String> test = new ArrayList<String>();
		test.add("this is test");
		assertEquals(expected, test.get(0));
	}

	@Test
	public void testRemove(){
		ArrayList<String> testArray = new ArrayList<>();
		for(int i=0 ; i < 9 ; i++){
			testArray.add("String "+(i+1));
		}
		String expected = "String 9";
		testArray.remove(5);
		assertEquals(expected,testArray.get(7));
	}
	
	@Test
	public void testRemoveObject(){
		ArrayList<String> testArray = new ArrayList<>();
		for(int i=0 ; i < 9 ; i++){
			testArray.add("String "+(i+1));
		}
		String expected = "String 5";
		
		String remove = "String 4";
		testArray.remove(remove);
		assertEquals(expected,testArray.get(3));
	}
	
	@Test
	public void testSort(){	
		ArrayList<String> testArray = new ArrayList<>();	
		for(int i=0 ; i < 5 ; i++){
			testArray.add("String "+(i+1));
		}
		testArray.add("String 7");
		testArray.add("String 6");
		testArray.add("String 9");
		testArray.add("String 8");
		testArray.add("String 12");
		testArray.add("String 11");
		testArray.add("String 10");
		testArray.sort();
		//System.out.println(testArray);
		assertEquals("String 12",testArray.get(3));
		
	}
}
