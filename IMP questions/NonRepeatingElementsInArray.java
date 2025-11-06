package Practice;

public class NonRepeatingElementsInArray 
{
	 public static void main(String[] args) {
	        int[] arr = {3, 5, 9, 4, 9, 7, 8};

	        System.out.print("Non-repeating elements: ");

	        // Outer loop to pick each element
	        for (int i = 0; i < arr.length; i++) {
	            int count = 0;

	            // Inner loop to count occurrences of arr[i]
	            for (int j = 0; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                }
	            }

	            // If count is 1, element is non-repeating
	            if (count == 1) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	 }
}