import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author Vinod Patel
 *
 */

public class TestAssignment1{
	
	Assignment1 obj = new Assignment1();
	
	//test case when values are unsorted in the array
	@Test
	public  void quickSortTest1(){
		int[] testArray     = {2,5,8,9,10,77,55,11};
		int[] expResult 	= obj.quickSort(testArray,0,7);
		int[] accualResult  = {2,5,8,9,10,11,55,77};
		
		assertArrayEquals(accualResult,expResult);
	}	
	
	//test case when no values are present in the array
	@Test
	public  void quickSortTest2(){
		int[] testArray     = {};
		int[] expResult 	= obj.quickSort(testArray,0,0);
		int[] accualResult  = {};
		
		assertArrayEquals(accualResult,expResult);
	}
}