package mooc;
import java.util.Arrays;
import java.util.Scanner;
public class Arr 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		String[] bufs = new String[count];
		for(int i = 0;i < count; i++)
		{
			bufs[i] = new String(input.next());
		}
		Arrays.sort(bufs);
		for(String str : bufs)
			System.out.println(str);
		input.close();
	}
}
