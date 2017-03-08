package day51;
/*
 * 1 创建自己的异常类
 *   1,继承Throwable
 *   2,继承Exception
 *   class 类名 extends Exception
 *   { 
 *      //类体
 *   ｝
 */
public class TestException
{
	public static void main(String[] args)
	{
		MyException me = new MyException("自己的异常类");
		System.out.println(me.getMessage());
		System.out.println(me.toString());
	}

}

class MyException extends Exception
{
	public MyException()
	{
		
	}
	
	public MyException(String msg)
	{
		super(msg);
	}
	
}


