package DataStructureTwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	@Test
	public void testEnqueue() {
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(3);
		queue.enqueue(5);
		queue.enqueue(5);
		Integer[] array = new Integer[3];
		Integer[] expected = new Integer[] {3,5,5};
		assertArrayEquals(expected, queue.toArray(array));
	}	
	
	@Test
	public void testDequeue() {
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(3);
		queue.enqueue(5);
		queue.enqueue(3);
		queue.dequeue();
		queue.dequeue();
		Integer[] array = new Integer[1];
		Integer[] expected = new Integer[] {3};
		assertArrayEquals(expected, queue.toArray(array));
	}
	
	@Test
	public void testSize(){
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.dequeue();
		int expected = 3 ;
		assertEquals(expected, queue.getSize());
	}
	
	@Test
	public void testMakeEmpty(){
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.makeEmpty();
		int expected = 0 ;
		assertEquals(expected,queue.getSize());
	}
	
	@Test
	public void testFront(){
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.dequeue();//removes 1
		queue.dequeue();//removes 2
		
		int expected = 3;
		assertEquals(expected, (int)queue.getFront());
	}

}
