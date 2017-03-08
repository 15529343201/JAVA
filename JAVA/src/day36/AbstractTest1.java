package day36;
/*
 * 1,抽象类的定义:
 *  抽象类为子类提供一个规范
 *  修饰符 abstract 类名
 *  {//类体
 *     修饰符 abstract 返回值类型 方法名(参数列表);
 *  }
 *  抽象方法没有方法体:public abstract void test();
 *  普通方法有方法体:public abstract void test(){//方法体内的代码}
 *  
 *  1.定义一个类，如果这个类是抽象类，那么这个类至少有一个抽象方法
 *  2.在抽象类中的方法不一定是抽象方法，但是含有抽象方法的类一定是抽象类
 * 2,抽象类的使用
 *   @Override 用来检测是否重写成功
 *   1，一个类继承了抽象类，就必须要重写该抽象类的所有的抽象方法。
 *   2，如果有一个类没有重写抽象类的抽象方法，那么这个类也要定义为抽象类public abstract class SubText extends Test
 */
public abstract class AbstractTest1
{
	//定义的抽象方法，这就是规范的具体方式
	public abstract void test();//抽象方法
	
	//这是普通方法
	public void test2()
	{
		System.out.println("这是普通方法");
	}
}
