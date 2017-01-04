/*
设计一个名为Rectangle,这个类包括： 
两个名为width和height的double型数据域，
它们分别表示矩形的宽和高。width和height的默认值都为1. 
一个无参构造方法。 一个为width和height指定值的矩形构造方法。
一个名为getArea()的方法返回这个矩形的面积。 一个名为getPerimeter()的方法返回这个矩形的周长。
*/
import java.util.Scanner;

class Rectangle
{
	double width,height;
	
	public Rectangle()
	{
		
	}
	
	public Rectangle(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	
	public double getArea()
	{
		return width*height;
	}
	
	public double getPerimeter()
	{
		return 2*(width+height);
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		double w=input.nextDouble();
		double h=input.nextDouble();
		Rectangle myRectangle=new Rectangle(w,h);
		System.out.println(myRectangle.getArea());
		System.out.println(myRectangle.getPerimeter());
		input.close();
	}
}