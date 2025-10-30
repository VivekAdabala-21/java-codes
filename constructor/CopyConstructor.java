
package constructor;

public class CopyConstructor
{
    int id;
    String name;
    double salary;
    
    //NORMAL CONSTRUCTOR
    CopyConstructor(int id, String name,double salary)
    {
    	this.id = id;
    	this.name=name;
    	this.salary = salary;
    }
    
    
    //PARAMETERIZED CONSTRUCTOR WITH OBJECT REFERENCE[COPY CONSTRUCTOR]
    public CopyConstructor(CopyConstructor user)
    {
    	this.id=user.id;
    	this.name=user.name;
    	this.salary = user.salary;

    }
    
    public void display()
    {
    	System.out.println("username: "+name);
    	System.out.println("userid:"+id);
    	System.out.println("userSalary: "+salary);
    	
    }
}




