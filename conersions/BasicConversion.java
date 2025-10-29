package Practice;

public class BasicConversion 
{
	public static void main(String[]args)
	{
		{
			double d=66.4;	
			float f= (float)d;
			long g=(long)f;
		   int a=(int)g;
		   char ch=(char)a;
		   short s= (short)ch;  //explicity type-casting or narrowing//
		   byte b = (byte)s;
		   System.out.println(d);
		   System.out.println(f);
		   System.out.println(g);
		   System.out.println(a);
		   System.out.println(ch);
		   System.out.println(s);
		   System.out.println(b);
		   }
	}    

}
