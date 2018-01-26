import java.util.Arrays;
/*
*
*
*	@author Vinod Patel
*
*/
public class Assignment3 {
	
	//to find the longest sequence in an array
	int[] longestSequence(int[] input) {
		int maxCount=1;
		int idx=0;
		
		for(int i=1, count=1; i<input.length; i++) {
			if(input[i-1] < input[i]) {
				count++;	//count variable to count the length of an sub array
			} else {	
				count=1;
			}
			
			if(count > maxCount) {	//if count of an subarray is greater the we will assign the count value to maxCount
				maxCount = count;
				idx = i-maxCount;
			}
			
		}
		
		//to copy the elements from idx (index) to idx+maxCount (index)
		return Arrays.copyOfRange(input,idx+1,(idx+maxCount+1));
	}
}
