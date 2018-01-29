import java.util.Scanner;
/**
 * 
 * @author Vinod Patel
 *
 */
public class Assignment2 {
	//main function to debug the code
	public static void main(String[] arg) {
		
		Scanner reader = new Scanner(System.in);
		
		//test variable to test that value found in the array or not.
		int position;
		//to begin the searching 
		//int counter=0;
		//Array of integer values.
		int[] numArray = new int[] {2,5,8,9,10,11,12,13,16,18,20,25,29,31,33,34,39,41}; 
		//to pass the size of the sub-array when (left+right)/2
		int right = numArray.length;
		//output message
		System.out.println("Enter value to be Search : ");
		
		//value to be search in the array
		int searchValue = reader.nextInt();
		
		//calling of the function binarySearchValue() to find the value. if it returns 0 means not found else found
		position = binarySearchValue(numArray,searchValue,right,0);
		
		System.out.print(position);
		
		reader.close();
	}
	
	public static int binarySearchValue(int[] numArray,int searchValue, int right, int left) {
		
		int middle = left + (right-left)/2;
		int position=0;
		
		if(left<right) {
			if(numArray[middle]==searchValue) {
				return middle+1;
			}
		
			if(numArray[middle]>searchValue) {
				right = middle ;
			}else {
				left = middle 	+ 1; 
			}
			
			position = binarySearchValue(numArray,searchValue,right,left);
		}
		
		
		//testing with the while loop
		/*while(left<right){
			middle = (left+right)/2;
			if(numArray[middle]==searchValue) {
				return middle+1;
			}
			
			if(numArray[middle]>searchValue) {
				right = middle - 1;
			}else {
				left = middle + 1; 
			}
		
		}*/
		
		return position;
	}
	
}