package constructor;

public class InstanceVariables
{
     int marks=50;
     public static void main(String[]args)
     {
    	 InstanceVariables s1 =new InstanceVariables();
    	 InstanceVariables s2 =new InstanceVariables();
    	 s1.marks+=10;
    	 s2.marks-=5;
    	 System.out.println("Students 1 marks:"+s1.marks);
    	 System.out.println("Students 1 marks:"+s2.marks);
     }
}
