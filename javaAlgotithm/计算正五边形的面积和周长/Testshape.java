package mooc;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Testshape
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		RPentagon rPentagon = new RPentagon(input.nextDouble());
		DecimalFormat Format = new DecimalFormat();
		Format.setMaximumFractionDigits(4);
		System.out.println(Format.format(rPentagon.getArea()));
		System.out.println(Format.format(rPentagon.getPerimeter()));
		input.close();
	}
}

class RPentagon extends shape
{
	private double side;
	
	public RPentagon(double side)
	{
		this.side = side;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (0.25)*Math.pow(side,2)*Math.sqrt(25+10*Math.sqrt(5));
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 5*side;
	}
	
}

abstract class shape
{
	public abstract double getArea();
	public abstract double getPerimeter();
}