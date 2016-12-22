package day56;

public class TestYield
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new MyRunnable());
		Thread t2 = new Thread(new MyRunnable1());
		
		t1.start();
		t2.start();
	}
}

class MyRunnable implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 200;i++)
		{
			System.out.println("+");
			Thread.yield();
		}
	}
	
}

class MyRunnable1 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 200;i++)
		{
			System.out.println("*");
			Thread.yield();
		}
	}
}
