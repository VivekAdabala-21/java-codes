package controlstatements;

public class ForProgram
{
  // printing odd or even numbers upto 20 numbers and count of the total number of odd or even upto 
	
     public static void main(String[]args)
	{
	  
	       int n =100;
	       int count=0;
	  
	       for(int i=1;i<=n;i++)

	       {
		         if (i%2!=0) 
		         {
		        	System.out.println("  "+i);
			         count++;
		         }
	       }
	       System.out.print("    the total number of odd numbers upto n are:"+count);
	
    }
}