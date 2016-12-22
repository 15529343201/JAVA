package day41;

public class TestInner
{
	public static void main(String[] args)
	{
		OuterI outer = new OuterI()
	    {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("这是匿名内部类的show");
			}
		};
		outer.show();
		Pa p = new Pa()
		{
			public void eat()
			{
				System.out.println("子类在吃东西");
			}
		};
		p.eat();
	}
}

interface OuterI
{
	public void show();
}

class A implements OuterI
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}

class Pa
{
	public void eat()
	{
		System.out.println("父类再吃东西");
	}
}
