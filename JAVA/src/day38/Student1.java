package day38;

public class Student1 implements Student,People 
{

	@Override
	public void learn() {
		// TODO Auto-generated method stub
		System.out.println("学生在学习");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("学生在吃饭");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("学生在睡觉");
	}
}
