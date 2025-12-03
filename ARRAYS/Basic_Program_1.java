package arrays;

import java.util.Arrays;

public class Basic_Program_1
{
    public static void main(String[]args)
    {
    	
    	//Print all elements of an array
    	
    	int arr[]= {1,2,3,4,5};
    	
    	for(int i=0;i<arr.length;i++)  // for loop
    	{
    	System.out.print(arr[i]+" ");
    	}
    	System.out.println(" ");
    	
    	
    	System.out.println(Arrays.toString(arr));  // toString to arr
    	
    	
    	
    	for(int b: arr)                    //for each loop
    	{
    		System.out.print(b+" ");
    	}
    	
    }
}
