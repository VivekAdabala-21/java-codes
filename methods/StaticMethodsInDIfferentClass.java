package methodstest;

public class StaticMethodsInDIfferentClass 
{
           public static void main(String[]args) 
           {
        	   Test.measure(10,10);
           }
}


// USING DIFFERENT CLASSES


 class Test
{
	       public static void measure(int l,int b)    
	       {
	    	   int s = l*b;
	    	   System.out.println(s);
	       }
}
