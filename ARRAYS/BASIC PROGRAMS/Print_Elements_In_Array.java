package build;

import java.util.Arrays;

public class Print_Elements_In_Array 
{
	 public static void main(String[]args)
	    {
	    	int arr[]= {1,2,3,4,5};
	    	
	    	//Print all elements using for loop
	    	
	    	for(int i=0;i<arr.length;i++)  
	    	{
	    	System.out.print(arr[i]+" ");
	    	}
	    	System.out.println(" ");
	    	
	    	//Print all elements using toString
	    	
	    	System.out.println(Arrays.toString(arr));
	    
	    	//Print all elements using for each loop
	    	
	    	for(int b: arr)                    
	    	{
	    		System.out.print(b+" ");
	    	}
	    }	
}
