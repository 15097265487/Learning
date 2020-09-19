package cn.tedu.demo;

public class OrderTest {

	public static void main(String[] args) {
		Order o = new Order();
		o.orderDefault=10;
		o.orderPublic=20;
		//从小到大：private 缺省  protected public
		//在不同报下，不可访问缺省的结构，出了order类之后，私有的结构就不可调用了
		o.methodDefault();
		o.methodPublic();

	}

}
