package day29;

public class FinalMethodTest
{
	

}

class Tree
{
	public final void develop()
	{
		System.out.println("小树在生长");
	}
}

class Oak extends Tree
{
	public Oak()
	{
		System.out.println("初始化橡树");
	}
	
	public void develop(String name)
	{
		
	}
}

