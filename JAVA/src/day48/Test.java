package day48;
/*
 * �쳣����:ָһ�����������������������쳣�����ǵ��ò������
 * ���ݣ�˭���õ����������˭������
 */
public class Test 
{
	public static void main(String[] args)
	{
		System.out.println("main������ʼִ��");
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
		System.out.println("main��������");
	}
	public void test1() throws ArithmeticException
	{
		System.out.println("test1()��ʼִ��");
		System.out.println(1/0);
		System.out.println("test1()ִ�����");
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
