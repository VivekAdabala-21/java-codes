package constructor;

public class StaticVariables 
{
	static int marks=50;
   public static void main(String[]args)
   {
	   StaticVariables  s1 =new StaticVariables ();
	   StaticVariables  s2 =new StaticVariables ();
	   
	   s1.marks +=10;
	   s2.marks -=5;
	   
	   System.out.println("student 1 marks:" +s1.marks);
	   System.out.println("student 2 marks:"+s2.marks);
   }
}
