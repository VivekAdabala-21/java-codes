package Practice;

public class NonRepeatingCharacters
{
   public static void main(String[]args)
   {
	   String str = "programming";
       str = str.toLowerCase();  // optional for case-insensitive check

       char[] arr = str.toCharArray(); // convert string to character array

       System.out.print("Non-repeating characters: ");

       for (int i = 0; i < arr.length; i++) {
           int count = 0;

           // check how many times arr[i] appears in the array
           for (int j = 0; j < arr.length; j++) {
               if (arr[i] == arr[j]) {
                   count++;
               }
           }

           // print only characters that appear once
           if (count == 1) {
               System.out.print(arr[i] + " ");
           }
       }
   }
}
