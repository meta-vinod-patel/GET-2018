import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 * @author vinod patel
 *
 */
public class TestAssignment3{
	
	Assignment3 obj = new Assignment3();
	
	@Test
	public void largestDigitTest(){
		int expected = 6;
		int actual   = obj.largestDigit(1234556);
		assertEquals(expected,actual);
	}
	
	@Test
	public void largestDigitTest2(){
		int expected = 2;
		int actual   = obj.largestDigit(2);
		assertEquals(expected,actual);
	}
	
	@Test
	public void largestDigitTest3(){
		int expected = 0;
		int actual   = obj.largestDigit(0000);
		assertEquals(expected,actual);
	}
	
}
