package day59;
/*
 * 死锁问题:
 *    A线程需要申请资源1才能继续执行，而资源1被线程B所占有。
 *    而线程B需要申请资源2才能继续执行，而资源2被线程A所占有
 *    
 *    线程A现在占有资源2，需要请求资源1
 *    线程B现在占有资源1，需要请求资源2
 */
public class Test 
{
	public static void main(String[] args)
	{
		Resource rs1 = new Resource("资源1");
		Resource rs2 = new Resource("资源2");
		Resource rs3 = new Resource("资源3");
		
		MyThread t1 = new MyThread(rs1,rs2,"线程1");
		MyThread t2 = new MyThread(rs2,rs3,"线程2");
		MyThread t3 = new MyThread(rs3,rs1,"线程3");
	
        t1.start();
        t2.start();
        t3.start();
	}
}
