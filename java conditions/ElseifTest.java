package conditions;
import java.util.*;
public class ElseifTest {
	public static void main(String[]args)
	{
		// even or odd or positive or negative
		Scanner sc = new Scanner(System.in);
		   System.out.println("enter any number:");
		   int a = sc.nextInt();
		   
		   if(a%2==0 && a>0)
		   {
			   System.out.println(a+": is an positive even number");
		   }
		   else if(a%2==0 && a<0)
		   {
			   System.out.println(a+":is an negative even number");
		   }
		   else if(a%2!=0 && a>0)
		   {
			   System.out.println(a+":is an positive odd number ");
		   }
		   else
		   {
			   System.out.println(a+":is an negative odd number");
		   }
		   sc.close();
	}

}
