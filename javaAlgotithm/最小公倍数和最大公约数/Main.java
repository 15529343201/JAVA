//求最大公约数和最小公倍数
import java.util.Scanner;
public class MaxCommonDivisorAndMinCommonMultiple 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		if(num1 > 1000 || num2 > 1000)
		{
			System.out.println("please enter a number less than 1000");
		}
		
		System.out.print(maxCommonDivisor(num1, num2) + " ");// 调用maxCommonDivisor()方法  
        System.out.print(minCommonMultiple(num1, num2));// 调用minCommonMultiple()方法
		input.close();
	}
	
	//求最大公约数
	public static int maxCommonDivisor(int m, int n)
	{
		if(m < n)
		{
			int temp = m;
			m = n;
			n = temp;
		}
		while(m % n != 0)
		{
			int temp = m % n;
			m = n;
			n = temp;
		}
		return n;
	}
	
	//求最小公倍数
	public static int minCommonMultiple(int m, int n)
	{  
        return m * n / maxCommonDivisor(m, n);  
    }
}
