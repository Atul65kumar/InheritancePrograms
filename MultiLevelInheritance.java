package Inheritance;
class Animal extends Reptiles
{
	static void dog()
	{
		System.out.println("This is Dog's method");
	}
}
class Reptiles
{
	void snake()
	{
		System.out.println("This is Snake's method");
	}
	static void butterfly()
	{
		System.out.println("This is butterfly method");
	}
}

public class MultiLevelInheritance extends Animal
{

	public static void main(String[] args) 
	{
		dog();
		butterfly();
		MultiLevelInheritance m1= new MultiLevelInheritance();
		m1.snake();
	}
}
