package Practice;
import java.util.Scanner;
public class LCM
{
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input two numbers
	        System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = sc.nextInt();

	        int lcm;

	        // Find the greater number
	        int max = (num1 > num2) ? num1 : num2;

	        // Find LCM using for loop
	        for (lcm = max; ; lcm++) {
	            if (lcm % num1 == 0 && lcm % num2 == 0) {
	                break; // when first common multiple found
	            }
	        }

	        System.out.println("\nLCM of " + num1 + " and " + num2 + " is: " + lcm);

	        sc.close();
	    }
	}
	
	
