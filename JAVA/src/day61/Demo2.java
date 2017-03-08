package day61;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
/*
 * ------| Collection 单例集合的根接口
 *         | List 如果是实现了List接口的集合类，该集合类具备的特点：有序，可重复
 *         | Set 如果是实现了Set接口的集合类，该集合具备的特点：无序，不可重复
 *       Collection----迭代的方法:
 *          toArray()
 *          iterator()
 *迭代器的作用:就是用于抓取集合中的元素
 *   hasNext()
 *     问是否有下一个元素，如果有元素可以遍历，返回true，否则false
 *   next()
 *     获得元素。。。
 *   void remove
 *   
 *NoSuchElementException 没有元素的异常
 *  出现的原因：没有元素可以被取代了。。。
 *
 */
public class Demo2 
{
	public static void main(String[] args)
	{
		Collection c = new ArrayList();
		c.add("狗娃");
		c.add("狗剩");
		c.add("铁蛋");
		c.add("美美");
		//遍历集合的元素-----》方式一：可以使用toArray()方法
//		Object[] arr = c.toArray();//把集合的元素存储到一个Object数组返回
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]+",");
//		}
		
		//要求使用iterator迭代器遍历
		Iterator it = c.iterator();//返回一个迭代器 疑问：iterator()方法返回一个接口类型，为什么接口又可以调用方法可以使用呢?
	    //iterator实际上返回的是iterator接口的实现类对象
		//System.out.println("有元素可以遍历吗?"+it.hasNext());
		//System.out.println("获取元素: "+it.next());
//		while(it.hasNext())//hasNext()问是否有元素可以遍历
//		{
//			System.out.println("获取元素: "+it.next());
//		}
		
		while(it.hasNext())
		{
			it.next();
		    it.remove();//删除迭代器最后一次返回的元素
		}
		System.out.println("集合的元素: "+c);
	}
}
