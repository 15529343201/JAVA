package day26;
//构造方法的重载
public class TestStudent 
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		printStudent(s1);
		Student s2 = new Student("张三");
		printStudent(s2);
		Student s3 = new Student("张三","49");
		printStudent(s3);
		Student s4 = new Student("张三","49",12);
		printStudent(s4);
		Student s5 = new Student("张三","49",12,"小张");
		printStudent(s5);
	}
	public static void printStudent(Student s)
	{
		System.out.println("姓名:"+s.name);
		System.out.println("学号:"+s.stuNo);
		System.out.println("年龄:"+s.age);
		System.out.println("昵称:"+s.pickName);
		System.out.println("---------------------");
	}

}
