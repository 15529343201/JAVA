package day44;
/*
 * 1 引用外部类的对象
 *   Inner: this.count
 *   Outer: Outer.this.count
 * 2 内部类的继承
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
