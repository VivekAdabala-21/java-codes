package controlstatements;

public class SumOfEvenDigits
{
   public static void main(String[]args)
   {
	   int n =122;
	   int sum=0;
	   while(n!=0)
	   {
	      int i= n%10;
	       if(i%2==0)
	       {
	    	   sum=sum+i;
	       }
	       n=n/10;
	   }  
	   System.out.println(sum);
	       
   }
}
