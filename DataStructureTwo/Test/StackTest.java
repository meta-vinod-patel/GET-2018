package DataStructureTwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void testPush() {
		Stack<String> stack = new Stack<>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		String[] expected = new String[]{"5","4","3","2","1"};
		assertArrayEquals(expected, stack.toArray());
	}
	
	@Test
	public void testPop(){
		Stack<String> stack = new Stack<>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.pop();
		String[] expected = new String[]{"4","3","2","1"};
		assertArrayEquals(expected, stack.toArray());
	}
	
	@Test
	public void testPeek(){
		Stack<String> stack = new Stack<>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.pop();
		stack.pop();
		stack.push("7");
		String expected = "7";
		assertEquals(expected, stack.peek());
	}

}
