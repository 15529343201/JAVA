//解一元二次方程
package chapter3;
import java.util.Scanner;
public class Exercise3_1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a,b,c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		input.close();
		double discriminant = b * b - 4 * a * c;
		
		if(discriminant < 0)
		{
			System.out.println("The equation has no roots");
		}
		else if(discriminant == 0)
		{
            double r1 = -b / (2 * a);
            System.out.println("The root is " + r1);
		}
		else
		{
			double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.println("The roots are " + r1 + " and " + r2);
		}
	}
}
/*
输出:
Enter a,b,c: 1 2 3
The equation has no roots
Enter a,b,c: 1 4 4
The root is -2.0
Enter a,b,c: 1 4 3
The roots are -1.0 and -3.0
*/
