//import java.util.Scanner;

public class Assignment3 {
	//to test the code
	
	/*	public void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		int value;
		//we will search in this to find the largest number
		value = reader.nextInt();
		
		value = largestDigit(value);
		System.out.println(value);
		reader.close();
	}*/
	
	public int largestDigit(int value){
		
		int temp;//stores the temporary max value.
		int max=0;//stores the maximum value
		
		temp = value%10;//find the reminder as the last value 
		if(value>0){
			max = largestDigit(value/10);	// update the parameter with value/10
			
			if(temp>max){	//update the maximum if temp is > max
				max=temp;
			}
		}
		
		return max; // return the current maximum value

	}
}