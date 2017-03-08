package day46;
//类型转换异常
public class ClassCastExceptionTest
{
	public static void main(String[] args)
	{
		People p1 = new Student();
		Student s1 = (Student)p1;
//		s1=null;
//		s1.run();//空指针异常
		
		//Teacher t1 = (Teacher)p1;//异常
		
		int[] arr = new int[]{1,2,3};
		int temp = arr[3];//数组越界异常
		System.out.println(temp);
	}

}

class People
{
	
}

class Student extends People
{
	private String name;
	private int age;
	
	public void run()
	{
		System.out.println("run");
	}
}

class Teacher extends People
{
	
}