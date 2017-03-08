package day35;
/*
 * 多态：
 *   所谓多态，实际上就是一个对象的多种状态
 *   在我们这个例子里面
 *   Tiger可以看作是Tiger，也可以看做Animal
 *     Animal t = new Tiger()
 *     Tiger t1 = new Tiger()
 *   Cat可以看做是Cat，也可以看做是Animal
 *   Dog可以看作是Dog，也可以看作是Animal
 */
public class Test 
{
	public static void main(String[] args)
	{
//		Animal a = new Animal();
//		a.showMe();
//		
//		Tiger t = new Tiger();
//		t.showMe();
//		
//		Animal c = new Cat();
//		c.showMe();
		
		Animal t = new Tiger();
		Animal c = new Cat();
		Animal d = new Dog();
		showMe(t);
		showMe(c);
		showMe(d);
	}
	
	public static void showMe(Animal a)
	{
		a.showMe();
	}
}
