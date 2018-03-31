package DataStructureTwo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author Vinod Patel
 *
 */
public class CounsellingTest {
	private Counseling counseling;
	private List<College> collegeList;
	private Queue<Candidates> candidateQueue;
	
	/**
	 * method to initiate the candidate queue and college list
	 */
	@Before
	public void init() {
		Candidates c1 = new Candidates("name1", 80);
		Candidates c2 = new Candidates("name2", 60);
		Candidates c3 = new Candidates("name3", 20);
		Candidates c4 = new Candidates("name4", 90);
		Candidates c5 = new Candidates("name5", 70);
		Candidates c6 = new Candidates("name6", 65);
		Candidates c7 = new Candidates("name7", 34);
		Candidates c8 = new Candidates("name8", 67);
		
		candidateQueue = new Queue<>();
		candidateQueue.enqueue(c1);
		candidateQueue.enqueue(c2);
		candidateQueue.enqueue(c3);
		candidateQueue.enqueue(c4);
		candidateQueue.enqueue(c5);
		candidateQueue.enqueue(c6);
		candidateQueue.enqueue(c7);
		candidateQueue.enqueue(c8);
		
		College clg1 = new College(1, "College1", 2);
		College clg2 = new College(2, "College2", 1);
		College clg3 = new College(3, "College3", 0);
		College clg4 = new College(4, "College4", 1);
		
		collegeList = new ArrayList<College>();
		collegeList.add(clg1);
		collegeList.add(clg2);
		collegeList.add(clg3);
		collegeList.add(clg4);
		counseling = new Counseling();
	}
	
	@Test
	public void testCounselingProcess() {
		int[] input = {1,1,2,4};
		List<String> actual = counseling.startCounselling(candidateQueue, collegeList, input);
		List<String> expected = new ArrayList<>();
		expected.add("Name: name4 College Allotted: College1");
		expected.add("Name: name1 College Allotted: College1");
		expected.add("Name: name5 College Allotted: College2");
		expected.add("Name: name8 College Allotted: College4");
		expected.add("Name: name6 College Allotted: null");
		expected.add("Name: name2 College Allotted: null");
		expected.add("Name: name7 College Allotted: null");
		expected.add("Name: name3 College Allotted: null");
		assertEquals(expected, actual);
 	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test1() {
		int[] input = {1,1,1,4};
		List<String> actual = counseling.startCounselling(candidateQueue, collegeList, input);
		List<String> expected = new ArrayList<>();
		expected.add("Name: name4 College Allotted: College1");
		expected.add("Name: name1 College Allotted: College1");
		expected.add("Name: name5 College Allotted: College2");
		expected.add("Name: name8 College Allotted: College4");
		expected.add("Name: name6 College Allotted: null");
		expected.add("Name: name2 College Allotted: null");
		expected.add("Name: name7 College Allotted: null");
		expected.add("Name: name3 College Allotted: null");
		assertEquals(expected, actual);
 	}
}
