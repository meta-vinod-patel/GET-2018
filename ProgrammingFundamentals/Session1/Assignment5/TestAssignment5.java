import static org.junit.Assert.*;
import org.junit.Test;
/*
*
*
*	@author Vinod Patel
*
*
*/
public class TestAssignment5 {
	//creating object of Assignment5
	Assignment5 obj = new Assignment5();
	
	
	//Array is not sorted
	@Test
	public void check_sorted(){
		int input_array[] = {1,2,2,1,1,1,1,1};
		int acctual_op = 0;
		int expected_op = obj.check_sorted(input_array);
		
		assertEquals(acctual_op,expected_op);
	}	

	//Array is sorted in (ascending)
	@Test
	public void check_sorted2(){
		int input_array[] = {1,2,3,4,5};
		int acctual_op = 1;
		int expected_op = obj.check_sorted(input_array);
		
		assertEquals(acctual_op,expected_op);
	}
	
	//Array is sorted in (descending)
	@Test
	public void check_sorted3(){
		int input_array[] = {5,4,3,2,1};
		int acctual_op = 2;
		int expected_op = obj.check_sorted(input_array);
		
		assertEquals(acctual_op,expected_op);
	}
	
	
}
