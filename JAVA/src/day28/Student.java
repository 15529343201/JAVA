package day28;

public class Student
{
	int id = 0;
	static int num = 0;
	
	Student(int id)
	{
		this.id = id;
		num++;
	}
	
	
	public static void main(String[] args)
	{
		Student s1 = new Student(100);
		Student s2 = new Student(101);
		Student s3 = new Student(102);
		Student s4 = new Student(103);
		
		System.out.println("s1��ѧ��:"+s1.id);
		System.out.println("s2��ѧ��:"+s2.id);
		System.out.println("s3��ѧ��:"+s3.id);
		System.out.println("s4��ѧ��:"+s4.id);
		
		System.out.println("ѧ������ĿΪ:"+Student.num);
	}

}
