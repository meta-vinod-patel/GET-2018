//import java.util.Scanner;
/**
 * 
 * @author vinod patel
 *
 */
public class Assignment1{

/*	//main function to debug the code
		public static void main(String[] arg){
		int numerator;
		int denominator;
		int reminder;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a Numerator : ");	
		numerator =	reader.nextInt();
		
		System.out.println("Enter a Denominator : ");	
		denominator = reader.nextInt();
		
		//recursive function to find reminder 
		reminder = rem(numerator,denominator);
		
		//printing reminder
		System.out.print(reminder);
		
		reader.close();
	}*/
	
	
											//rem() function to find the reminder
	public static int rem(int num, int denom){
		
											//int reminder = num => we can also do this. And all "num" variables will be replaced with "reminder"
		if(num >= denom && denom>0 ){		//Only true if reminder variable or denom variable is >= denon and denom is > 0
			num = rem(num - denom ,denom);	//always return a new reminder value which is decreased	by denom till reminder >= denom
		}
		
		if(denom==0){						//if denominator is 0 than it returns -1 which is our false case
			return -1;
		}
		
											//return the updated value which is at the end a reminder
		return num;
	}
}
