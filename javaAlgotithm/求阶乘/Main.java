import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		BigInteger sum=new BigInteger("1");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			String temp1=Integer.toString(i);
			BigInteger temp2=new BigInteger(temp1);
			sum=sum.multiply(temp2);
		}
		System.out.println(sum);
		input.close();
	}
}