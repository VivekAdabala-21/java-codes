package conditions;
import java.util.*;
public class ElseIfTest3 
{
	public static void main(String[]args) 
	{
	Scanner sc = new Scanner(System.in);

    
    System.out.print("Enter marks in Maths: ");
    int maths = sc.nextInt();

    System.out.print("Enter marks in Physics: ");
    int physics = sc.nextInt();

    System.out.print("Enter marks in Chemistry: ");
    int chemistry = sc.nextInt();

    System.out.print("Enter marks in English: ");
    int english = sc.nextInt();

    System.out.print("Enter marks in Social: ");
    int social = sc.nextInt();

    
    int total = maths + physics + chemistry + english + social;
    double average = total / 5.0;

    
    if (maths < 40 || physics < 40 || chemistry < 40 || english < 40 || social < 40) {
        System.out.println("\nTotal Marks : " + total + " marks");
        System.out.println("Average     : " + average);
        System.out.println("Result      : Fail (less than 40 marks in one or more subjects)");
    } 
    else 
    	 System.out.println("\nTotal Marks : " + total + " marks");
    System.out.println("Average     : " + average);
    {
        
       
        if (average >= 60)
        {
           System.out.println("result:"+"first division");
        } 
        else if (average>=50 & average < 60)
        {
        	System.out.println("result:"+"second division");
        } 
        else if (average >= 40 & average < 50) 
        {
        	System.out.println("result:"+"third division");
        } 
        else if(average > 40) 
        {
        	System.out.println("result:"+"fail");
            
         }
        else {
        	System.out.println("enter correct values.");
        }
    }
	}

}
