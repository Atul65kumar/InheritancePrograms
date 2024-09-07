package Inheritance;
class Shopping{
	Shopping()
	{
		this(56);
		System.out.println("Shopping with Myntra website");
	}
	Shopping(int a)
	{
		this(45, 4.4);
		System.out.println("Shopping with Ajio website");
	}
	Shopping(int a, double b)
	{
		System.out.println("Shopping with Flipkart website");
	}
}
public class ThisCalling_Statement extends Shopping
{
	ThisCalling_Statement()
	{
		System.out.println("Shopping with Main website");
	}

	public static void main(String[] args)
	{
		new ThisCalling_Statement();
	}

}
