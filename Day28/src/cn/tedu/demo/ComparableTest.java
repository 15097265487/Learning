package cn.tedu.demo;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

/*
 * 	java������������бȽϣ��������==����=��equals()
 * 		���ʵ�����������Ĵ�С�Ƚ�
 * 			ʹ�ýӿ�Comparable  Comparator
 * 	һ��ʵ��Comparable�ӿ�   ��Ȼ����
 * 	
 */
public class ComparableTest {
	/*
	 *һ��ʵ��Comparable�ӿ�   ��Ȼ����
	 *	1.Stringʵ����Comparable����д��CompareTo(obj)
	 *	2.CompareTo(obj)�ȽϹ��������ǰ����this�����βζ����򷵻�������
	 *						        �����ǰ����thisС���βζ����򷵻ظ�����
	 *						        �����ǰ����this�����βζ����򷵻�0
	 *�����Զ����࣬�����Ҫ�������򣬿������Զ�����ȥʵ��Comparable�ӿڣ�
	 *	��дCompareTo(obj)��������CompareTo(obj)����ָ���������
	 */
	@Test
	public void test1() {
		
		String[] arr  = new String[] {"AA","ZZ","SS","BB"};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Goods[] gs = new Goods[4];
		gs[0] = new Goods("lenovoMouse",100);
		gs[1] = new Goods("huaiweiMouse",92);
		gs[2] = new Goods("dellMouse",99);
		gs[3] = new Goods("miMouse",100);
		Arrays.sort(gs);
		System.out.println(Arrays.toString(gs));
		//gs[0].compareTo(arr[0]);--------------->java.lang.RuntimeException: ������������Ͳ�һ��
	}
	/*
	 * ��ʽ������������
	 * 	��������java.util.Comparator
	 * 	����������ʵ����Comparaable�ӿڵĹ����������ʱ����String�������޸ĵ�ǰ�ıȽϷ�������ô�Ϳ���Comparator
	 * 		�Ķ���������
	 * 	�ȽϹ���
	 * 		���������������������ʾo1��o2
	 * 		�������0 �����
	 * 		����������ظ���������ʾo1��o2
	 */
	@Test
	public void test2() {
		String[] ss = new String[] {"QQ","AA","ZZ","DD"};
		//�Ӵ�С
		Arrays.sort(ss,new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof String && o2 instanceof String) {
					String s1 = (String) o1;
					String s2 = (String) o2;
					return -s1.compareTo(s2);
				}
				//return 0;
				throw new RuntimeException("�������Ͳ�һ��");
			}
		});
		System.out.println(Arrays.toString(ss));
	}
	@Test
	public void test3() {
		Goods[] gs = new Goods[4];
		gs[0] = new Goods("lenovoMouse",100);
		gs[1] = new Goods("huaiweiMouse",92);
		gs[2] = new Goods("dellMouse",99);
		gs[3] = new Goods("miMouse",100);
		Arrays.sort(gs);//�۸��������ƽ���
		Arrays.sort(gs,new Comparator() {
			//�۸��򣬸�-----����     ���ƽ���
			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Goods && o2 instanceof Goods) {
					Goods g1 = (Goods) o1;
					Goods g2 = (Goods) o2;
//					if(g1.price>g2.price) {
//						return 1;
//					}else if(g1.price<g2.price) {
//						return -1;
//					}else {
//						return -g1.name.compareTo(g2.name);
//					}
					//�������򣬼۸�����
					if(g1.name.equals(g2.name)) {
						//������ͬ���Ƚϼ۸�����
						return Double.compare(g1.price, g2.price);
					}else {
						return g1.name.compareTo(g2.name);
					}
				}
				//return 0;
				throw new RuntimeException("�������ʹ���");
			}
		});
		System.out.println(Arrays.toString(gs));
	}
}
class Goods implements Comparable{
	String name;
	double price;
	
	public Goods() {
		super();
	}

	public Goods(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Object o) {
		//�۸����򣬲�Ʒ��������(�ӵ͵���)    �Ӹߵ��Ϳ��Լӣ�-��
		if(o instanceof Goods) {
			Goods g = (Goods) o;
			//��ʽһ
			if(this.price>g.price) {
				return 1;
			}else if(this.price<g.price) {
				return -1;
			}else {
//				return 0;
				return -this.name.compareTo(g.name);
			}
			//��ʽ��
//			return Double.compare(this.price, g.price);
		}
//		return 0;
		throw new RuntimeException("������������Ͳ�һ��");
	}
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
}