import static org.junit.Assert.*;
import org.junit.Test;

public class TestAssignment1 {
	//	Assignment1 obj = new Assignment1();
	
	//to test rem(2,1)
	@Test
	public void testReminder1(){
		int expResult 		 = Assignment1.rem(2,1);
		int accualResult    	 = 0;
		
		assertEquals(accualResult,expResult);
	}		
	
	//to test rem(2,0) =>> if denominator is 0 than it returns -1 which is our false case
	@Test
	public void testReminder2(){
		int expResult 		 = Assignment1.rem(2,0);
		int accualResult   	 = -1;
		
		assertEquals(accualResult,expResult);
	}		
	
	//to test rem(100,3)
	@Test
	public void testReminder3(){
		int expResult 		 = Assignment1.rem(100,3);
		int accualResult   	 = 1;
		
		assertEquals(accualResult,expResult);
	}	
	

}