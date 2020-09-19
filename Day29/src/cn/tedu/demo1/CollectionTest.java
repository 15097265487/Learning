package cn.tedu.demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.junit.Test;

/**	���飺
 * 		���鳤��һ���������ɸı�
 * 		�洢������ֻ�ܴ���ͬ�����ͣ�object���͵�������⣩
 * 		����һ�����������ܴ洢��Ԫ�ص����;��Ѿ�ȷ���ˣ�����Ҳֻ�ܶ�ָ�����͵����ݽ��в�����
 * 		����������� ���ظ�
 * 		�����������ɾ�Ĳ鲻����
 * 		������Ԫ�ؽ��в����ķ���/���Խ���
 * 	����
 * 	һ�����Ͽ��
 * 		Collection�ӿڣ����м��ϣ���������һ��һ������
 * 			List�ӿڣ�������ظ�
 * 				Vector ArrayList LinkedList
 * 			Set�ӿڣ����򲻿��ظ�
 * 				HashSet LinkHashSet TreeSet
 * 		Map�ӿڣ�˫�м��ϣ�key-value
 * 				HashMap LinkHashMap TreeMap
 * 					HashTable Properties
 * 	����Collection���÷���
 * 		
 * 		1.boolean add(obj)
 * 		  boolean addAll(Collection c)��Ӽ���Ԫ��
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
		//1.�����ɾ�Ĳ�
		coll.add(1);//�Զ�װ��
		coll.add("2");
		coll.add(new String("cc"));
		coll.add(new Date());
		//2.����
		System.out.println(coll.size());
		Collection coll2 = new ArrayList();
		coll2.add(1);
		coll2.add("2");
		coll.add(coll2);
		
		//3.��ռ���
		coll2.clear();
		//4.�жϼ����Ƿ�Ϊ��
		System.out.println(coll2.isEmpty());
		
		
		System.out.println(coll.size());
		System.out.println(coll);
		//5.�Ƿ����ĳ��Ԫ��
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
