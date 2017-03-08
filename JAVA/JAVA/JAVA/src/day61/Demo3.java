package day61;

interface Money
{
	public void makeMoney();
}

class Worker implements Money
{
	@Override
	public void makeMoney() {
		// TODO Auto-generated method stub
		System.out.println("¹¤ÈËÔÚ×¬Ç®...");
	}
}

public class Demo3 
{
	public static void main(String[] args)
	{
		Money m=test();
		m.makeMoney();
	}
	
	public static Money test()
	{
		return new Worker();
	}
}
