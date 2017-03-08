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
		
		System.out.println("s1的学号:"+s1.id);
		System.out.println("s2的学号:"+s2.id);
		System.out.println("s3的学号:"+s3.id);
		System.out.println("s4的学号:"+s4.id);
		
		System.out.println("学生的数目为:"+Student.num);
	}

}
