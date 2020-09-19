package cn.tedu.demo;
/*
 * 	接口的使用：
 * 		1.接口的使用上满足多态
 * 		2.接口，实际上是一种规范
 * 		3.开发中，体会面向编程
 */

public class UsbTest {
	public static void main(String[] args) {
		 Computer c = new Computer();
		 //1.非匿名实现类的非匿名对象
		 Up u = new Up();
		 c.m(u);
		 System.out.println("--------------------");
		 //2.非匿名实现类的匿名对象
		 c.m(new Up());
		 System.out.println("--------------------");
		 //3.匿名实现类的非匿名对象
		 Usb phone = new Usb() {

			@Override
			public void atart() {
				System.out.println("手机开始工作了");
			}
			@Override
			public void stop() {
				System.out.println("手机结束工作");
			}
		 };
		 c.m(phone);
		 System.out.println("--------------------");
		 //4.匿名实现类的匿名对象
		 c.m(new Usb(){

			@Override
			public void atart() {
				System.out.println("鼠标开始工作");
			}
			@Override
			public void stop() {
				System.out.println("鼠标结束工作");
			}
		 });
		 System.out.println("--------------------");
		 Printer p = new Printer();
		 c.m(p);
	}

}
class Computer{
	public void m(Usb usb) {//Usb usb = new Up();
		usb.atart();
		System.out.println("具体传输的数据细节");
		usb.stop();
	}
}
interface Usb{
	//常量：定义长度、宽度、最小传输速度
	void atart();
	void stop();
}
class Up implements Usb{

	@Override
	public void atart() {
		System.out.println("开始工作");
	}
	@Override
	public void stop() {
		System.out.println("结束工作");
	}
}
class Printer implements Usb{

	@Override
	public void atart() {
		System.out.println("打印机开始工作");
	}
	@Override
	public void stop() {
		System.out.println("打印机结束工作");
	}
	
}