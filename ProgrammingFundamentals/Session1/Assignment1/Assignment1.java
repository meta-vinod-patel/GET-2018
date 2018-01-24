/*
*
*  @author vinod patel
*
*/
public class Assignment1{
	
	/*	public static void main(String[] args){
			int x;
			Scanner binary_value = new Scanner(System.in);
			
			System.out.println("Enter the value: ");
			int value = binary_value.nextInt();
			
			x = binary_to_octal(value);
			
			System.out.println(x);
			
			binary_value.close();
	}*/
	
	public static int binary_to_octal(int binary_value){		//function to change binary values to octal
		 
		int octalNumber = 0;
		int decimalNumber = 0;
		int i = 0;

	        //converting binary to decimal
		while(binary_value != 0)
	        {
	            decimalNumber += (binary_value % 10) * Math.pow(2, i); // if binary value is 1001 then math.pow function have 2^0+2^3
	            ++i;
	            binary_value /= 10; //to find the reminder
	        }

	        i = 1;

		//converting decimal to octal
	        while (decimalNumber != 0)
	        {
	            octalNumber += (decimalNumber % 8) * i;
	            decimalNumber /= 8;
	            i *= 10;
	        }

		// return octal number	        
		return octalNumber;

	}
}

