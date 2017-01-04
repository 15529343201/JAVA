import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Map<String,String> list=new HashMap<String,String>();
		String s;
		Scanner input=new Scanner(System.in);
		String a=input.next();
		
		while(!a.equals("noname"))
		{
			s=input.next();
			list.put(a,s);
			a=input.next();
		}
		
		String str=input.next();
		if(list.get(str)!=null)
		{
			System.out.println(list.get(str));
		}
		else
		{
			System.out.println("Not found.");
		}
		input.close();
	}
}