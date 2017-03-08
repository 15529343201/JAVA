package day40;
/*
 * 1 内部类概述
 *   一个类被嵌套定义在另一个类中，那么这个类就被称为内部类
 *   包含内部类的类就被称为是外部类
 *   内部类相当于外部类的成员变量或者方法
 * 如何构造内部类
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
