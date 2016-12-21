package mooc;
import java.sql.Date;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
import java.util.Scanner;
public class date 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		long time = input.nextLong();
		int day = input.nextInt();
		Date date = new Date(time);
		System.out.println(date.toString());
		date.setTime(time + ((long)day) * 24 * 60 * 60 * 1000);
		System.out.println(date.toString());
		input.close();
	}
}
