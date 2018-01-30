import static org.junit.Assert.*;
import org.junit.Test;


public class TestAssignment2 {
	
	Assignment2 result = new Assignment2();
	
	@Test
	public void checkSolution1(){
		int inputArray[][] = {
	        	{0, 0, 0, 0},
	            {0, 0, 0, 0},
	            {0, 0, 0, 0},
	            {0, 0, 0, 0}
	        };
		boolean actuals = result.solveNQ(inputArray,0,4);
		boolean expecteds = true;
		
		assertEquals(expecteds,actuals);
	}
	
	@Test
	public void checkSolution2(){
		int inputArray[][] = {
	        	{0, 0, 0, 0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0, 0, 0, 0}
	        };
		boolean actuals = result.solveNQ(inputArray,0,4);
		boolean expecteds = true;
		
		assertEquals(expecteds,actuals);
	}
	
	@Test
	public void checkSolution3(){
		int inputArray[][] = {
	        	{0, 0},
	        	{0, 0}
	        };
		boolean actuals = result.solveNQ(inputArray,0,2);
		boolean expecteds = false;
		
		assertEquals(expecteds,actuals);
	}
}