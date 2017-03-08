package day38;

/*
 * class 类名 implements 接口1，接口2，接口3
 * {
 *    方法1(){}
 *    方法2(){}
 *    ........
 * }
 * 
 * 接口实现的注意事项:
 *    1,为接口中所有的方法提供具体的实现。
 *    2,必须遵守重写的所有规则。
 *        重写的规则:
 *           1，子类的重写方法不能抛出更大的异常
 *           2，子类的重写方法不能有更小的访问范围
 *           父类:public void test();
 *           子类:public void test();对
 *               protect void test();错
 *           3，必须保持相同的返回类型
 *  多继承也就是继承多个接口
 *     1.这些接口之间需要用逗号来分隔开
 *     2.如果这几个接口都有相同的方法和相同的变量，那么相同的变量
 *       可以通过接口名.变量名的形式来访问，相同的方法将被其中的一个接口使用
 */
public interface Student
{
	int banji = 1201;//班级编号
	
	String name = "小明";
	void learn();//学习方法 相当于abstract void learn();
	void eat();//吃饭方法
	void sleep();//睡觉方法
}
