package cn.tedu.demo;

public class OrderTest {

	public static void main(String[] args) {
		Order o = new Order();
		o.orderDefault=10;
		o.orderPublic=20;
		//��С����private ȱʡ  protected public
		//�ڲ�ͬ���£����ɷ���ȱʡ�Ľṹ������order��֮��˽�еĽṹ�Ͳ��ɵ�����
		o.methodDefault();
		o.methodPublic();

	}

}
