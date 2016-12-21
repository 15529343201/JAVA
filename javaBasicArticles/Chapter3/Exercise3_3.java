//求解2*2线性方程
package chapter3;
import java.util.Scanner;
public class Exercise3_3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	    System.out.print("Enter a, b, c, d, e, f: ");
	    double a = input.nextDouble();
	    double b = input.nextDouble();
	    double c = input.nextDouble();
	    double d = input.nextDouble();
	    double e = input.nextDouble();
	    double f = input.nextDouble();
	    input.close();

	    double detA = a * d - b * c;
	    
	    if (detA == 0) 
	    {
	        System.out.println("The equation has no solution");
	    }
	    else 
	    {
	        double x = (e * d - b * f) / detA;
	        double y = (a * f- e * c) / detA;
	        System.out.println("x is " + x + " and y is " + y);
	    }
	}
}
