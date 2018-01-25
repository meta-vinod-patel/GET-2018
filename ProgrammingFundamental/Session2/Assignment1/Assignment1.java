package Assignment2;

//import java.util.Scanner;

public class Assignment1{
	//main function to debug the functions
	/*	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter size of the pattern");
		
		//taking the input for the size of our pattern
		int n = reader.nextInt();
		
		//string array to test the output
		String testStrings[] = new String[2*n-1];
		
		//printPyramid() function concatenate the spaces and numbers and create a new string.
		testStrings = printPyramid(n);	

		for(int i=0;i<2*n-1;i++){
			System.out.println(testStrings[i]);
		}
		
		reader.close();
	}*/
	
	
	//makePyramid() function to join space string and number string 
	public static String[] makePyramid(int n){
		String myStrings[] = new String[2*n-1];


		for(int i=0; i<((n*2)-1);i++){
			myStrings[i] = space(i,n)+number(i,n);
		}
		
		return myStrings;
	}
	
	//function to print the space
	public static String space(int row, int n){
		String space="";
		if(row<n){	//decreasing spaces
			for(int i=0; i < (n) - (row+1) ; i++){
				//System.out.print(" ");
				space+=" ";
			}
		}else{		//increasing spaces
			for(int i=0;i<(row-n+1);i++){
				space+=" ";
			}
		}
		
		return space;
		
	}
	
	//function to print the number
	public static String number(int row, int n){
		int i;
		String number = ""; 
		if(row<n){
			for(i=0;i<=row&&i<n;i++){
				//System.out.print(i+1);
				number+=i+1;
			}
			while(--i!=0){
				//System.out.print(i);
				number+=i;
			}
		}else{
			for(i=1;i<(n-(row%n));i++){	//the formula n-(row%n) 
				//System.out.print(i);
				number+=i;
			}
			--i;
			while(--i!=0){
				//System.out.print(i);
				number+=i;
			}
		}
		
		//return number as a string
		return number;
	}
	
}