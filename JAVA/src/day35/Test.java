package day35;
/*
 * ��̬��
 *   ��ν��̬��ʵ���Ͼ���һ������Ķ���״̬
 *   �����������������
 *   Tiger���Կ�����Tiger��Ҳ���Կ���Animal
 *     Animal t = new Tiger()
 *     Tiger t1 = new Tiger()
 *   Cat���Կ�����Cat��Ҳ���Կ�����Animal
 *   Dog���Կ�����Dog��Ҳ���Կ�����Animal
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
