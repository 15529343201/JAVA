package day51;

public class AgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
		ageLevel(1000);
	} catch (IllegalAgeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	static String ageLevel(int age) throws IllegalAgeException
	{
		if(age >= 10 && age <= 18)
			return "少年";
		else if(age > 18 && age <= 30)
			return "青年";
		else if(age > 30 && age <= 60)
			return "中年";
		else if(age > 60 && age <= 120)
			return "老年";
		else
			//抛出异常
			throw new IllegalAgeException("非法的年龄!!!");
	}

}

//定义自己的异常类
class IllegalAgeException extends Exception
{
	public IllegalAgeException(String msg)
	{
		super(msg);
	}
}
