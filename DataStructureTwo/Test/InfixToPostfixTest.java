package DataStructureTwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class InfixToPostfixTest {

	@Test
	public void test() {
		String input = "A+B*C-D";
		InfixToPostfix iftpf = new InfixToPostfix(input);
		iftpf.infixtopostfix();
		String expected = "ABC*D-+";
		assertEquals(expected, iftpf.getString());
	}

}
