import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		while(input.hasNext())
		{
			String s=input.nextLine();
			char[] str=s.toCharArray();
			Arrays.sort(str);
			System.out.println(str);
		}
		
	}
}