package day28;
/*
 * 静态方法
 *   用static修饰的方法称为静态方法
 *   访问静态方法是通过(类名.方法名)
 *   1.静态方法不能访问非静态变量
 *   2.非静态方法可以访问静态变量
 *   
 *   静态属性或方法是在类加载的时候产生的
 *   非静态的属性或方法是在new的时候产生的
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
