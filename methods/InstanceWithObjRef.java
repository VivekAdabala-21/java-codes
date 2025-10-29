package methodstest;

public class InstanceWithObjRef 
{
         public static void main(String[]args)
         {
        	 InstanceWithObjRef x =new InstanceWithObjRef();
        	 int s=x.add(10, 20);
        	 System.out.println(s);
        	 
        	 
        	          // [OR]
        	 
        	 System.out.println(x.add(10, 20));
        	 
         }
         
         
         public int add(int a,int b)
         {
        	 int c =a+b;
        	 return c;
         }
}
