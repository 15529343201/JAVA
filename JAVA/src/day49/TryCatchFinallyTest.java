package day49;
/*
 * try catch finally �ǿ���Ƕ��ʹ�õ�
 */
public class TryCatchFinallyTest 
{
	public static void main(String[] args)
	{
		double a = Math.random();
		
		try
		{
			if(a > 0.5)
				System.out.println(a + ",���򲻱���");
			else 
				throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("������㲶��Ķ���" + e);
			try
			{
				a = 1 / 0;
			}
			catch(ArithmeticException e1)
			{
				System.out.println("�����ڲ㲶��Ķ���");
			}
			finally
			{
				System.out.println("�����ڲ��finally����");
			}
		}
		finally
		{
			System.out.println("��������finally����");
		}
	}
}
