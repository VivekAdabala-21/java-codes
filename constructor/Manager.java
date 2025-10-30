
package constructor;

public class Manager 
{
   int manid;
   String manname;
   
   Manager(Employee emp)
   {
	   manid=emp.empid;
	   manname=emp.empname;
   }
   
   public void display()
   {
 	  System.out.println("manager id"+manid);
 	  System.out.println("manager name:"+manname);
   }
}
