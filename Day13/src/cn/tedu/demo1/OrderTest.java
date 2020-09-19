package cn.tedu.demo1;

import cn.tedu.demo2.Order;

public class OrderTest {

	public static void main(String[] args) {
		Order o =  new Order();
		o.orderPublic=1;//不同包下的普通类（非子类），要使用order类
		//不可以调用private、缺省、Protected
		//o.orderProtected=2;不同包下的子类
		o.methodPublic();
		System.out.println(o.toString());

	}
	public void show() {
		
	}

}
