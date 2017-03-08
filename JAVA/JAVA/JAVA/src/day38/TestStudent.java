package day38;

public class TestStudent 
{
	public static void main(String[] args)
	{
		Student1 stu = new Student1();
		stu.learn();
		stu.eat();
		stu.sleep();
		
		//public static final
		//System.out.println(stu.banji);
		System.out.println(Student1.banji);
		System.out.println(Student.name + " : " + People.name);
	}
}
