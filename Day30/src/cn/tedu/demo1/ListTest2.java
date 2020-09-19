package cn.tedu.demo1;

import java.util.ArrayList;

import org.junit.Test;

/**
 * List接口中常见的方法
 * 		void add(int index, Object ele):在index位置插入ele元素
		boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
		Object get(int index):获取指定index位置的元素
		int indexOf(Object obj):返回obj在集合中首次出现的位置
		int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
		Object remove(int index):移除指定index位置的元素，并返回此元素
		Object set(int index, Object ele):设置指定index位置的元素为ele
		List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合

 */
public class ListTest2 {
	@Test
	public void test1() {
		ArrayList list = new ArrayList();
		list.add(123);
		list.add("AAA");
		list.add(true);
		list.add(12L);
		list.add(list.size(),true);
		//list.add(5,2222);//java.lang.IndexOutOfBoundsException
		
		ArrayList list2 = new ArrayList();
		list2.add(123);
		list2.add("AAA");
		list2.add(true);
		list.addAll(0,list2);//[123, AAA, true, 123, AAA, true, 12, true]
		System.out.println(list.toString());
	}
	@Test
	public void test2() {
		int i = 10;
		int j = 15;
		if(i>j)
		  i++;
		j++;
		System.out.println(i+j);
	}

}
