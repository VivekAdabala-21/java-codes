package Practice;
import java.util.Scanner;
public class ArthimeticProgression
{
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input first term, common difference, and number of terms
	        System.out.print("Enter the first term (a): ");
	        int a = sc.nextInt();

	        System.out.print("Enter the common difference (d): ");
	        int d = sc.nextInt();

	        System.out.print("Enter the number of terms (n): ");
	        int n = sc.nextInt();

	        System.out.println("\nArithmetic Progression is:");

	        // Print AP using for loop
	        for (int i = 1; i <= n; i++) {
	            int term = a + (i - 1) * d;
	            System.out.print(term + " ");
	        }

	        sc.close();
	    }
	

}
