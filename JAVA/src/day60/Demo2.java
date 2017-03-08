package day60;
import java.util.ArrayList;
import java.util.Collection;
/*
 * 集合：集合是存储对象数据的集合容器。
 * 
 * 集合比数组的优势：
 *    1.集合可以存储任意类型的对象数据，数组只能存储同一种数据类型的数据
 *    2.集合的长度是会发生变化的，数组的长度是固定的。
 *    
 * -----| Collection 单例集合的根接口
 * --------| List 如果是实现了List接口的集合类，具备的特点：有序，可重复
 * --------| Set  如果是实现了Set接口的集合类，具备特点：无序，不可重复
 * 
 * Collection中的方法:
 *   增加：
 *      add(E e) 添加成功返回true，添加失败返回false
 *      addAll(Collection c) 把一个集合添加到另外一个集合去
 *   删除：
 *      clear() 
 *      remove(Object o)
 *      removeAll(Collection<?> c)
 *      retainAll(Collection<?> c)
 *   查看:
 *      size()
 *   判断：
 *      contains(Object o)
 *      containsAll(Collection<?> c)
 *      isEmpty()
 *   迭代:
 *      toArray()
 *      iterator()
 */
public class Demo2 
{
	public static void main(String[] args)
	{
		//Collection c = new Collection();//错误，接口不能实例化
        Collection c = new ArrayList();//使用多态，使用实现类
        c.add("abc");
        c.add(1);
        System.out.println("添加成功吗?" + c.add(3.15));
        System.out.println("集合的元素: " + c);
        
        //创建集合
//        Collection c2 = new ArrayList();
//        c2.add("王林");
//        c2.add("房祖名");
//        
//        c.addAll(c2);//把c2的元素添加到c中
        
        //删除方法
        //c.clear();//clear()清空集合中的元素
        //System.out.println("删除成功吗?" + c.remove(1));//remove指定集合中的元素，删除成功返回true，失败false
        //c.removeAll(c2);//删除c集合中与c2中交集元素；
        //c.retainAll(c2);//保留c集合中与c2的交集元素，其他的元素一并删除
        
        //查看
        System.out.println("查看集合元素个数：" + c.size());
        
        System.out.println("集合的元素: " + c);
	}
}
