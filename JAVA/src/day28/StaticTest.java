package day28;
/*
 * 静态变量是属于类的，和对象没有关系
 * 非静态变量属于某个对象的，每个对象都有该数据的副本，而静态
 * 变量只有一个
 * 
 * 访问静态变量是通过(类名.变量名)来访问的
 */
public class StaticTest
{
	int commonint = 0;//普通变量
    static int staticint = 0;//静态变量
    
    StaticTest(int x)
    {
    	this.commonint = x;
    }
    
    public static void main(String[] args)
    {
    	StaticTest s1 = new StaticTest(1);
    	StaticTest s2 = new StaticTest(2);
    	
    	System.out.println("s1.commonint="+s1.commonint);
    	System.out.println("s2.commonint="+s2.commonint);
    	
    	StaticTest.staticint = 1;
    	System.out.println("s1为staticint赋值为1");
    	System.out.println("s1.staticint="+StaticTest.staticint);
    	System.out.println("s2.staticint="+StaticTest.staticint);
    	System.out.println("s2为staticint赋值为15");
    	StaticTest.staticint = 15;
    	System.out.println("s1.staticint="+StaticTest.staticint);
    	System.out.println("s2.staticint="+StaticTest.staticint);
    }
}
