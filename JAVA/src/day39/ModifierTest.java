package day39;
/*
 * 1 方法的修饰符
 *      接口中变量的修饰符:public static final
 *      接口中方法的修饰符:public abstract
 * 2 接口类型引用变量
 */
public class ModifierTest 
{
	public static void main(String[] args)
	{
		Modifier2 m = new Modifier2();
		Modifier m1 = new Modifier2();
		m.print();
		m.print1();
		m.print2();
		m.print3();
		m.print4();
		
		m1.print();
		m1.print1();
		m1.print2();
		m1.print3();
		m1.print4();
	}
}
