package day25;

public class TestStudent
{
	public static void main(String[] args)
	{
		Student s = new Student();
		s.name = "������";
		s.stuno = "24";
		s.sex = "��";
		s.age = 3;
		
		System.out.println("����:"+s.name);
		System.out.println("ѧ��:"+s.stuno);
		System.out.println("�Ա�:"+s.sex);
		System.out.println("����:"+s.age);
		
		s.play();
		s.study();
	}

}
