package controlstatements;

public class PrimeNumberInRange
{
	public static void main(String[]args)
	{
		int a=1,b=100;
	
        for(int i=a;i<=b;i++)
        {
        	int countPrime=0;
           for(int j=1;j<=b;j++)
           {
        	   if(i%j==0)
        	   {
        		   countPrime++;
        		   
        	   }
        	  
            }   
             if(countPrime==2)
             {
            	 System.out.println(i);
            	
             }
        }  
        
	}	   
}
