import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		double a,b,c,area,l;
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		if(a+b<=c||a+c<=b||b+c<=a)
		{
			System.out.println("It can not be created a triangle.");
		}
		else
		{
			l=(a+b+c)/2;
			area=Math.sqrt(l*(l-a)*(l-b)*(l-c));
			System.out.printf("The area is: %.3f.", area);
		}
		input.close();
		
	}
}