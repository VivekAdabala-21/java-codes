package practice;

import java.util.Scanner;

public class ScannerTest
{
        public static void main(String[]args)	
        {
        	Scanner app = new Scanner(System.in);
        	System.out.println( "enter employee id:");
        	int num = app.nextInt();
        	System.out.println("enter employee name:");
        	String name = app.nextLine();
        	       name = app.nextLine();
             System.out.println("enter employee gender:");
        	 char ch = app.next().charAt(0);
                 // ch = app.next().charAt(0);
             System.out.println("enter employee salary:");
             float fix = app.nextFloat();
                  // fix = app.nextFloat();
             System.out.println("enter employee adress:");
             String address = app.nextLine();
                    address = app.nextLine();
             System.out.println("is employee is IT :");
             boolean s = app.nextBoolean();
       
        	System.out.println("your employee id is :" + num);
        	System.out.println( "your employee name is :" + name);
        	System.out.println("your gender is :" + ch);
        	System.out.println("your salary is :" + fix);
        	System.out.println("your address is :"+ address);
        	System.out.println("employee is IT :"+ s);
        	
        }
}
