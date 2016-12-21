package chapter6;
//计算数字的出现次数
public class Exercise6_3
{
	public static void main(String[] args)
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] counts = new int[100];
		
		System.out.print("Enter the integers between 1 and 100: ");
		
		int number = input.nextInt();
		while (number != 0)
		{
			counts[number - 1]++;
			number = input.nextInt();
		}
		
		for (int i = 1; i < 100; i++) 
		{
		      if (counts[i] > 0)
		        System.out.println((i + 1) + " occurs " + counts[i]
		          + ((counts[i] == 1) ? " time" : " times"));
		}
		input.close();
	}
}
