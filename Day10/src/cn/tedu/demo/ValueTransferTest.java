package cn.tedu.demo;

public class ValueTransferTest {
	/*
	 * ������������
	 * ������������
	 * 
	 * ��������ǻ�����������:��ʱ��ֵ���Ǳ������������ݵ�ֵ
	 * ��������������������ͣ���ʱ��ֵ���Ǳ�������������ݵĵ�ֵַ
	 */

	public static void main(String[] args) {
		System.out.println("�����������ͱ���");
		int m = 10;
		int n = 12;
		System.out.println("m="+m+",n+"+n);
		n=89;
		System.out.println("m="+m+",n="+n);
		
		Order o1 = new Order();
		//o1=100;����
		o1.id=1001;
		Order o2=o1;//��ֵ��o1��o2�ĵ�ַ��ͬ����ָ���˶ѿռ��е�ͬһ������ʵ��
		System.out.println("o1.id="+o1.id+",o2.id="+o2.id);
		o2.id =101;
		System.out.println("o1.id="+o1.id+",o2.id="+o2.id);
		

	}

}
class Order{
	int id;//0
	
}
