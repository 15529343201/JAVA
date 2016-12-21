//打印2到1000之间的素数
package chapter4;

public class Exercise4_20 
{
	public static void main(String[] args)
	{
		int count = 1;
		int number =2;
		boolean isPrime = true;
		
		System.out.println("The prime number from 2 to 1000 are \n");
		
		while(number <= 1000)
		{
			isPrime = true;
			
			for(int divisor = 2; divisor <= number / 2; divisor++)
			{
				if(number % divisor == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
			{
				if(count % 8 == 0)
					System.out.println(number);
				else
					System.out.print(number + " ");
				count++;
			}
			number++;
		}
	}
}
