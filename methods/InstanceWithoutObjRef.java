package methodstest;

public class InstanceWithoutObjRef 
{
	public static void main(String[]args)
	{
		int x = new InstanceWithoutObjRef().add(10, 20 )	;	
		System.out.println(x);
	}
    
	
	
	public int add(int a,int b)
	 {
		
		int c=a+b;
		return c;
	
	}
}
