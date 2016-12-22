package day50;
/*
 * 异常链：两个或多个不同的异常出现在同一个程序中，
 * 并且会发生嵌套抛出，我们称为异常链
 */
public class ExceptionChainTest 
{
	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		try
		{
			c.chufa(1, 0);
		}
		catch(NumberCalculateException e)
		{
			e.printStackTrace();
			System.out.println("错误原因" + e);
		}
	}

}

class Calculator
{
	public int chufa(int i,int j) throws NumberCalculateException
	{
		if(j == 0)
		{
			NumberCalculateException e = new NumberCalculateException("计算错误");
		    NumberCalculateException e1 = new NumberCalculateException("出书不能为0");
		    e.initCause(e1);
		    throw e;
		}
		return 0;
	}
}

class NegativeNumberException extends Exception
{
	public NegativeNumberException(String msg)
	{
		super(msg);
	}
}

class NumberCalculateException extends Exception
{
	public NumberCalculateException(String msg)
	{
		super(msg);
	}
}
