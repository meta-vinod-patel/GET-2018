import static org.junit.Assert.*;
import org.junit.Test;
/*
*
*
*	@author Vinod Patel
*
*/
public class TestAssignment4{
	
	//creating the object of Assignment4
	Assignment4 obj = new Assignment4();
	
	@Test
	public void FCFS(){
		
		//Array of Arrival time 
		int arrival_time[] = new int[]{1,5,9,25};	
		
		//Array of Job_Size 
		int job_size[]     = new int[]{12,7,2,5};
		
		//Expected result 
		int exp_result[][]   = {{1,0,1,12},{5,8,13,19},{9,11,20,21},{25,0,25,29}};
		
		//Actual result
		int actual_result[][]= obj.FCFS(arrival_time,job_size);
		
		assertArrayEquals(exp_result,actual_result);
		
	}
}
