import java.math.BigDecimal;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		char[] key={'+','-','*','/'};
		int len=-1;
		int flag=0;
		for(int i=0;i<key.length;i++)
		{
			len=s.indexOf(key[i]);
			if(len!=-1)
			{
				flag=i;
				break;
			}
		}
		BigDecimal m=new BigDecimal(s.substring(0,len));
		BigDecimal n=new BigDecimal(s.substring(len+1));
		switch(flag)
		{
		    case 0:
		    {
		    	System.out.println(m.add(n));
		    	break;
		    }
		    case 1:
		    {
		    	System.out.println(m.subtract(n));
		    	break;
		    }
		    case 2:
		    {
		    	System.out.println(m.multiply(n));
		    	break;
		    }
		    case 3:
		    {
		    	System.out.println(m.divide(n));
		    	break;
		    }
		}
		input.close();
	}
}