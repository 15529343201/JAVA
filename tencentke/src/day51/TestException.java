package day51;
/*
 * 1 �����Լ����쳣��
 *   1,�̳�Throwable
 *   2,�̳�Exception
 *   class ���� extends Exception
 *   { 
 *      //����
 *   ��
 */
public class TestException
{
	public static void main(String[] args)
	{
		MyException me = new MyException("�Լ����쳣��");
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


