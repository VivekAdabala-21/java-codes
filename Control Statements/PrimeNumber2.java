package controlstatements;

public class PrimeNumber2
{
	public static void main(String[]args)
	{
		int n=11;
		int i;
        for(i=2;i<=n;i++)
        {
    	   if(n%i==0)
    	   {
    		   break;
    	   }
        }   
    	   if(i==n)
    	   {
    		   System.out.println(n+" is   an prime number");
    	   }
    	   else
    	   {
    		   System.out.println(n+" is   not an prime number");
    	   }
	}
}
