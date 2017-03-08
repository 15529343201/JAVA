package day40;

public class Outer
{
	private String out_string = "这是外部类的一个私有属性的字符串";
	
	public int i = 10;
	
	public void useInner()
	{
		Inner in = new Inner();
		in.print();
	}
	
	//创建内部类
	class Inner
	{
		public void print()
		{
			System.out.println(out_string);
		}
	}
}
