package day48;
/*
 * 异常声明:指一个方法不处理它所产生的异常，而是调用层次向上
 * 传递，谁调用的这个方法，谁来处理
 */
public class Test 
{
	public static void main(String[] args)
	{
		System.out.println("main方法开始执行");
		Test t = new Test();
//		try
//		{
//			t.test1();
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e.getMessage());
//		}
		t.test4();
		System.out.println("main方法结束");
	}
	public void test1() throws ArithmeticException
	{
		System.out.println("test1()开始执行");
		System.out.println(1/0);
		System.out.println("test1()执行完毕");
	}
	
	public void test2() throws ArithmeticException
	{
		test1();
	}
	
	public void test3() throws ArithmeticException
	{
		test2();
	}
	
	public void test4()
	{
		try
		{
			test3();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
