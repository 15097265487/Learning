package cn.tedu;

import java.util.Scanner;//����  ctrl+shift+o

public class Marry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������ߣ�(cm)");
		int height = sc.nextInt();
		System.out.println("��������ĲƸ���(ǧ��)");
		double money  = sc.nextDouble();
		/*System.out.println("˧��(true/false)");
		boolean f = sc.nextBoolean();
		if(height>=180&&money>1&&f) {//f��������
			System.out.println("��һ���޸���������");
		}else if(height>180 || money>=1 ||f) {
			System.out.println("�ްɣ����ϲ��㣬��������");
		}else {
			System.out.println("��Ҳ���ޣ�");
		}*/
		System.out.println("˧��(��/��)");
		String ishandsome = sc.next();
		if(height>=180&&money>=1&&ishandsome.equals("��")) {//--->"��".equeals(ishandsome)
			System.out.println("��һ���޸���������");
		}else if(height>=180 || money>=1 ||ishandsome.equals("��")) {
			System.out.println("�ްɣ����ϲ��㣬��������");
		}else {
			System.out.println("��Ҳ���ޣ�");
		}
	}
}
