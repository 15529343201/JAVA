package day43;
/*
 * 静态内部类
 *    1,在内部类前添加static修饰符
 *    2,静态内部类中可以声明static成员变量；非静态内部类中不可以
 *    3,静态内部类不可以使用外部类的非静态成员变量
 *    4,创建静态内部类的对象，不需要其外部类的对象
 *    
 *    创建非静态内部类的形式
 *       Outer o = new Outer();
 *       Outer.Inner i = o.new Inner();
 *    创建静态内部类的形式
 *       StaticInnerTest.Inner i = new StaticInnerTest.Inner();
 *       可改成:Outer.Inner i = new Outer.Inner();
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
 