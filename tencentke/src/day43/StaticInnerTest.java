package day43;
/*
 * ��̬�ڲ���
 *    1,���ڲ���ǰ���static���η�
 *    2,��̬�ڲ����п�������static��Ա�������Ǿ�̬�ڲ����в�����
 *    3,��̬�ڲ��಻����ʹ���ⲿ��ķǾ�̬��Ա����
 *    4,������̬�ڲ���Ķ��󣬲���Ҫ���ⲿ��Ķ���
 *    
 *    �����Ǿ�̬�ڲ������ʽ
 *       Outer o = new Outer();
 *       Outer.Inner i = o.new Inner();
 *    ������̬�ڲ������ʽ
 *       StaticInnerTest.Inner i = new StaticInnerTest.Inner();
 *       �ɸĳ�:Outer.Inner i = new Outer.Inner();
 */
public class StaticInnerTest 
{
	static int count = 1;
	
	public static void main(String[] args)
	{
		StaticInnerTest.Inner i = new StaticInnerTest.Inner();
	}
	
	static class Inner
	{
		public void print()
		{
			System.out.println(count);
		}
	}

}
 