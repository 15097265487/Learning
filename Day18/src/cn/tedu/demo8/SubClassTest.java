package cn.tedu.demo8;

public class SubClassTest {
	public static void main(String[] args) {
		SubClass s = new SubClass();
		// s.m1;
		// SubClass.m1;
		// 1.�ӿ��ж���ľ�̬������ֻ��ͨ���ӿ�������
		InterfaceTest.m1();
		// 2.ͨ��ʵ����Ķ��󣬿��Ե��ýӿ��е�Ĭ�Ϸ�����
		// a.���ʵ������д�˽ӿ��е�Ĭ�Ϸ�����������д��ķ���
		s.m2();
		// 3.
		s.m3();
		// 4.������ԭ��
		s.m4();

	}

}

class SubClass extends SuperClass implements InterfaceTest, InterfaceTest1 {
	@Override
	public void m3() {
		// InterfaceTest1.super.m3();
		System.out.println("SubClass:m3()");
	}

	@Override
	public void m2() {
		System.out.println("SubClass:m2()");
	}
}