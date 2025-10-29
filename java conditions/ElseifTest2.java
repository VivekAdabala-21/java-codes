package conditions;
import java.util.*;
public class ElseifTest2
{
    public static void main(String[]args)
    {
    	Scanner sc = new Scanner(System.in);
 	   System.out.println("enter any number:");
 	   int a = sc.nextInt();
 	   int b =sc.nextInt();
 	   int c =sc.nextInt();
 	   
 	   if(a>b && b>c)
 	   {
 		   System.out.println(a+": is the greatest number");
 	   }
 	   else if(b>c)
 	   {
 		   System.out.println(b+": is the greatest number");
 	   }
 	   else
 	   {
 		   System.out.println(c+":is the greatest number");
 	   }
 	 }
}
