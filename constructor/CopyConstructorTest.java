package constructor;

public class CopyConstructorTest 
{
     public static void main(String[]args)
     {
    	 CopyConstructor user1 = new CopyConstructor(123,"vivek",30000.0) ;
    	 CopyConstructor user2 = new CopyConstructor(user1) ;
    	 
    	 System.out.println("original user");
    	 user1.display();
    	 
    	 System.out.println("copied user");
    	 user2.display();

     }
}
