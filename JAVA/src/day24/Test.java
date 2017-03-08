package day24;
/*
 * 方法的重载
 *   在一个类中可以有多个方法共享同一个名称
 *   只要他们的参数不同就可以，根据参数类型
 *   和参数数量来决定要调用的方法
 *   
 *   重载：具有相同的方法名称，不同的参数列表
 *   不同的参数列表指的是:参数类型不同，参数数量不同，参数次序不同
 *   
 *   public static int sum(int a,int b){}
 *   我们再确定是否重载的时候，判定依据是sum(int a,int b)
 *   至于public static int 这几个东西，我们不理会
 */
public class Test 
{
	public static void main(String[] args)
	{
		//Compute c = new Compute();
	    int sum = Compute.sum(3, 4);
		//int sum = c.sum(3, 4);
		System.out.println(sum);
		
		int sum1 = Compute.sum(5,1,2);
		System.out.println(sum1);
		
		double sum2 = Compute.sum(4.5,3.9);
		System.out.println(sum2);
	}
}
