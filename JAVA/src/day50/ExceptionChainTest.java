package day50;
/*
 * �쳣��������������ͬ���쳣������ͬһ�������У�
 * ���һᷢ��Ƕ���׳������ǳ�Ϊ�쳣��
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
			System.out.println("����ԭ��" + e);
		}
	}

}

class Calculator
{
	public int chufa(int i,int j) throws NumberCalculateException
	{
		if(j == 0)
		{
			NumberCalculateException e = new NumberCalculateException("�������");
		    NumberCalculateException e1 = new NumberCalculateException("���鲻��Ϊ0");
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
