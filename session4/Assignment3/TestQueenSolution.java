package Assignment4;
import static org.junit.Assert.*;
import org.junit.Test;


public class TestQueenSolution {
	
	QueenSolution result = new QueenSolution();
	
	@Test
	public void checkSolution1(){
		int inputArray[][] = {
	        	{0, 0, 0, 0},
	            {0, 0, 0, 0},
	            {0, 0, 0, 0},
	            {0, 0, 0, 0}
	        };
		int[][] actuals = result.solveNQ(inputArray,0,4);
		int[][] expecteds = {
	        	{0, 0, 1, 0},
	            {1, 0, 0, 0},
	            {0, 0, 0, 1},
	            {0, 1, 0, 0}
	        };
		
		assertArrayEquals(expecteds,actuals);
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
		int[][] actuals = result.solveNQ(inputArray,0,4);
		int[][] expecteds = {
				 {1,  0,  0,  0,  0,  0,  0,  0},
				 {0,  0,  0,  0,  0,  0,  1,  0},
				 {0,  0,  0,  0,  1,  0,  0,  0},
				 {0,  0,  0,  0,  0,  0,  0,  1},
				 {0,  1,  0,  0,  0,  0,  0,  0},
				 {0,  0,  0,  1,  0,  0,  0,  0},
				 {0,  0,  0,  0,  0,  1,  0,  0},
				 {0,  0,  1,  0,  0,  0,  0,  0}
				 };
		
		assertArrayEquals(expecteds,actuals);
	}
	
	@Test
	public void checkSolution3(){
		int inputArray[][] = {
	        	{0, 0},
	            {0, 0}
	        };
		int[][] actuals = result.solveNQ(inputArray,0,4);
		int[][] expecteds = {
				 {0,  0},
				 {0,  0}
				 };
		
		assertArrayEquals(expecteds,actuals);
	}
}
