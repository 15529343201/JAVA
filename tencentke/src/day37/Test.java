package day37;

/*
 * 1.接口概述
 *   abstract 抽象类的修饰符
 *   interface 接口的修饰符
 *   extends 只能是一个
 *   implements 可以多个
 *   接口只有抽象方法，它比抽象类还要抽象，接口是彻彻底底的抽象
 *   接口是抽象方法和常量的属性集合
 *   接口中只能够包含抽象方法和常量，不能有变量，初始化块，构造器
 *   注意事项:
 *         1.接口的修饰符只有两种:默认和public
 *         2.接口内的变量会被设置成共有的，静态的和最终的手段
 *         3.接口内只有抽象方法和常量的属性集合
 *           int i=1;
 *           public static final int i = 1;
 */
public interface Test
{
	int i = 1;//相当于public static final i = 1
}
