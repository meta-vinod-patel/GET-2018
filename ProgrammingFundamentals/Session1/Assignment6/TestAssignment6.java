import static org.junit.Assert.*;
import org.junit.Test;
/*
*
*
*	@author Vinod Patel
*
*/
public class TestAssignment6{
	
	//creating object for assignment6
	Assignment6 obj = new Assignment6();
	
	@Test
	public void mergin_test(){

		int input_array1[] = {2,4,5,7,8};
		int array1_length  = input_array1.length;
		
		int input_array2[] = {1,3,6,9,10};
		int array2_length  = input_array2.length;
		int output_array[] = new int[array1_length + array1_length];
		
		int acctual_op[] = {1,2,3,4,5,6,7,8,9,10};
		int expected_op[] = obj.join(input_array1,array1_length,input_array2,array2_length,output_array);
		
		assertArrayEquals(acctual_op,expected_op);
	}
	
}
