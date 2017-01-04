import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<String> str=new ArrayList<String>();
		Scanner input=new Scanner(System.in);
		int len=0;
		str.add(input.nextLine());
		while(str.get(len).compareTo("end")!=0)
		{
			len++;
			str.add(input.nextLine());
		}
		String a=input.nextLine();
		String b=input.nextLine();
		String[] ss=new String[len];
		for(int i=0;i<len;i++)
		{
			ss[i]=str.get(i).replace(a,b);
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(ss[i]);
		}
		input.close();
	}
}