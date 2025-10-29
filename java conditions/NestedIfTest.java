package conditions;
import java.util.*;
public class NestedIfTest 
{
    public static void main(String[]args) 
    {
    	// find  a number is even or odd , if the number is negative ignore it
    	Scanner sc = new Scanner(System.in);
 	   System.out.println("enter any number:");
 	   int a = sc.nextInt();
 	   
 	   if(a<0)
 	   {
 		   System.out.println(" enter a valid number");
 	   }
 	   else
 	   {
 		   if(a%2==0)
 		   {
 			   System.out.println(a+": is an even number");
 		   }
 		   else
 		   {
 			   System.out.println(a+": is an odd number");
 		   }
 	   }
    	
    }
}
