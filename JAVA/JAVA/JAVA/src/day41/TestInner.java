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
				System.out.println("���������ڲ����show");
			}
		};
		outer.show();
		Pa p = new Pa()
		{
			public void eat()
			{
				System.out.println("�����ڳԶ���");
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
		System.out.println("�����ٳԶ���");
	}
}
