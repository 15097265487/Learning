package cn.tedu.test;

public class OverloadDemo {
	/*
	 * ����������
	 * �����ͬһ�����У���������ͬ�������б�ͬ
	 *�ص㣺�뷵��ֵ�����޹أ�����Ȩ���޹أ��β����޹�
	 */

	public static void main(String[] args) {
		OverloadDemo ov = new OverloadDemo();
		String str = ov.getsum();
		System.out.println(str);
		ov.getsum(0, 0.0);//�Զ�ƥ��
	}
	//�ӷ�����
	public void getsum(int a,int b) {
		System.out.println("1");
	}
	public void getsum(double a,double b) {
		System.out.println(2);
	}
	public void getsum(String s,int i) {
		System.out.println("3");
	}
	public void getsum(int i,String s) {
		System.out.println("4");
	}
	public String getsum(String s) {
		return "5";
	}
	public String getsum() {
		return "6";
	}
//���´���
//	public int getsum(int i,int j) {
//		return;
//	}
//	public void getsum(int i,int j) {
//		
//	}
//	private void getsum(int i,int j) {
//		
//	}

}
