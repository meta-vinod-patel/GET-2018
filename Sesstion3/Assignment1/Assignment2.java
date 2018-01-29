//import java.util.Scanner;
/**
 * @author vinod patel
 */

public class Assignment2{

   /*public static void main(String[] args) {
    	
    	Scanner reader = new Scanner(System.in);

    	int number1 = reader.nextInt();
    	int number2 = reader.nextInt();
    	
    	int gcd = gcd(number1, number2);

        System.out.println(gcd);
    
        reader.close();
    }*/

    public static int gcd(int n1, int n2)
    {
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
    }
}
