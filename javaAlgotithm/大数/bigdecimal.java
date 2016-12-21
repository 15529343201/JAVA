package mooc;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class bigdecimal 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		BigDecimal bigNum = new BigDecimal(Long.MAX_VALUE).add(BigDecimal.ONE);
		BigDecimal newBigNum = bigNum.divide(new BigDecimal(n),0,RoundingMode.HALF_DOWN);
		for(int i = 0; i < 3; i++)
		{
			System.out.println(newBigNum.add(new BigDecimal(i)).multiply(new BigDecimal(n)));
		}
		input.close();
	}
}
