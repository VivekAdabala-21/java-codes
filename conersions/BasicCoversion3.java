package Practice;
import java.util.*;
public class BasicCoversion3 
{
    public static void main(String[]args)
    {
    	Scanner sc = new Scanner(System.in);

        // Input: Decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // Convert to octal using Integer.toOctalString() method
        String octal = Integer.toOctalString(decimal);

        // Output: Octal number
        System.out.println("Octal equivalent of " + decimal + " is: " + octal);

        sc.close();
	

    }

}
