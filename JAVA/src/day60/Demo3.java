package day60;
import java.util.Collection;
import java.util.ArrayList;
/*
 * 判断：
 *      contains(Object o)
 *      containsAll(Collection<?> c)
 *      isEmpty()
 */
class Person
{
	int id;
	
	String name;
	
	public Person(int id,String name)
	{
		this.id = id;
		this.name = name; 
	}
	
	@Override
	public String toString()
	{
		return "{编号: "+this.id+" 姓名 "+this.name+"}";
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Person p = (Person)obj;
		return this.id == p.id;
	}
	
	//java规范：一般重写equals方法我们都会重写hashCode方法
	@Override
	public int hashCode()
	{
		return this.id;
	}
	
}

//class Dog
//{
//	
//}
public class Demo3 
{
	public static void main(String[] args)
	{
//		Collection c = new ArrayList();
//		c.add("令计划");
//		c.add("徐才厚");
//		c.add("周永康");
//		System.out.println("集合是否为空元素: " + c.isEmpty());
//		System.out.println("判断集合中是否存在指定的元素" + c.contains("薄熙来"));
	
	    //集合添加自定义元素
	    Collection c = new ArrayList();
	    c.add(new Person(110,"狗娃"));
	    c.add(new Person(119,"狗剩"));
	    c.add(new Person(120,"铁蛋"));
	    
	    Collection c2 = new ArrayList();
	    c2.add(new Person(110,"狗娃"));
	    c2.add(new Person(119,"狗剩"));
	    System.out.println("c集合有包含c2集合中的所有元素吗？"+c.containsAll(c2));
	    
	    //c.contains(new Dog());调用狗的contains
	    //如果在现实生活中，只要身份证标号一致，那么就为一个人
	    System.out.println("存在该元素吗？"+c.contains(new Person(120,"铁蛋")));//其实contains方法内部是依赖于equals方法进行比较的
	    System.out.println(c);
	}
}
