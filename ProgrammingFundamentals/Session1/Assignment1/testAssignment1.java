/**
 * 
 * @author Vinod Patel
 *
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class TestAssignment {
	
	//to test the actual result and expected result	
	@Test
	public void maintest() {
		int binary = Assignment1.binary_to_octal(11001000);
		assertEquals(310,binary);
	}
	
	//to test the actual result and expected result for allzero
	@Test
	public void allZero() {
		assertEquals(0, Assignment1.binary_to_octal(000));
	}

}
