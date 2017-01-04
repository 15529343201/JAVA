import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Map<String,Integer> list=new HashMap<String,Integer>();
		int a;
		Scanner input=new Scanner(System.in);
		String str=input.next();
		
		while(!str.equals("noname"))
		{
			a=input.nextInt();
			
			list.put(str, a);
			str=input.next();
		}
		
		String string=input.next();
		if(list.get(string)!=null)
		{
			System.out.println(list.get(string)*0.21);
		}
		else
		{
			System.out.println("Not found.");
		}
		input.close();
	}
}