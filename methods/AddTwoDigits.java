package practice;
import java.util.Scanner;
public class AddTwoDigits 
{
	public int sumofDigits(int a,int b)
	{
		
		int sum = a+b;
		return sum;
	}
	public static void main(String[]args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a two digit number:");
		int n = sc.nextInt();
		
	        
	        
	        AddTwoDigits add = new AddTwoDigits();
	        int result = add.sumofDigits(n/10, n%10 );
	        System.out.println("output is:"+result);
	        sc.close();
	}

}
