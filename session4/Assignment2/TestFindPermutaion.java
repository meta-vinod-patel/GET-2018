import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TestFindPermutaion {
	
/*	@Test
	public void testcase1(){
		String str = "ab";
		List<String> result = FindPermutaion.permuteHelper(str,"");
		String[] actuals 	= result.toArray(new String[0]);
		String[] expecteds  = {
				"ab",
				"ba"
		};
		
		assertArrayEquals(expecteds, actuals);
	}*/
	
	@Test
	public void testcase2(){
		String str = "abc";
		List<String> result = FindPermutaion.permuteHelper(str,"");
		String[] actuals 	= result.toArray(new String[0]);
		String[] expecteds  = {
				"abc",
				"acb",
				"bac",
				"bca",
				"cab",
				"cba"

		};
		
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testcase3(){
		String str = "wood";
		List<String> result = FindPermutaion.permuteHelper(str,"");
		String[] actuals 	= result.toArray(new String[0]);
		String[] expecteds  = {
				"wood",
"wodo",
"wdoo",
"owod",
"owdo",
"oowd",
"oodw",
"odwo",
"odow",
"dwoo",
"dowo",
"doow"

		};
		
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testcase4(){
		String str = "abcd";
		List<String> result = FindPermutaion.permuteHelper(str,"");
		String[] actuals 	= result.toArray(new String[0]);
		String[] expecteds  = {
				"abcd",
"abdc",
"acbd",
"acdb",
"adbc",
"adcb",
"bacd",
"badc",
"bcad",
"bcda",
"bdac",
"bdca",
"cabd",
"cadb",
"cbad",
"cbda",
"cdab",
"cdba",
"dabc",
"dacb",
"dbac",
"dbca",
"dcab",
"dcba"


		};
		
		assertArrayEquals(expecteds, actuals);
	}
}
