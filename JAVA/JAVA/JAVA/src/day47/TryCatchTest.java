package day47;
/*
 * 1 ��ȡ�쳣��Ϣ
 *   �������쳣��ʱ�򣬳����ֱ�Ӵ�try����catch���飬���ټ�������ִ��
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
			System.out.println("������");
		}
		catch(ArithmeticException e)
		{
			System.out.println("������ArithmeticException�쳣");
			//return;
			//System.exit(0);�Ͳ���ִ��finally
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("������ArrayIndexOutOfBoundsException�쳣");
		}
		catch(Exception e)
		{
			System.out.println("���е��쳣���ᱻ�Ҳ���");
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("�������н���");
	}
}
