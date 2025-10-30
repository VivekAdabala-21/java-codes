package controlstatements;

public class SumAverageCount 
{
   public static void main(String[]args)
   {
	   int a=10,b=100,c=0,s=0;
	   for(int i=a;i<=b;i++)
	   {   
		   int count=0;
		   for(int j=1;j<=b;j++)
		   {
			   if(i%j==0)
			   {
				   count++;
			   }
		   }
	   
		   if(count==2)
		   {
			   c++;
			   s=s+i;
		   }
	   }
	   
	   System.out.println(c);
	   System.out.println(s);
	   System.out.println((float)s/c);
   }
}

