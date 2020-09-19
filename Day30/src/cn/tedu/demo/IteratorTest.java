package cn.tedu.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

/**
 * ���ص������������ڱ���
 * @author UID-ECD
 *
 */
public class IteratorTest {
	@Test
	public void test1() {
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add(true);
		c1.add("ABC");
		//��ʽһ����
		Iterator iterator = c1.iterator();
		//Object n1 = iterator.next();
		//System.out.println(n1);
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		//java.util.NoSuchElementException�쳣
//		//System.out.println(iterator.next());
		
		//��ʽ��
		for(int i=0;i<c1.size();i++) {
			System.out.println(iterator.next());
		}
		//������
		//hasNest():�ж��Ƿ����¸�Ԫ��
		while (iterator.hasNext()) {
			//next():���α�����
			//�ڽ����ƺ��α�ָ��ļ���Ԫ�ط���
			System.out.println(iterator.next());
		}
		
	}
	@Test
	public void test2() {
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add(true);
		c1.add("ABC");
		//����ʽ
		Iterator it = c1.iterator();
		while (it.next()!=null) {
			//next():���α�����
			//�ڽ����ƺ��α�ָ��ļ���Ԫ�ط���
			System.out.println(it.next());
		}
		while(c1.iterator().hasNext()) {
			System.out.println(c1.iterator().next());
		}
		Iterator it1 = c1.iterator();
		Iterator it2 = c1.iterator();
		while(it1.hasNext()) {
			System.out.println(it2.next());
		}
	}
	/*
	 * ����iterator�е�remove����()
	 */
	@Test
	public void test3() {
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add(true);
		c1.add("ABC");
		c1.add(12L);
		c1.add(new String("wqp"));
		
		Iterator it = c1.iterator();
		while(it.hasNext()) {//�Ƿ�����һ��Ԫ��
			//it.remove();//�����java.lang.IllegalStateException
			System.out.println(it.next());
			//it.remove();
			Object obj = it.next();
			if("ABC".equals(obj)) {
				it.remove();
			}
		}
		//��������
		it = c1.iterator();
		while(it.hasNext()) {
			System.out.println("c1:"+it.next());
		}
//		
	}
	@Test
	public void test4() {
		String[] str  = new String[5];
		for(String mystr:str) {
			mystr = "java";
			System.out.print(mystr);
		}
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}//javajavajavajavajavanullnullnullnullnull
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add(true);
		c1.add("ABC");
		for(Object o : c1) {
			System.out.println(o);
		}
	}
}
