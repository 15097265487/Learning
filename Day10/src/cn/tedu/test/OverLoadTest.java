package cn.tedu.test;
/*
 * 3.�����������ط���max()��
 * ��һ������������intֵ�е����ֵ��
 * �ڶ�������������doubleֵ�е����ֵ��
 * ����������������doubleֵ�е����ֵ��
	���ֱ��������������

 */

public class OverLoadTest {

	public static void main(String[] args) {
		OverLoadTest ov = new OverLoadTest();
		double max = ov.max(1, 1,10);
		System.out.println(max);
		
		int ol = ov.mOL(6);
		System.out.println(ol);
		System.out.println(ov.mOL(5, 10));
		System.out.println(ov.mOL("nihao"));

	}
	public int max(int a,int b) {
		return a>b?a:b;
	}
	public double max(double a,double b) {
		return a>b?a:b;
	}
	public double max(double a,double b,double c) {
		return a>b?(a>c?a:c):(b>c?b:c);
	}
	public int mOL(int a) {
		return a*a;
	}
	public int mOL(int a,int b) {
		return a*b;
	}
	public String mOL(String b) {
		return b;
	}

}
