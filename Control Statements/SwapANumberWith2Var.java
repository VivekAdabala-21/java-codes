package controlstatements;

public class SwapANumberWith2Var 
{
  public static void main(String[]args)
  {
	  int a=60,b=40;
	  
	  System.out.println("before swapping a: "+a);
	  System.out.println("before swapping b: "+b);
      
	  a= a+b;//a value is 60
	  b=a-b;//b value is 20
	  a=a-b;//a value is 40
	  
	  
	  System.out.println("after  swapping a: "+a);
  	System.out.println("after swapping b: "+b);
  }
}
