package controlstatements;

public class EvenOrOddUseAdd
{
   public static void main(String[]args)
   {
	   int n=7;
	   int a=0;
	   while(a<n)
	   {
		   a=a+2;
	   }
	   if(a==n)
	   {
		   System.out.println(n+": is an even number");
	   }
	   else
	   {
		   System.out.println(n+": is an odd number");
	   }
   }
}
