package constructor;
import java.util.*;
public class ToStringMethod 
{
	
	
	// BASED ON EMPLOYEE SALARY COMPANY WILL GIVE POSITION 
	
         int empid;
         String empname;
         double empsalary;
         String emplevels;
         static String companyname;
         
         // PARAMETERIZED CONSTRUCTOR
         
         public ToStringMethod(int empid,String empname,double empsalary)
         {
        	 super();
        	 this.empid=empid;
        	 this.empname=empname;
        	 this.empsalary=empsalary;
         }
         
         
         
         public void empposition()
         {
        	  if(empsalary<=35000)
        	  {
        		  emplevels="level-1 position";
        	  }
        	  else if(empsalary >35000 && empsalary<75000)
        	  {
        		  emplevels="level-2 position";
        	  }
        	  
        	  else
        	  {
        		  emplevels="level-3 position";
        	  }
         }
         
         
         public String toString()
         {
        	 return "company[empid="+ empid+ ",empname="+ empname+",empsalary=" + empsalary+",emplevels="+emplevels+ " ] ";
         }
}
