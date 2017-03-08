package day49;
/*
 * 1 手动抛出异常
 *     throw exception;参数exception表示要抛出的异常对象
 *     ，该对象是throwable类的子类，而且只能有一个
 */
public class ThrowTest 
{
	public static void main(String[] args) 
	{
		ThrowTest t = new ThrowTest();
		try {
			t.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public void test() throws Exception//声明异常
	{
		throw new Exception("这是手动抛出的异常");
	}

}

