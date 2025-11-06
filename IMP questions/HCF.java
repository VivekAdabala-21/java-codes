package Practice;
import java.util.Scanner;
public class HCF 
{


	 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input two numbers
	        System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = sc.nextInt();

	        int hcf = 1; // variable to store result

	        // Find the smaller number
	        int smaller = (num1 < num2) ? num1 : num2;

	        // Find HCF using for loop
	        for (int i = 1; i <= smaller; i++) {
	            if (num1 % i == 0 && num2 % i == 0) {
	                hcf = i;
	            }
	        }

	        System.out.println("\nHCF of " + num1 + " and " + num2 + " is: " + hcf);

	        sc.close();
	    }
	}



