package cn.tedu.demo;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

/*
 * 	java中两个对象进行比较，正常情况==、！=、equals()
 * 		如何实现两个对象间的大小比较
 * 			使用接口Comparable  Comparator
 * 	一、实现Comparable接口   自然排序
 * 	
 */
public class ComparableTest {
	/*
	 *一、实现Comparable接口   自然排序
	 *	1.String实现了Comparable，重写了CompareTo(obj)
	 *	2.CompareTo(obj)比较规则，如果当前对象this大于形参对象，则返回正整数
	 *						        如果当前对象this小于形参对象，则返回负整数
	 *						        如果当前对象this等于形参对象，则返回0
	 *对于自定义类，如果需要进行排序，可以让自定义类去实现Comparable接口，
	 *	重写CompareTo(obj)方法，在CompareTo(obj)方法指明排序规则
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
		//gs[0].compareTo(arr[0]);--------------->java.lang.RuntimeException: 传入的数据类型不一致
	}
	/*
	 * 方式二：定制排序
	 * 	定制排序：java.util.Comparator
	 * 	背景：当类实现了Comparaable接口的规则进行排序时，如String，不能修改当前的比较方法，那么就考虑Comparator
	 * 		的对象来排序
	 * 	比较规则：
	 * 		如果方法返回正整数，表示o1》o2
	 * 		如果返回0 则相等
	 * 		如果方法返回负整数，表示o1《o2
	 */
	@Test
	public void test2() {
		String[] ss = new String[] {"QQ","AA","ZZ","DD"};
		//从大到小
		Arrays.sort(ss,new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof String && o2 instanceof String) {
					String s1 = (String) o1;
					String s2 = (String) o2;
					return -s1.compareTo(s2);
				}
				//return 0;
				throw new RuntimeException("数据类型不一致");
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
		Arrays.sort(gs);//价格升序，名称降序
		Arrays.sort(gs,new Comparator() {
			//价格降序，高-----》低     名称降序
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
					//名称升序，价格升序
					if(g1.name.equals(g2.name)) {
						//名称相同，比较价格（升序）
						return Double.compare(g1.price, g2.price);
					}else {
						return g1.name.compareTo(g2.name);
					}
				}
				//return 0;
				throw new RuntimeException("数据类型错误");
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
		//价格升序，产品名称排序(从低到高)    从高到低可以加（-）
		if(o instanceof Goods) {
			Goods g = (Goods) o;
			//方式一
			if(this.price>g.price) {
				return 1;
			}else if(this.price<g.price) {
				return -1;
			}else {
//				return 0;
				return -this.name.compareTo(g.name);
			}
			//方式二
//			return Double.compare(this.price, g.price);
		}
//		return 0;
		throw new RuntimeException("传入的数据类型不一致");
	}
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
}