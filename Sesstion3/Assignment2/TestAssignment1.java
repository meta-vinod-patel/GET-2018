import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 * @author Vinod Patel
 *
 */

public class TestAssignment1 {
	
	// test when value is in the array 
	@Test
	public void searchValueTest() {
		int searchValue = 10; 
		int expected    = 5;
		int[] numArray  = {2,5,8,9,10,77,55};
	    int actual      = Assignment1.linearSearchValue(numArray,searchValue,0); //here 0 is the counter to test the first value and next the index
	    assertEquals(expected, actual);
	}
	
	// test when value is not in the array 
	@Test
	public void searchValueTest2() {
		int searchValue = 88; 
		int expected    = 0;
		int[] numArray  = {2,5,8,9,10,77,55};
	    int actual      = Assignment1.linearSearchValue(numArray,searchValue,0); //here 0 is the counter to test the first value and next the index
	    assertEquals(expected, actual);
	}
	
}