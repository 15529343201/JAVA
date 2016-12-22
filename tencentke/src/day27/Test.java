package day27;
/*
 * 对象类型的参数传递
 *   java中只有值传递，基本类型都好理解，直接传值
 *                 引用类型呢，传递的是引用，而这个引用就是值
 *   基本数据类型作为参数,直接操作
 *   引用类型作为参数，操作的是引用指向的堆内存中的对象
 */
public class Test 
{
	public static void main(String[] args)
	{
		Animal a = new Animal();
		a.name = "小花";
		a.skin = "白色";
		a.type = "小狗";
		
		printAnimal(a);
	}
	
	public static void printAnimal(Animal a)
	{
		System.out.println("姓名是:"+a.name+
		 ",肤色是:"+a.skin+",品种是:"+a.type);
	}
}
