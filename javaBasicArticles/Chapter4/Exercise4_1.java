//统计正数和负数的个数然后计算这些数的平均值
package chapter4;
import java.util.Scanner;
public class Exercise4_1 
{
	public static void main(String[] args)
	{
		int countPositive = 0, countNegative = 0;
		int count = 0, total = 0, num;
		
		Scanner input = new Scanner(System.in);
		System.out.print(
		        "Enter an int value, the program exits if the input is 0: ");
		num = input.nextInt();
		
		while (num != 0)
		{
			if (num > 0)
				countPositive++;
			else if (num < 0)
				countNegative++;
			
			total += num;
			count++;
			
			num = input.nextInt();
		}
		
		if (count == 0)
		  System.out.println("You didn't enter any number");
		else 
		{
		  System.out.println("The number of positives is " + countPositive);
		  System.out.println("The number of negatives is " + countNegative);
		  System.out.println("The total is " + total);
		  System.out.println("The average is " + total * 1.0 / count);
	    }
		input.close();
    }
}
