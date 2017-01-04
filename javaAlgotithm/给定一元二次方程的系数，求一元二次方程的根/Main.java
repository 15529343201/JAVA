import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		while(input.hasNext())
		{
			double a=input.nextDouble();
			double b=input.nextDouble();
			double c=input.nextDouble();
			double t=b*b-4*a*c;
			if(Math.abs(t-0)<10e-6)
			{
				System.out.printf("The root is:%.2f.\n",-b/(2*a));
			}
			else if((t-0)>10e-6)
			{
				System.out.printf("The roots are %.2f and %.2f.\n",(-b+Math.sqrt(t))/(2*a),(-b-Math.sqrt(t))/(2*a));
			}
			else
			{
				System.out.printf("The equation has no real roots.\n");
			}
		}
		input.close();
	}
}