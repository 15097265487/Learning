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
		// 3.���ʵ����ʵ���˶���ӿڣ�������ӿ��ж�����ͬ��ͬ�εķ�������ôʵ����û����д�˷���������£�����----->�ӿڳ�ͻ
		//   ��ô��Ҫʵ������д�������
		s.m3();
		// 4.������ԭ�����ʵ����ʵ���˶���ӿڣ�������ӿ�����ͬ��ͬ�ε�Ĭ�Ϸ������̳и�����Ҳ�кͽӿ���һ���ķ�����
		//   ��ô������û����д�˷���������£�Ĭ�ϵ��õ��Ǹ����е�ͬ��ͬ�εķ���
		s.m4();
		s.test();
		

	}

}

class SubClass extends SuperClass implements InterfaceTest, InterfaceTest1 {
	@Override
	public void m3() {
		// InterfaceTest1.super.m3();
		System.out.println("SubClass:m3()");
	}
	/*
	 * (non-Javadoc)
	 * @see cn.tedu.demo8.InterfaceTest#m2()
	 * 5.������ȥ���ø��࣬�ӿ��б���д�ķ���
	 */

	@Override
	public void m2() {
		System.out.println("SubClass:m2()");
	}
	public void test() {
		m3();//���õ����Լ�����д�ķ���
		m4();
		super.m4();//���ø����m4����    super
		//���ýӿ��е�Ĭ�Ϸ���
		InterfaceTest.super.m3();
		InterfaceTest.super.m2();
	}
}