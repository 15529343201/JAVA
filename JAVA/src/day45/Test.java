package day45;
/*
 * 1,ʲô���쳣
 *   �쳣���ǳ������й����������ֵĲ���������
 *   try:�ѿ��ܷ����쳣�Ĵ�����������������쳣ʱ�����쳣�׳�
 *   catch:�����쳣������
 *   finally:�����Ƿ����쳣������ִ��
 *   throw:�ֶ�����һ���쳣
 *   throws:�����κα����÷������쳣
 * 2,�쳣���ֵ�ԭ��
 *   �û��������
 *   ����Ĵ���
 *   ����������
 *   �쳣���Ʊ�֤�˳���Ľ�׳��
 */
public class Test
{
	public static void main(String[] args)
	{
		//System.out.println(1/0.0);
		try
		{
			System.out.println(1/0);
			System.out.println("aaaa");//����ִ��
		}
		catch(ArithmeticException e)
		{
			System.out.println("�����쳣");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("�ܻ�ִ��");
		}
		
	}

}
