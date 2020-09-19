package cn.tedu.demo;
/*
 * 	�ӿڵ�ʹ�ã�
 * 		1.�ӿڵ�ʹ���������̬
 * 		2.�ӿڣ�ʵ������һ�ֹ淶
 * 		3.�����У����������
 */

public class UsbTest {
	public static void main(String[] args) {
		 Computer c = new Computer();
		 //1.������ʵ����ķ���������
		 Up u = new Up();
		 c.m(u);
		 System.out.println("--------------------");
		 //2.������ʵ�������������
		 c.m(new Up());
		 System.out.println("--------------------");
		 //3.����ʵ����ķ���������
		 Usb phone = new Usb() {

			@Override
			public void atart() {
				System.out.println("�ֻ���ʼ������");
			}
			@Override
			public void stop() {
				System.out.println("�ֻ���������");
			}
		 };
		 c.m(phone);
		 System.out.println("--------------------");
		 //4.����ʵ�������������
		 c.m(new Usb(){

			@Override
			public void atart() {
				System.out.println("��꿪ʼ����");
			}
			@Override
			public void stop() {
				System.out.println("����������");
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
		System.out.println("���崫�������ϸ��");
		usb.stop();
	}
}
interface Usb{
	//���������峤�ȡ���ȡ���С�����ٶ�
	void atart();
	void stop();
}
class Up implements Usb{

	@Override
	public void atart() {
		System.out.println("��ʼ����");
	}
	@Override
	public void stop() {
		System.out.println("��������");
	}
}
class Printer implements Usb{

	@Override
	public void atart() {
		System.out.println("��ӡ����ʼ����");
	}
	@Override
	public void stop() {
		System.out.println("��ӡ����������");
	}
	
}