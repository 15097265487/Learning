package cn.tedu.demo1;

import cn.tedu.demo2.Order;

public class OrderTest {

	public static void main(String[] args) {
		Order o =  new Order();
		o.orderPublic=1;//��ͬ���µ���ͨ�ࣨ�����ࣩ��Ҫʹ��order��
		//�����Ե���private��ȱʡ��Protected
		//o.orderProtected=2;��ͬ���µ�����
		o.methodPublic();
		System.out.println(o.toString());

	}
	public void show() {
		
	}

}
