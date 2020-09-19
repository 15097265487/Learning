package cn.tedu.demo1;

import java.util.ArrayList;

import org.junit.Test;

/**
 * List�ӿ��г����ķ���
 * 		void add(int index, Object ele):��indexλ�ò���eleԪ��
		boolean addAll(int index, Collection eles):��indexλ�ÿ�ʼ��eles�е�����Ԫ����ӽ���
		Object get(int index):��ȡָ��indexλ�õ�Ԫ��
		int indexOf(Object obj):����obj�ڼ������״γ��ֵ�λ��
		int lastIndexOf(Object obj):����obj�ڵ�ǰ������ĩ�γ��ֵ�λ��
		Object remove(int index):�Ƴ�ָ��indexλ�õ�Ԫ�أ������ش�Ԫ��
		Object set(int index, Object ele):����ָ��indexλ�õ�Ԫ��Ϊele
		List subList(int fromIndex, int toIndex):���ش�fromIndex��toIndexλ�õ��Ӽ���

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
