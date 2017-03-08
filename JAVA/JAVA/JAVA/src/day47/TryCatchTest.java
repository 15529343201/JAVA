package day47;
/*
 * 1 获取异常信息
 *   程序发生异常的时候，程序就直接从try跳到catch语句块，不再继续往下执行
 */
public class TryCatchTest
{
	public static void main(String[] args)
	{
		//int count = 9;
		try
		{
			//int temp = count / 0;
//			int[] arr = new int[]{1,2,3,4,5};
//			int temp = arr[90];
			String a = "aaa";
			Integer.parseInt(a);
			System.out.println("检测程序");
		}
		catch(ArithmeticException e)
		{
			System.out.println("发生了ArithmeticException异常");
			//return;
			//System.exit(0);就不会执行finally
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("发生了ArrayIndexOutOfBoundsException异常");
		}
		catch(Exception e)
		{
			System.out.println("所有的异常都会被我捕获");
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("程序运行结束");
	}
}
