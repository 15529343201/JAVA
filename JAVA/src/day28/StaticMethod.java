package day28;
/*
 * ��̬����
 *   ��static���εķ�����Ϊ��̬����
 *   ���ʾ�̬������ͨ��(����.������)
 *   1.��̬�������ܷ��ʷǾ�̬����
 *   2.�Ǿ�̬�������Է��ʾ�̬����
 *   
 *   ��̬���Ի򷽷���������ص�ʱ�������
 *   �Ǿ�̬�����Ի򷽷�����new��ʱ�������
 *   
 */
public class StaticMethod
{
	public static void main(String[] args)
	{
		MyMethod.printString("Hello World");
		MyMethod.printInt(101);
	}
}

class MyMethod
{
	static void printString(String str)
	{
		System.out.println(str);
	}
	
	static void printInt(int i)
	{
		System.out.println(i);
	}
}
