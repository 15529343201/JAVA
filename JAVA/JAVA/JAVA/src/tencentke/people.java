package tencentke;

public class people 
{
	String name;//姓名
	String sex;//性别
	int age;//年龄
	
	
	public String work()
	{
		return "我在工作";
	}
	
	//带参数的方法，吃东西
	public String eat(String food)
	{
		return "正在吃"+food;
	}
}
