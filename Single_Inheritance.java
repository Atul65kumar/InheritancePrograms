package Inheritance;
class Parent
{
	static void amazon()
	{
		System.out.println("This is static method");
	}
	void flipkart()
	{
		System.out.println("This is non - static method");
	}
}
public class Single_Inheritance extends Parent
{

	public static void main(String[] args) 
	{
		amazon();
		Single_Inheritance s1 = new Single_Inheritance();
		s1.flipkart();
	}
}
