package practice;
import java.util.Scanner;
public class NextMultiple
{
 public static int nextMultipleof100(int n ) 
 {
	 int a= (n/100+1)*100;
	 
	 return a;
 }
 public static void main(String[]args) 
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter any three digit number:");
	 int num= sc.nextInt();
	 
	 int result = nextMultipleof100(num);
	 System.out.println(result);
 }
 
}
