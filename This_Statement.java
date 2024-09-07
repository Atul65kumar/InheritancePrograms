package Inheritance;
class Cricket
{
	Cricket()
	{
		this("Game");
		System.out.println("Cricket");
	}
	Cricket(String a)
	{
		System.out.println("Cricket 2.O");
	}
}
class BaseBall extends Cricket
{
	BaseBall()
	{
		this(67);
		System.out.println("BaseBall");
	}
	BaseBall(int a)
	{
		System.out.println("BaseBall 2.O");
	}
}
public class This_Statement extends BaseBall
{
	This_Statement()
	{
		System.out.println("Main Constructor game");
	}

	public static void main(String[] args) 
	{
		new This_Statement();
	}
}
