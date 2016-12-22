package day28;

public class Demo
{
	static int x = 0;
	static
	{
		x = 100;
	}
	
	Demo()
	{
		System.out.println(x);
	}
	
	public static void main(String[] args)
	{
		new Demo();
	}

}
