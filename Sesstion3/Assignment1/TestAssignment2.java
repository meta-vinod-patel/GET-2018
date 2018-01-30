import static org.junit.Assert.*;
import org.junit.Test;


/**
 * @author vinod patel
 */
public class TestAssignment2{

	//test case for 54 and 24
	@Test
	public void testgcd(){
		int expResult		 = Assignment2.gcd(54,24);
		int accualResult  	 = 6;
		
		assertEquals(accualResult,expResult);
	}	
	
	//test case for 2 and 1
	@Test
	public void testgcd2(){
		int expResult		 = Assignment2.gcd(2,1);
		int accualResult  	 = 1;
		
		assertEquals(accualResult,expResult);
	}
	
	//test case for 12 and 18
	@Test
	public void testgcd3(){
		int expResult		 = Assignment2.gcd(12,18);
		int accualResult  	 = 6;
		
		assertEquals(accualResult,expResult);
	}
	
	//test case for 100 and 3
	@Test
	public void testgcd4(){
		int expResult		 = Assignment2.gcd(100,3);
		int accualResult  	 = 1;
		
		assertEquals(accualResult,expResult);
	}	
	
}
