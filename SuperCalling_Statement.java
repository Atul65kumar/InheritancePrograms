package Inheritance;
class Teacher
{
	Teacher(String a, int b)
	{
		System.out.println("This is Teacher Constructor");
	}
}
class Student extends Teacher
{
	Student(double c)
	{
		super ("Atul", 34);
		System.out.println("This is Student Constructor");
	}
}

public class SuperCalling_Statement extends Student
{
	SuperCalling_Statement()
	{
		super(4.4);
		System.out.println("This is SuperCalling_Statement Constructor");
	}
	public static void main(String[] args) 
	{
		new SuperCalling_Statement();

	}
}
