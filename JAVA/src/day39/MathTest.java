package day39;

public class MathTest 
{
	public static void main(String[] args)
	{
		MTest mt = new MTest();
		System.out.println("ʹ�����ö�����÷���");
		System.out.println("a + b = " + mt.jia(15, 3));
		System.out.println("a - b = " + mt.jian(15, 3));
		System.out.println("a * b = " + mt.cheng(15, 3));
		System.out.println("a / b = " + mt.chu(15, 3));
		
		Jia mJia = mt;
		System.out.println("ʹ�ýӿ��������õ���");
		System.out.println("a + b = " + mJia.jia(15, 3));
	}
}

//�ӷ��Ľӿ�
interface Jia
{
	int jia(int a,int b);
}

interface Jian
{
	int jian(int a,int b);
}

interface Cheng
{
	int cheng(int a,int b);
}

interface Chu
{
	int chu(int a,int b);
}