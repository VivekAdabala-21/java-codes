package conditions;
import java.util.*;
public class IfTest
{
     public static void main(String args[]) 
     {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("enter any number:" );
    	  int n =sc.nextInt();
    	  
    	  if(n%2==0)
    	  {
    		  System.out.println(n+" :is an even number");
    	  }
    	  
    	  if(n%2==1)
    	  {
    		  System.out.println(n+" : is a odd number");
    	  }
    	  sc.close();
	 }
}
