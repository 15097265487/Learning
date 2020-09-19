package cn.tedu.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.junit.Test;

/**
 * 
 * @author UID-ECD
 *	集合collection中常用的方法
 */

public class CollectionTest1 {
	@SuppressWarnings("unchecked")
	@Test
	public void test3() {
		@SuppressWarnings("rawtypes")
		Collection c1 = new ArrayList();
		c1.add("AA");
		c1.add(100);//包装类
		c1.add(new String("MM"));
		c1.add(new Date());
		//9.集合----->数组
		Object[] array = c1.toArray();
		System.out.println(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("\n");
		//9.数组------>集合  List<T> Arrays.asList(T...a)       T...a可变数量的形参
		String[] ss = new String[] {"a","b","c"};
		List<String> list = Arrays.asList(ss);
		System.out.println(list);
		//10.hashCode()  获取对象的哈希值
		int hashCode = c1.hashCode();
		System.out.println(hashCode);
		//11.iterator()迭代器：用于集合的遍历
		

		System.out.println("c1:"+c1);
	}
	@SuppressWarnings("unchecked")
	@Test
	public void test2() {
		@SuppressWarnings("rawtypes")
		Collection c1 = new ArrayList();
		c1.add("AA");
		c1.add(100);//包装类
		c1.add(new String("MM"));
		c1.add(new Date());
		//6.remove(obj)   从当前集合移除指定的obj元素
		boolean b1 = c1.remove(new Person("张三", 18));
		System.out.println(b1);
		System.out.println(c1);
		//removeAll(Collection)从当前集合中移除c2中所有的元素
		Collection c2 = new ArrayList();
		c2.add("AA");
		c2.add("dd");
//		b1 = c1.removeAll(c2);
//		System.out.println(b1);
		//7.retainAll(Collection),对集合c2没有影响,
		//c1与c2交集，并将交集返回给当前集合c1
		b1 = c1.retainAll(c2);
		System.out.println(b1);
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		
		//8.equals(obj)当前集合元素与形参集合元素相同时，返回true
		b1 = c1.equals(c2);
		Collection c3 = new ArrayList();
		c3.add("AA");
		c3.add("dd");
		b1 = c2.equals(c3);
		System.out.println(b1);//true
		
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void test1() {
		@SuppressWarnings("rawtypes")
		Collection c1 = new ArrayList();
		c1.add("AA");
		c1.add(100);//包装类
		c1.add(new String("MM"));
		//c1.add(new Date());
		c1.add(new Person("张三", 18));
		System.out.println(c1.contains("MM"));//t
		System.out.println(c1.contains(new String("MM")));//t    使用的是equals比较
		System.out.println(c1.contains(new Person("张三", 18)));//没重写equals之前是f
		
		Collection c2 = new ArrayList();
		c2.add("aa");
		c2.add("dd");
		
		c1.addAll(c2);
		c1.add(c2);
		System.out.println(c1);
		
		boolean b = c1.containsAll(c2);
		System.out.println(b);
		
		
		
		
	}
}
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}