package day40;

public class Outer
{
	private String out_string = "�����ⲿ���һ��˽�����Ե��ַ���";
	
	public int i = 10;
	
	public void useInner()
	{
		Inner in = new Inner();
		in.print();
	}
	
	//�����ڲ���
	class Inner
	{
		public void print()
		{
			System.out.println(out_string);
		}
	}
}
