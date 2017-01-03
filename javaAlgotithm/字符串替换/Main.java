import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		String x=null;
		Scanner input=new Scanner(System.in);
		String str="";
		x=input.nextLine();
		while(!x.equals("end"))
		{
			str+=x;
			x=input.nextLine();
		}
		String a=input.nextLine();
		String b=input.nextLine();
		input.close();
		String str1=str.replace(a, b+"");
		System.out.println(str1);
	}
}