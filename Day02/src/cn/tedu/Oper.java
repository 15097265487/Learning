package cn.tedu;

import java.util.Scanner;

public class Oper {

	public static void main(String[] args) {
		/**
		 * �����
		 * 
		 * ++��--
		 * ����ʹ�ã�����ǰ��û������
		 * ��ʹ��
		 *   ++��ǰ��������������
		 *   ++�ں������������
		 */
		String str = "";
		int a = 6;
		str = a+"";
		//str--->int
		int i = Integer.parseInt(str);
		System.out.println(i);
		
		int a1 = 10;
		int a2 = 10;
		a1++;
		++a2;
		System.out.println(a1);//11
		System.out.println(a2);//11
		//++���ڱ������������a1�����ֵ11��������
		System.out.println(a1++);//11
		//++��ǰ�棬�����������㡣
		System.out.println(++a2);//12
		
		a=10;a1=12;
		
		int c = 10,d=10;
		int s = a++ + ++a1 + a-- + a1++;//10+13+11+13=47
		//���a b s��ֵ
		System.out.println(a);//10
		System.out.println(a1);//14
		System.out.println(s);//47
		/*
		 * s = 10+13+11+13=47
		 * ʵ�ʵ�ֵ��a 11  10
		 *        b  13  14
		 */
		s = a++ + a1++ +a1-- + ++a;//10+14+15+12
		System.out.println(s);//51
		
		/*
		//scanner�����ͱ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������:");
		int num = sc.nextInt();
		int e = num/100;
		int f = num%100/10;
		int g = num%10;
		System.out.println("��λ:"+e);
		System.out.println("ʮλ:"+f);
		System.out.println("��λ:"+g);
		*/
		
		
		//��ֵ�����
		int n=10;
		int m = 10;
		m += 10;//m+10     20
		m = (int)(m+10.9);//double--->int    20+10
		
		//n=n+22;n=10+22      10+22   (n++)+(++n)
		n+=(n++)+(++n);//n+22   10+12=22+n=32
		System.out.println(n);
		System.out.println(m);//   
		
		//��ϵ��������������boolean�ͣ�Ҫô��true��Ҫô��false
		//==  != <  >  <=  >=
		
		boolean t = true,f=false;
		System.out.println(t == f);
		System.out.println(m = n);//��n��ֵ��ֵ��m
		
		//�߼��������&�߼���        |�߼���       !�߼���        &&��·��          ||��·��           ^�߼����
		/*
		 * & &&���ҽ���������������Ϊ�棬������Ϊ��        
		 * 		��&&��һ�����ʽ���Ϊ��ʱ�����治��ִ��
		 * 		��&��һ�����ʽ���Ϊ��ʱ�������ִ��
		 * ����κ������������κ�һ��Ϊ�棬����Ϊ��
		 * �������Ϊtrue�����߼�����������õ�false��
		 */
		m = 6;n = 6;
		boolean bo1 = m>10 & m++>0;   
		m=6;
		boolean bo2 = m>10 && n++>0;
		System.out.println(bo1+","+bo2);  //
		System.out.println(m+","+n);
		
		/*
		 * ����κ������������κ�һ��Ϊ�棬����Ϊ��
		 * 		��||��һ�����ʽ���Ϊ��ʱ�����治��ִ��
		 * 		��|��һ�����ʽ���Ϊ��ʱ�������ִ��
		 */
		m = 6;n = 6;
		bo1 = m<10 | m++>0;
		m=6;
		bo2 = m<10 || n++>0;
		System.out.println(bo1+","+bo2);
		System.out.println(m+","+n);
		//�߼���
		int x= 1;
		int y= 1;
		if(x++==2&++y==2) {
			x=7;
		}
		System.out.println("x="+x+",y="+y);
		//��·��
		x= 1;
		y=1;
		if(x++==2&&++y==2) {
			x=7;
		}
		System.out.println("x="+x+",y="+y);
		//�߼���
		x= 1;
		y=1;
		if(x++==1|++y==1) {
			x=7;
		}
		System.out.println("x="+x+",y="+y);
		//��·��
		x= 1;
		y=1;
		if(x++==1||++y==1) {
			x=7;
		}
		System.out.println("x="+x+",y="+y);
		
		//��Ŀ�����
		/*
		 * �������ʽ�����ʽһ�����ʽ��      ��ǰ����ʽΪ��������
		 * true---->ִ�б��ʽһ
		 * false--->ִ�б��ʽ��
		 * 
		 * 1�����ʽ1 2����Ҫһ��
		 * 2��
		 * 
		 * ���������ֵ
		 * ���������ֵ
		 * ƽ�������ж�
		 */
		boolean bo = 2>0?true:1>0;
		System.out.println(bo);
		double dou =12<100?11.0:1000;
		System.out.println(m);
		
		
		int a3=3;
		int b3=5;
		int c3=10;
		int num = a3>b3?a3>c3?a3:b3:c3;
		System.out.println(num);
		
		int nu= a3>b3?a3:b3;
		System.out.println(nu);
		
		
		/*  1�����������һ������
		 *   	�����Զ�����ת���������һ�µ�����
		 *  2��������ǳ�����
		 *  	���һ����char�������һ���ǡ�0-65530��֮���һ����������char����
		 *  	���һ����char����һ���������������Զ�����ת���������һ�µ�����
		 */
		char x1 = 'x';
		int i1 = 10;
		System.out.println(true?x1:i1);
		System.out.println(true?'x':-97);
		
		//Ϊ�ֿ���ˮ89��Сʱ���Ƕ����������Сʱ
		
		int t1 = 89;
		int time = t1/24;
		int hour = t1%24;
		System.out.println("����"+time+"��"+hour+"Сʱ");
		
		int week =4;
		week += 100;
		week=week%7;
		System.out.println("100��֮��������"+week);
		
		//��ֵ������Դ�ǿת����
		
	}

}
