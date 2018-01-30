import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class TestAssignment1{

	Assignment1 list = new Assignment1();	
	
	@Test
	public void testTowerOfHanoi1(){
		List<String> result = list.towerOfHanoi(1,'A','C','B');
		String[] actuals = result.toArray(new String[0]);
		String[] expecteds = {"Move disk 1 from rod A to rod C"};
		
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testTowerOfHanoi2(){
		List<String> result = list.towerOfHanoi(2,'A','C','B');
		String[] actuals = result.toArray(new String[0]);
		String[] expecteds = {"Move disk 1 from rod A to rod B"
				, "Move disk 2 from rod A to rod C"
				, "Move disk 1 from rod B to rod C"};
		
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testTowerOfHanoi3(){
		List<String> result = list.towerOfHanoi(3,'A','C','B');
		String[] actuals = result.toArray(new String[0]);
		String[] expecteds = {"Move disk 1 from rod A to rod C"
				, "Move disk 2 from rod A to rod B"
				, "Move disk 1 from rod C to rod B"
				, "Move disk 3 from rod A to rod C"
				, "Move disk 1 from rod B to rod A"
				, "Move disk 2 from rod B to rod C"
				, "Move disk 1 from rod A to rod C"};
		
		assertArrayEquals(expecteds, actuals);
	}
}