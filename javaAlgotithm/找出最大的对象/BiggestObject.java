import java.util.Date;
import java.util.Scanner;
public class BiggestObject
{
	static int i;
	
	public BiggestObject()
	{
		
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] strings = new String[5];
		
		Integer[] list = new Integer[5];
		
		Date[] dates = new Date[10];
		
		for (int i = 0; i < strings.length; i++)
		{
			strings[i] = input.next();
		}
		
		for (int i = 0; i < list.length; i++)
		{
			list[i] = new Integer(input.nextInt());
		}
		
		for (int i = 0; i < dates.length; i++)
		      dates[i] = new Date();
        
		System.out.println("Max string is " + max(strings));
		System.out.println("Max integer is " + max(list));
	    System.out.println("Max circle is " + max(dates));
	    input.close();
	}
	
	public static Object max(Comparable[] a)
	{
		Comparable max = a[0];
		
		for (int i = 1; i < a.length; i++)
		{
			if(max.compareTo(a[i]) < 0)
			{
				max = (Comparable)a[i];
			}
		}
		
		return max;
	}
}
