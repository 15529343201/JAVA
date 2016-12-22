package day31;
//封装
public class Test
{
	public static void main(String[] args)
	{
		Student s = new Student();
		s.setName("张三");
		System.out.println(s.getName());
		s.setAddr("陕西");
		System.out.println(s.getAddr());
		s.setAge(80);
		System.out.println(s.getAge());
		s.setSex("男");
		System.out.println(s.getSex());
		
		Time t = new Time();
		t.setHour(12);
		if(t.getHour() == -1)
			System.out.println("输入有误");
		else
		    System.out.println(t.getHour());
	}
}
