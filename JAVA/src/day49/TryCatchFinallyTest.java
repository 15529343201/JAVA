package day49;
/*
 * try catch finally 是可以嵌套使用的
 */
public class TryCatchFinallyTest 
{
	public static void main(String[] args)
	{
		double a = Math.random();
		
		try
		{
			if(a > 0.5)
				System.out.println(a + ",程序不报错");
			else 
				throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("这是外层捕获的对象" + e);
			try
			{
				a = 1 / 0;
			}
			catch(ArithmeticException e1)
			{
				System.out.println("这是内层捕获的对象");
			}
			finally
			{
				System.out.println("这是内层的finally语句块");
			}
		}
		finally
		{
			System.out.println("这是外层的finally语句块");
		}
	}
}
