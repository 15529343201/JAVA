package day45;
/*
 * 1,什么是异常
 *   异常就是程序运行过程中所出现的不正常现象
 *   try:把可能发生异常的代码包起来，当发生异常时，将异常抛出
 *   catch:捕获异常并处理
 *   finally:不管是否发生异常，都会执行
 *   throw:手动引发一个异常
 *   throws:定义任何被调用方法的异常
 * 2,异常出现的原因
 *   用户输入错误
 *   代码的错误
 *   环境的因素
 *   异常机制保证了程序的健壮性
 */
public class Test
{
	public static void main(String[] args)
	{
		//System.out.println(1/0.0);
		try
		{
			System.out.println(1/0);
			System.out.println("aaaa");//不会执行
		}
		catch(ArithmeticException e)
		{
			System.out.println("运算异常");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("总会执行");
		}
		
	}

}
