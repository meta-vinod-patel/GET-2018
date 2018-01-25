package Assignment2;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssignment2 {
//	Assignment1 obj = new Assignment1();
	
	//for pattern size 5
	@Test
	public void testPyramidPattern1(){
		String expResult[] 		 = Assignment2.makePyramid(5);
		String accualResult[]   = {"12345"," 1234","  123","   12","    1"};
		
		assertArrayEquals(accualResult,expResult);
	}	
	
	//for pattern size 3
	@Test
	public void testPyramidPattern2(){
		String expResult[] 		 = Assignment2.makePyramid(3);
		String accualResult[]   = {"123"," 12","  1"};
		
		assertArrayEquals(accualResult,expResult);
	}

}