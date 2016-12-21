import java.util.Scanner;
public class geshiyichang 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean ok = true;
		int a = 0,b = 0;
		while(ok)
		{
			try
			{
				a = input.nextInt();
				b = input.nextInt();
				ok = false;
			}
			catch(Exception e)
			{
				System.out.println("Incorrect input and re-enter two integers:");
				input = new Scanner(System.in);
				ok = true;
			}
		}
		System.out.println("Sum is " + (a + b));
		input.close();
	}
}
