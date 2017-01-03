import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		GregorianCalendar g=new GregorianCalendar();
		g.setTimeInMillis(input.nextLong());
		System.out.println(g.get(Calendar.YEAR)+"-"+g.get(Calendar.MONTH)+"-"+g.get(Calendar.DAY_OF_MONTH));
	    input.close();
	}
}