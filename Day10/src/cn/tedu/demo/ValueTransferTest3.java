package cn.tedu.demo;

public class ValueTransferTest3 {
	/*
	 * ��������Ĳ����������������ͣ���ʱʵ�θ����βε��ǣ��洢���ݵĵ�ֵַ
	 */

	public static void main(String[] args) {
		Date d = new Date();
		d.m=10;
		d.n=80;
		System.out.println("m="+d.m+",n="+d.n);
		
		//������������ֵ
//		int temp = d.m;
//		d.m=d.n;
//		d.n=temp;
		//��Ӧ��ʽһ
		ValueTransferTest3 v = new ValueTransferTest3();
		v.swap(d);
		System.out.println("m="+d.m+",n="+d.n);
		//��Ӧ��ʽ��
		d.swap();
		System.out.println("m="+d.m+",n="+d.n);
		
		//��ʽ��������ʾ
		Date d0 = new Date();//�½��ռ�
		d0.swap();
		System.out.println("m="+d0.m+",n="+d0.n);

	}
	//��ʽһ
	public void swap(Date d) {
		int temp = d.m;
		d.m=d.n;
		d.n=temp;
	}
}
class Date{
	int m ;
	int n ;
	//��ʽ��
	public void swap() {
		int temp =m;
		m=n;
		n=temp;
	}
	
	
}