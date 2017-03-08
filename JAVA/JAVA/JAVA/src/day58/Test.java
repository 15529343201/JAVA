package day58;
/*
 * 同步问题Java的解决方案
 *   同步方法:当线程进入同步方法的时候，会获得同步方法所属对象的锁，一旦获得
 *          对象锁，则其他线程不能再执行被锁对象的其他任何同步方法。
 *          只有在同步方法执行完毕之后释放了锁，其他线程才能执行
 *          synchronized 方法声明
 *          {
 *          }
 *   同步块:
 *          synchronized(资源对象)
 *          {
 *             //需要进行同步的方法
 *          }
 */
public class Test 
{
	public static void main(String[] args)
	{
		Print p = new Print();
		Teacher t1 = new Teacher(p,"博尔特",10,11,12);
		Teacher t2 = new Teacher(p,"加特林",23,56,1);
		Teacher t3 = new Teacher(p,"苏炳添",34,55,90);
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		
		th1.start();
		th2.start();
		th3.start();
	}
}
/*
苏炳添的英文成绩: 34
加特林的英文成绩: 23
博尔特的英文成绩: 10
加特林的语文成绩: 1
苏炳添的语文成绩: 90
博尔特的语文成绩: 12
苏炳添的数学成绩: 55
加特林的数学成绩: 56
博尔特的数学成绩: 11
*/