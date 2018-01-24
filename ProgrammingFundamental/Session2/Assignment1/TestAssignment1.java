package Assignment2;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssignment1 {
//	Assignment1 obj = new Assignment1();
	
	//for pattern size 2
	@Test
	public void testPyramidPattern1(){
		String expResult[] 		 = Assignment1.makePyramid(2);
		String accualResult[]   = {" 1","121"," 1"};
		
		assertArrayEquals(accualResult,expResult);
	}	
	
	//for pattern size 3
	@Test
	public void testPyramidPattern2(){
		String expResult[] 		 = Assignment1.makePyramid(3);
		String accualResult[]   = {"  1"," 121","12321"," 121","  1"};
		
		assertArrayEquals(accualResult,expResult);
	}

}