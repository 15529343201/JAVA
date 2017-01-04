/*
���һ����ΪRectangle,���������� 
������Ϊwidth��height��double��������
���Ƿֱ��ʾ���εĿ�͸ߡ�width��height��Ĭ��ֵ��Ϊ1. 
һ���޲ι��췽���� һ��Ϊwidth��heightָ��ֵ�ľ��ι��췽����
һ����ΪgetArea()�ķ�������������ε������ һ����ΪgetPerimeter()�ķ�������������ε��ܳ���
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