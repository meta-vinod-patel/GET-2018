package Assignment2;
import java.util.Scanner;

/**
 * 
 * @author vinod patel
 *
 */

public class Assignment2{
	//main function to debug the functions
		public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter size of the pattern");
		
		//taking the input for the size of our pattern
		int n = reader.nextInt();
		
		//string array to test the output
		String testStrings[] = new String[2*n-1];
		
		//makePyramid() function concatenate the spaces and numbers and create a new string.
		testStrings = makePyramid(n);	

		for(int i=0;i<n;i++){
			System.out.println(testStrings[i]);
		}
		
		reader.close();
	}
	
	
	//makePyramid() function to join space string and number string 
	public static String[] makePyramid(int n){
		String myStrings[] = new String[n];


		for(int i=0; i<n;i++){
			myStrings[i] = space(i,n)+number(i,n);
		}
		
		return myStrings;
	}
	
	//function to print the space
	public static String space(int row, int n){
		String space="";
		
		for(int i=0; i < row ; i++){
			//System.out.print(" ");
			space+=" ";
		}
		
		return space;
		
	}
	
	//function to print the number
	public static String number(int row, int n){
		int i;
		String number = ""; 
		
		for(i=0 ;i< n-row ;i++){
			number+=(i+1);
		}
		
		//return number as a string
		return number;
	}
	
}