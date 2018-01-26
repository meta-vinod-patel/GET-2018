import static org.junit.Assert.*;
import org.junit.Test;

/*
*
*
*	@author Vinod Patel
*
*/

public class TestAssignment3{
	Assignment3 obj = new Assignment3();
	
	@Test
	public void longestSequence(){
		int inputArray[]	 = {1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int expArray[] 		 = obj.longestSequence(inputArray);
		int actualResult[]   	 = {1,2,4,5,6,7,8,9};
		
		assertArrayEquals(actualResult,expArray);
	}
	
}
