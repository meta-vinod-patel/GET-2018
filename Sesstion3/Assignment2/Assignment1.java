//import java.util.Scanner;

/**
*
*
*	@author Vinod Patel
*
*/

public class Assignment1{
	
	// main funtion to debug the code
	/*public static void main(String[] arg) {
		
		Scanner reader = new Scanner(System.in);
		
		//test variable to test that value found in the array or not.
		int test;
		//to begin the searching 
		int counter=0;
		//Array of integer values.
		int[] numArray = new int[] {2,5,8,9,10,77,55}; 
		
		//output message
		System.out.println("Enter value to be Search : ");
		
		//value to be search in the array
		int searchValue = reader.nextInt();
		
		//calling of the function linearSearchValue() to find the value. if it returns 0 means not found else found
		test = linearSearchValue(numArray,searchValue,counter);
		
		System.out.print(test);
		
		reader.close();
	}*/
	
	public static int linearSearchValue(int[] numArray,int searchValue,int counter) {
		
		int flag=0;	//flag to test that weather we found the value or not
		
		if(counter<numArray.length) {
			if(searchValue == numArray[counter]) {
				flag = counter+1;	//if we found the value we will the position of the number in the array
			}else {
				flag = linearSearchValue(numArray,searchValue,++counter); //if we not found the value we call the function again by increasing the counter value
			}
		}
		return flag; //if we not found the value we will return 0 which indicates that we have not found the value. 
	}
	
}
