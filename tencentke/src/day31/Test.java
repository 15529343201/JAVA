package day31;
//��װ
public class Test
{
	public static void main(String[] args)
	{
		Student s = new Student();
		s.setName("����");
		System.out.println(s.getName());
		s.setAddr("����");
		System.out.println(s.getAddr());
		s.setAge(80);
		System.out.println(s.getAge());
		s.setSex("��");
		System.out.println(s.getSex());
		
		Time t = new Time();
		t.setHour(12);
		if(t.getHour() == -1)
			System.out.println("��������");
		else
		    System.out.println(t.getHour());
	}
}
