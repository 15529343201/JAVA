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
			return "����";
		else if(age > 18 && age <= 30)
			return "����";
		else if(age > 30 && age <= 60)
			return "����";
		else if(age > 60 && age <= 120)
			return "����";
		else
			//�׳��쳣
			throw new IllegalAgeException("�Ƿ�������!!!");
	}

}

//�����Լ����쳣��
class IllegalAgeException extends Exception
{
	public IllegalAgeException(String msg)
	{
		super(msg);
	}
}
