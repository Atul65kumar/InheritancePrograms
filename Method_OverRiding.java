package Inheritance;
class Amazon{
	void shopping()
	{
		System.out.println("Shopping with Amazon");
	}
}
class Ajio extends Amazon
{
	void shopping()
	{
		super.shopping();
		System.out.println("Shopping with Ajio");
	}
}
public class Method_OverRiding extends Ajio 
{
	void shopping()
	{
		super.shopping();
		System.out.println("This is common main method shopping complex");
	}
	public static void main(String[] args)
	{
		Method_OverRiding m1 = new Method_OverRiding();
		m1.shopping();
	}

}
