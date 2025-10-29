package controlstatements;

public class FactorsOfANumber
{
	public static void main(String[]args)
	   {
		   int n=8;
		   int c=0;
		   for(int i=1;i<=n;i++) 
		   {
			   if(n%i==0) 
			   {
				  System.out.print(i);
				  c++;
				  System.out.println();
			   }
			   
		   }
		   System.out.println(     "Total no of factors of "+n+" are: "+c);

	   }
}
