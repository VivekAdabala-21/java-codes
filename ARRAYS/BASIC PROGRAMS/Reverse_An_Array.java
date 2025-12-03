package build;

import java.util.Arrays;

public class Reverse_An_Array 
{
	public static void main(String[]args)
	 { 
		 int arr[]= {1,2,3,4,5};
		 int n=arr.length;
		 int arr2[]= new int[n];
		 int j=0;
		 
		 //reversing an array using for loop
		 for(int i=n-1;i>=0;i--)          
		 {
			arr2[j]=arr[i];
			
			  j++;
		 }
		 
		 System.out.println(Arrays.toString(arr2));
		 
		 //reversing an array using while loop
	
			 while( n-1 >=0)                    
			 {
				 System.out.print(arr[n-1]+" "); 
				 n--;
			 }
	 }	 
}
