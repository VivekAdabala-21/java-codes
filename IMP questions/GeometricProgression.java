package Practice;
import java.util.Scanner;



	public class GeometricProgression {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input first term, common ratio, and number of terms
	        System.out.print("Enter the first term (a): ");
	        double a = sc.nextDouble();

	        System.out.print("Enter the common ratio (r): ");
	        double r = sc.nextDouble();

	        System.out.print("Enter the number of terms (n): ");
	        int n = sc.nextInt();

	        System.out.println("\nGeometric Progression is:");

	        // Print GP using for loop
	        for (int i = 1; i <= n; i++) {
	            double term = a * Math.pow(r, i - 1);
	            System.out.print(term + " ");
	        }

	        sc.close();
	    }
	}


