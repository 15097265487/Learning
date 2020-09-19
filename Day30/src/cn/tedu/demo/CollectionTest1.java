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
 *	����collection�г��õķ���
 */

public class CollectionTest1 {
	@SuppressWarnings("unchecked")
	@Test
	public void test3() {
		@SuppressWarnings("rawtypes")
		Collection c1 = new ArrayList();
		c1.add("AA");
		c1.add(100);//��װ��
		c1.add(new String("MM"));
		c1.add(new Date());
		//9.����----->����
		Object[] array = c1.toArray();
		System.out.println(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("\n");
		//9.����------>����  List<T> Arrays.asList(T...a)       T...a�ɱ��������β�
		String[] ss = new String[] {"a","b","c"};
		List<String> list = Arrays.asList(ss);
		System.out.println(list);
		//10.hashCode()  ��ȡ����Ĺ�ϣֵ
		int hashCode = c1.hashCode();
		System.out.println(hashCode);
		//11.iterator()�����������ڼ��ϵı���
		

		System.out.println("c1:"+c1);
	}
	@SuppressWarnings("unchecked")
	@Test
	public void test2() {
		@SuppressWarnings("rawtypes")
		Collection c1 = new ArrayList();
		c1.add("AA");
		c1.add(100);//��װ��
		c1.add(new String("MM"));
		c1.add(new Date());
		//6.remove(obj)   �ӵ�ǰ�����Ƴ�ָ����objԪ��
		boolean b1 = c1.remove(new Person("����", 18));
		System.out.println(b1);
		System.out.println(c1);
		//removeAll(Collection)�ӵ�ǰ�������Ƴ�c2�����е�Ԫ��
		Collection c2 = new ArrayList();
		c2.add("AA");
		c2.add("dd");
//		b1 = c1.removeAll(c2);
//		System.out.println(b1);
		//7.retainAll(Collection),�Լ���c2û��Ӱ��,
		//c1��c2�����������������ظ���ǰ����c1
		b1 = c1.retainAll(c2);
		System.out.println(b1);
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		
		//8.equals(obj)��ǰ����Ԫ�����βμ���Ԫ����ͬʱ������true
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
		c1.add(100);//��װ��
		c1.add(new String("MM"));
		//c1.add(new Date());
		c1.add(new Person("����", 18));
		System.out.println(c1.contains("MM"));//t
		System.out.println(c1.contains(new String("MM")));//t    ʹ�õ���equals�Ƚ�
		System.out.println(c1.contains(new Person("����", 18)));//û��дequals֮ǰ��f
		
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