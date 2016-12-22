package day26;

public class Student
{
	String name;
	String stuNo;
	int age;
	String pickName;
	
	public Student()
	{
		/*name = null;
		stuNo = null;
		age = 0;
		pickName = null;*/
	}
	
	public Student(String name)
	{
		this.name = name;
	}
	
	public Student(String name,String stuNo)
	{
		//this(name);
		this.name = name;
		this.stuNo = stuNo;
	}
	
	public Student(String name,String stuNo,int age)
	{
		//this(name,stuNo);
		this.name = name;
		this.stuNo = stuNo;
		this.age = age;
	}
	
	public Student(String name,String stuNo,int age,String pickName)
	{
		//this(name,stuNo,age);
		this.name = name;
		this.stuNo = stuNo;
		this.age = age;
		this.pickName = pickName;
	}
}
