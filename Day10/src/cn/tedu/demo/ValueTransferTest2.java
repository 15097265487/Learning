package cn.tedu.demo;

public class ValueTransferTest2 {
	/*
	 * ����֮����βεĴ��ݻ��ƣ�ֵ����
	 * 	�βΣ���������ʱ��������С�������棨���Ĳ���
	 * 	ʵ�Σ���������ʱ��ʵ�ʴ��ݸ��βε�����
	 * 	ֵ���ݻ��ƣ�
	 * 		��������Ĳ����ǻ����������ͣ���ʱʵ�θ����βε��ǣ�ʵ����ʵ������ֵ��
	 * 		��������Ĳ����������������ͣ���ʱʵ�θ����βε��ǣ��洢���ݵĵ�ֵַ
	 */

	public static void main(String[] args) {
		int m = 10;
		int n = 100;
		System.out.println("m="+m+",n="+n);
		ValueTransferTest2 v = new ValueTransferTest2();
		v.swap(m, n);
		
		System.out.println("m="+m+",n="+n);

	}
	public void swap(int m,int n) {
		int temp = m;
		m = n;
		n=temp;
	}

}
