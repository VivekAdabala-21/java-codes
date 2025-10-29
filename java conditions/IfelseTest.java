package conditions;
import java.util.*;
public class IfelseTest 
{
   public static void main(String args[])
   {
	   // EVEN OR ODD OR POSITIVE OR NEGATIVE
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter any number:");
	   int a = sc.nextInt();
	   
	   if(a%2==0 )
	   {
		   System.out.print("a is an even ");
	   }
	   else
	   {
		   System.out.print("a is an odd ");
	   }
	   if(a>0)
	   {
		   System.out.print("positive number");
	   }
	   else
	   {
		   System.out.print("negative number");
	   }
	   
   }
}
