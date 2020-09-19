package cn.tedu.demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.junit.Test;

/**	数组：
 * 		数组长度一旦声明不可改变
 * 		存储的类型只能存相同的类型（object类型的数组除外）
 * 		数组一旦声明好所能存储的元素的类型就已经确定了，我们也只能对指定类型的数据进行操作。
 * 		数组是有序的 可重复
 * 		对数组进行增删改查不方便
 * 		对数组元素进行操作的方法/属性较少
 * 	集合
 * 	一、集合框架
 * 		Collection接口：单列集合，用来储存一个一个对象
 * 			List接口：有序可重复
 * 				Vector ArrayList LinkedList
 * 			Set接口：无序不可重复
 * 				HashSet LinkHashSet TreeSet
 * 		Map接口：双列集合，key-value
 * 				HashMap LinkHashMap TreeMap
 * 					HashTable Properties
 * 	二、Collection常用方法
 * 		
 * 		1.boolean add(obj)
 * 		  boolean addAll(Collection c)添加集合元素
 * 		2.void clean()
 * 		3.boolean isEmpty()
 * 		4.int size()
 * 		5.boolean contains(obj)
 * 		  boolean containsAll(Collection c)
 * @author UID-ECD
 *
 */
public class CollectionTest {
	@Test
	public void test1() {
		Collection coll = new ArrayList();
		//1.添加增删改查
		coll.add(1);//自动装箱
		coll.add("2");
		coll.add(new String("cc"));
		coll.add(new Date());
		//2.长度
		System.out.println(coll.size());
		Collection coll2 = new ArrayList();
		coll2.add(1);
		coll2.add("2");
		coll.add(coll2);
		
		//3.清空集合
		coll2.clear();
		//4.判断集合是否为空
		System.out.println(coll2.isEmpty());
		
		
		System.out.println(coll.size());
		System.out.println(coll);
		//5.是否包含某个元素
		boolean b = coll.contains(1);
		System.out.println(b);
		System.out.println(coll.contains("AA"));
		System.out.println(coll.contains(new String("CC")));
		//f--->t
		coll.add(new Person("zhangsan", 12));
		System.out.println(coll.contains(new Person("zhangsan",12)));
		//
		Person p = new Person("zhangsan",12);
		coll.add(p);
		System.out.println(coll.contains(p));

		
		
		
		
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
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
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
