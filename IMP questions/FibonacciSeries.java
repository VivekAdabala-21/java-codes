package Practice;

public class FibonacciSeries 
{
   public static void main(String[]args)
   {
	   int n=100;
	   int t1=0;
	   int t2=1;
	   int t3 = t1+t2;
	   System.out.println(t1);
	   System.out.println(t2);
	   System.out.println(t3);
	   
	   for(int i=0;i<=n;i++)
	   {
		   t1=t2;
		   t2=t3;
		   t3=t1+t3;
		   System.out.println(t3);
	   }
   }
}
