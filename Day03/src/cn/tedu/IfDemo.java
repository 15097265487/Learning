package cn.tedu;

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		/*
		 * �������ʽ�����ǲ������ʽ���߼����ʽ���ϵ���ʽ������������
		 * ����ֻ��һ��ִ�����ʱ��һ��{}����ʡ�ԣ������鱣��
		 *�� if-else���ṹ��������Ҫ����Ƕ��ʹ��
		 * ��if-else�ṹ�ǡ���ѡһʱ������else�ǿ�ѡ�ģ�������Ҫ����ʡ��
		 * ���������ʱ�����⡱��ϵʱ�������ж���估ִ������˳������ν������������ǡ���������ϵʱ����С�ϴ���/���ϸ��¡�
		 * if(�������ʽ){
		 *    //if����
		 * }
		 * 
		 * if(�������ʽ){
		 *    //if����1
		 * }else{
		 * 	  //if����1
		 * }
		 * 
		 * if(�������ʽ){
		 *    //if����1
		 * }else if(�������ʽ){
		 * 	  //if����2
		 * }else if(�������ʽ){
		 * 	  //if����3
		 * }
		 */
		
		int a = 10;
		if(a>10) {
			System.out.println(a);
		}else {
			System.out.println(a+10);//20
			//a+=10-->a=a+10
			System.out.println(a+=10);//20
			System.out.println(a);//20
		}
		int c = 100;
		if(c>100) {
			System.out.println("����");
		}else {
			System.out.println("Ů��");
		}
		System.out.println("over");
		
		/*
		 * ����ϵͳ
		 *   ������
		 * �ܼ�>100   ����
		 * �ܼ�>400  ����
		 * �ܼ�>800 ����
		 * �ܼ�>1000 ������
		 *���ֵ���������Ʒ�ܼۡ����� 
		 *(�������룺��Ʒ����*����)
		 */
		System.out.println("-----------------����ϵͳ-------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ʒ���ۣ�");
		int price = sc.nextInt();
		System.out.println("��������Ʒ������");
		int num = sc.nextInt();
		
		int money = num*price;
		
		if(money<=100) {
			System.out.println("����Ʒ�����ۣ�");
			money*=money;
		}else if(money>100) {
			money*=0.9;
			System.out.println("����Ʒ���ۣ�"+money*0.9+"Ԫ");
		}else if(money>=400) {
			System.out.println("����Ʒ���ۣ�"+money*0.8+"Ԫ");
			money*=0.8;
		}else if(money>=800) {
			System.out.println("����Ʒ���ۣ�"+money*0.6+"Ԫ");
			money*=0.6;
		}else if(money<=1000) {
			System.out.println("����Ʒ���ۣ�"+money*0.5+"Ԫ");
			money*=0.5;
		}
		//Ӧ�����
	    System.out.println("�ܼۣ�"+money+"Ԫ");
		//ʵ��
		System.out.println("ʵ�ʸ����");
		int d = sc.nextInt();
		int i = d-money;
		if(d<money) {
			System.out.println("���㻹ȱ��"+(money-d)+"Ԫ");
		}else 
			//����=ʵ��-�ܼ�
			System.out.println("���㣺"+i+"Ԫ");
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
