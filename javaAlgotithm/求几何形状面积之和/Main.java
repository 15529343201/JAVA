//求几何形状的面积之和
import java.util.Scanner;
import java.text.DecimalFormat;

abstract class shape
{
	public abstract double getArea();
	public abstract double getPerimeter();
}

class Circle extends shape
{
	private double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2.0*Math.PI*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}

class Rectangle extends shape
{
	private double width;
	private double height;
	
	public Rectangle(double width,double height)
	{
		this.height = height;
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}
}

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#.####");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		shape[] sh = new shape[4];
		sh[0] = new Circle(a);
		sh[1] = new Circle(b);
		sh[2] = new Rectangle(c,d);
		sh[3] = new Rectangle(e,f);
		
		System.out.println("The total area is " + decimalFormat.format(sumArea(sh)));
		input.close();
	}
	
	public static double sumArea(shape[] a)
	{
		double sum = 0.0;
		for(int i = 0; i < 4; i++)
		{
			if(a[i] != null)
			{
				double area = a[i].getArea();
				sum += area;
			}
		}
		return sum;
	}
}