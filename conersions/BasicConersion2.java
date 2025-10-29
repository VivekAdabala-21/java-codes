package Practice;

public class BasicConersion2 
{
	public static void main(String[]args)
	{
		         byte y = 67;
				short king = y;
				char c = (char)king;
				int x = c;
				long g= x;
				float f =g;
				double d = f;
				System.out.println(y);     //implicity type-casting or widening
				System.out.println(king);
				System.out.println(c);
				System.out.println(x);
				System.out.println(g);
				System.out.println(f);
				System.out.println(d);
	}
}
