package cn.tedu;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����빷������:");
		int age = sc.nextInt();
		if(age>=0&&age<=2) {
			System.out.println("�൱���˵�����ģ�"+age);
		}else if(age>2){
			System.out.println("�൱���˵������"+(2*10.5+(age-2)*4)+"��");
		}else {
			System.out.println("��ֻ����û����");
		}
		
	}

}
