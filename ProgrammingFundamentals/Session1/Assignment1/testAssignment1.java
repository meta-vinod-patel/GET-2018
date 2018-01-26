/**
 * 
 * @author Vinod Patel
 *
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class TestAssignment {

	Assignment1 obj = new Assignment1();
	
	//to test the actual result and expected result	
	@Test
	public void maintest() {
		int binary = obj.binary_to_octal(11001000);
		assertEquals(310,binary);
	}
	
	//to test the actual result and expected result for allzero
	@Test
	public void allZero() {
		assertEquals(0, obj.binary_to_octal(000));
	}

}
