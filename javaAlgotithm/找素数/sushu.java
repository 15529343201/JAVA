//ÕÒËØÊı
import java.util.Scanner;
import java.math.BigInteger;
public class sushu
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		BigInteger m;
	    int n;
	    
	    m = input.nextBigInteger();
	    n = input.nextInt();
	    int cnt = 0;
	    while(cnt < n)
	    {
	    	if(m.isProbablePrime(100))
	    	{
	    		System.out.println(m);
	    		cnt++;
	    	}
	    	m=m.nextProbablePrime();
	    }
	    input.close();
	}
}
