package day42;
/*
 * 局部内部类
 *    在类的局部位置进行定义的类叫做局部内部类
 *    在局部内部类里面可以访问外部类的所有成员变量
 *    局部内部类访问方法中的局部变量的时候，该局部变量必须声明为 final类型
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