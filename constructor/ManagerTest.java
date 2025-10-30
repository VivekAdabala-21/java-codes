package constructor;

public class ManagerTest 
{
     public static void main(String[]args)
     {
    	 Employee e = new Employee(12,"vivek");
    	 Manager x = new Manager(e);
    	 x.display();
     }
}
