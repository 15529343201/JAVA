package day42;
/*
 * �ֲ��ڲ���
 *    ����ľֲ�λ�ý��ж����������ֲ��ڲ���
 *    �ھֲ��ڲ���������Է����ⲿ������г�Ա����
 *    �ֲ��ڲ�����ʷ����еľֲ�������ʱ�򣬸þֲ�������������Ϊ final����
 *    
 */
public class TestInner
{
	public static void main(String[] args)
	{
		Outer o = new Outer();
		OutI oi = o.eat(1);
	}
}

class Outer
{
	private String name;
	public OutI eat(final int i)
	{
		final int count = 0;
		class Inner implements OutI
		{
			@SuppressWarnings("unused")
			public void innerEat()
			{
				System.out.println(name);
				System.out.println(i);
				System.out.println(count);
			}
		}
		return new Inner();
	}
}

interface OutI
{
	
}