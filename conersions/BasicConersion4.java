package Practice;
import java.util.*;
public class BasicConersion4
{
	 public static void main(String[]args)
	    {
		 Scanner sc = new Scanner(System.in);

	        // Input hexadecimal number
	        System.out.print("Enter a hexadecimal number: ");
	        String hex = sc.nextLine();

	        // Step 1: Convert hexadecimal to decimal
	        int decimal = Integer.parseInt(hex, 16);

	        // Step 2: Convert decimal to octal
	        String octal = Integer.toOctalString(decimal);

	        // Display result
	        System.out.println("Octal equivalent of hexadecimal " + hex + " is: " + octal);

	        sc.close();


    }

}
