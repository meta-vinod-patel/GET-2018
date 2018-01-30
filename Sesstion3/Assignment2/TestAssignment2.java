package testassignment;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author Vinod Patel
 *
 */
public class TestAssignment2{
	
	//test case if value is not available in the array.
	@Test
	public  void testBinarySearch() {
		int searchValue = 88; 
		int expected    = 0;
		int[] numArray  = {2,5,8,9,10,77,55};
	    int actual      = Assignment2.binarySearchValue(numArray,searchValue,numArray.length,0); //here 0 is the counter to test the first value and next the index
	    assertEquals(expected, actual);
	}
	
	//test case if value is not available in the array.
	@Test
	public  void testBinarySearch2() {
		int searchValue = 25; 
		int expected    = 12;
		int[] numArray  = {2,5,8,9,10,11,12,13,16,18,20,25,29,31,33,34,39,41};
	    int actual      = Assignment2.binarySearchValue(numArray,searchValue,numArray.length,0); //here 0 is the counter to test the first value and next the index
	    assertEquals(expected, actual);
	}
	
}