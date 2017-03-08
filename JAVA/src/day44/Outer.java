package day44;
/*
 * 1 �����ⲿ��Ķ���
 *   Inner: this.count
 *   Outer: Outer.this.count
 * 2 �ڲ���ļ̳�
 *   
 */
public class Outer
{
	private int count = 1;
	
	class Inner
	{
		private int count = 2;
		
		public void print(int count)
		{
			System.out.println(count);
			System.out.println(this.count);
			System.out.println(Outer.this.count);
		}
	}
	
	public static void main(String[] args)
	{
		Outer outer = new Outer();
		Outer.Inner i = outer.new Inner();
		i.print(3);
	}

}
