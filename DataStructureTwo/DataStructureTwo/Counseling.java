package DataStructureTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
/**
 * 
 * @author Vinod Patel
 *
 */
public class Counseling {

	private static Logger logger = Logger.getLogger(Counseling.class.getName());
	
	/**
	 * Counseling starts here
	 * @param candidatesQueue
	 * @param collegeList
	 * @param input
	 * @return list of candidate status 
	 */
	public List<String> startCounselling(Queue<Candidates> candidatesQueue,List<College> collegeList, int[] input){
		int inputCounter = 0 ;
		int collegeChoice;
		int totalStudents = candidatesQueue.getSize();
		List<Candidates> candidateList = new ArrayList<Candidates>();
		Candidates[] candidatesArray = new Candidates[totalStudents];
		candidatesArray = candidatesQueue.toArray(candidatesArray);
		/**
		 * sorting candidates on the bases of marks.
		 */
		Arrays.sort(candidatesArray);
		
		//making queue empty
		candidatesQueue.makeEmpty();
		
		//reassigning queue in sorted form
		for(int i = 0 ; i < totalStudents ; i++ ){
			Candidates item = new Candidates(candidatesArray[i].getName(),candidatesArray[i].getMarks());
			candidatesQueue.enqueue(item);
		}
		
		for(int i = 0 ; i < totalStudents ; i++ ){
			Candidates candidate = candidatesQueue.dequeue();
			candidateList.add(candidate);
			logger.info("Call for Student:"+ candidate.getName() +" Remaining Students = "+candidatesQueue.getSize());
			boolean flag = false;
			int j ;
			
			for( j=0 ; j < collegeList.size() ; j++ ){
				if(collegeList.get(j).isSeatAvailable()) {
					flag = true;
					logger.info("Id:"+(j+1)+"College name:"+collegeList.get(j).getName()+"  "+"Available seats:"+collegeList.get(j).getAvailableSeats());
				}
			}
			
			if(flag){
				collegeChoice = input[inputCounter++]-1;
				
				/*For invalid choice*/
				if(((collegeChoice > j)&&(collegeChoice <= 0)) || (collegeList.get(collegeChoice).getAvailableSeats()<=0)) {
					throw new IllegalArgumentException("Wrong Choice");
				}
				candidate.setClgName(collegeList.get(collegeChoice).getName());
				collegeList.get(collegeChoice).updateAvailableSeats();
			}
		}
		
		//results
		List<String> result = new ArrayList<>();
		
		for(Candidates candidate : candidateList){
			result.add("Name: "+candidate.getName()+" "+"College Allotted: "+candidate.getClgName());
		}
		
		return result;	
	}
		
}
	
