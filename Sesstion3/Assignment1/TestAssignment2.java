import static org.junit.Assert.*;
import org.junit.Test;


/**
 * @author vinod patel
 */
public class TestAssignment2{

	@Test
	public void testgcd(){
		int expResult		 = Assignment2.gcd(54,24);
		int accualResult  	 = 6;
		
		assertEquals(accualResult,expResult);
	}	
	
}