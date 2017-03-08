package day23;
/*构造方法
 * 作用是用于初始化参数
 * 所有的数字变量全部设置为0
 * 所有的boolean类型全部设置为false
 * 所有的对象变量全部设置为null
 */
/*
 * 设计自己的构造方法
 *   方法名称必须和类的名称相同
 *   没有返回值
 */
/*
 * 如果自己写了有参的构造方法，那么编译器不会再提供
 * 默认的构造方法了
 * 如果我们还想用无参的构造方法，
 * 那么需要手动实现
 */
public class People 
{
	String name;
	String sex;
	int age;
	
	//无参的构造方法(可以不写编译器自动加上，前提是没有任何其他构造方法)
	People()//构造方法（可删掉,编译器默认加上)
	{
//		name = null;
//		sex = null;
//		age = 0;
	}
	
	//有参的构造方法
	People(String name,String sex,int age)
	{
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	//部分初始化
	People(String name)
	{
		this.name = name;
	}
	
	People(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args)
	{
		People p = new People();
		System.out.println(p.name);
		System.out.println(p.sex);
		System.out.println(p.age);
		
		People p1 = new People("张三","男",30);
		System.out.println(p1.name+","+p1.sex+","+p1.age);
		
		People p2 = new People("老王");
		System.out.println(p2.name);
		
		People p3 = new People("小老虎",3);
		System.out.println(p3.name+","+p2.age);
	}

}
