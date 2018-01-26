import java.util.*;
/**
 *
 *
 *	@author  Vinod Patel
 *
 */
public class Assignment2 {
	// Removing duplicate elements from Array
	public int[] removeDuplicate(int input[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();//creating dynamic array to store non duplicate elements
		
		for(int i=0; i<input.length; i++) {
			boolean flag=true;//checking non duplicacy of an element in arrays
			for(int j=0; j<al.size(); j++) {
				if(input[i] == (int)al.get(j)) {
					flag=false;
					break;
				}
			}
			
			if(flag) {
				al.add(input[i]);
			}
		}
		
		// ArrayList to array
		int[] res = new int[al.size()];
		for(int i=0; i<res.length; i++) {
			res[i] = al.get(i).intValue();
		}
		
		return res;
	}
}
