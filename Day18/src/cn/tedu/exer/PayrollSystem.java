package cn.tedu.exer;

import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
//		System.out.println("�������·�");
//		int month = new Scanner(System.in).nextInt();
		Calendar c = Calendar.getInstance();
		int month = c.get(Calendar.MONTH);
		System.out.println(month);
		//�����������
		Employee[] em = new Employee[2];
		//
		em[0] = new SalariedEmployee("����", 1011, new MyDate(2020,01,22), 10000);
		em[1] = new HourlyEmployee("����", 1012, new MyDate(2020,8,22), 1000, 10);
		
		for(int i=0;i<em.length;i++) {
			System.out.println(em[i].getClass().getName());
			System.out.println(em[i]);
			System.out.println(em[i].getBrithday().toDateString());
			System.out.println("�¹���"+em[i].earning());
			if(month+1==em[i].getBrithday().getMonth()) {
				System.out.println("���տ��֣�����100Ԫ");
			}
		}

	}

}
