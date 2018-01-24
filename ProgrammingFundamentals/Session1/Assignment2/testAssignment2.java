import static org.junit.Assert.*;
import org.junit.Test;
/*
*
*
*	@author Vinod Patel
*
*
*/
public class testAssignment2 {

	Assignment2 obj = new Assignment2();
	
	// function to test remove duplicate elements from an array	
	@Test
	public void removeDuplicate() {
		int[] x  = {2,2,3,4,4};
		int[] a  = obj.removeDuplicate(x);
		int[] ex = {2,3,4};

		assertArrayEquals(ex,a);
	}

}
