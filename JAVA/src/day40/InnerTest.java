package day40;
/*
 * 1 �ڲ������
 *   һ���౻Ƕ�׶�������һ�����У���ô�����ͱ���Ϊ�ڲ���
 *   �����ڲ������ͱ���Ϊ���ⲿ��
 *   �ڲ����൱���ⲿ��ĳ�Ա�������߷���
 * ��ι����ڲ���
 *   Outer out = new Outer();
 *   Outer.Inner in = out.new Inner();
 *   in.print();
 */
public class InnerTest
{
	public static void main(String[] args)
	{
		Outer out = new Outer();
		out.useInner();
		out.i = 9;
		
		Outer.Inner in = out.new Inner();
		in.print();
	}

}
