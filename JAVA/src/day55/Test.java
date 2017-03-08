package day55;
/*
 * 多线程应用
 * 1.多个线程并发执行
 *   Java对于线程启动后唯一能保证的是每个线程都被启动并且结束
 *   。但是对于那个线程先执行，那个后执行，什么时候执行，是没有保证的
 * 2.线程优先级
 *   Java中优先级高的线程有更大的可能性获得cpu，但不是优先级高的总是
 *   先执行，也不是优先级低的线程总是后执行 
 */
public class Test 
{
	public static void main(String[] args)
	{
		MyRunnable1 r1 = new MyRunnable1();
		MyRunnable2 r2 = new MyRunnable2();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		System.out.println("t1的优先级: " + t1.getPriority());
		System.out.println("t2的优先级: " + t2.getPriority());
		
		//给t1设置最高的优先级
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("t1改变之后的优先级是: " + t1.getPriority());
		//给t2设置最低的优先级
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("t2改变之后的优先级是: " + t2.getPriority());
		
		t1.start();
		t2.start();
	}
}
