package cn.tedu;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����������������ֵ
		int a = 6;
		int b = 20;
		//ȡ��
		System.out.println(b%a);
		double d = 100.2;
		double c = b+d+a;
		System.out.println(c);
		
		byte f = 20;
		byte f1 = 40;
		//byte f2 = f+f1;�﷨�������Ͳ�ƥ��
		byte f2 = (byte)(f+f1);//ǿ��ת��Ϊbyte����
		//�Զ�����int����
		int f3 = f+f1;
		System.out.println(f2);
		System.out.println(f3);
		
		
		int i = 8;
		boolean i1 =(i>3);
		boolean i2 = (i1==true);
		System.out.println(i1);
		
		
		boolean a1 = true;
		boolean a2 = false;
		boolean	a3 = a1 || a2;
		a3 = a1 && a2;
		a3 = !a1;

	}

}
