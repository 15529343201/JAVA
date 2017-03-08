package day29;
/*
 * 1.final修饰变量
 *  恒定不变的属性,可以用final来进行修饰
 *  final修饰的变量不能改变，如果在程序中赋值，编译报错
 * 2.final修饰方法
 *  任何继承类方法无法覆盖该方法
 *  重载不会受到限制
 * 3.final修饰类
 *  该类不能作为任何类的父类
 *  类中的方法全部被自动定义成为final类型 
 */
public class Asian 
{
	public static final String SKIN_COLOR = "黄色";
	public static final int EYE_COUNT = 2;
	public static final String EYE_COLOR = "黑色";
}
