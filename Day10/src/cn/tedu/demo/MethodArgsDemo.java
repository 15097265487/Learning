package cn.tedu.demo;

public class MethodArgsDemo {
	/*
	 * �ɱ�����βεķ�����
	 * 	1.JDK5.0����
	 * 	2.��ʽ����������...������
	 * 	3.�����ÿɱ�����βεķ���ʱ�����Դ���Ĳ���������0�����
	 * 	4.�ɱ�����βεķ����뱾���еķ�������ͬ���ββ�ͬ�ķ�����
	 * 	5.�ɱ�����βεķ����뱼�׷�������ͬ���β�����Ҳ��ͬ������֮�䲻��������
	 * 	6.�ɱ䷽���β��ڷ�����ֻ����һ���ɱ��β�
	 * 	7.�ɱ�����β��ڷ����β��У��ɱ��βα���������ĩβ
	 * 
	 */

	public static void main(String[] args) {
		MethodArgsDemo me = new MethodArgsDemo();
		me.show("1","2");

	}
	public void show(int i) {
		
	}
	public void show(String s ) {
		System.out.println("Show(string)");
	}
	public void show(String...strs) {
		System.out.println("show(String...strs)");
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]+" ");
		}
		System.out.println();
	}
	//�������ϸ�����ͬʱ����
//	public void show(String[] s ) {
//		System.out.println("Show(string)");
//	}


}
