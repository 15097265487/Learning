package cn.tedu.demo1;

import java.util.Scanner;

public class PayrollSystem {
	public static void main(String[] args) {
		
	Employee[] arr = new Employee[4];
	arr[0] = new SalariedEmployee(1001, "����", 1996, 10, 1, 20000, 20, 22);
	arr[1] = new HourlyEmployee(1002, "����", new MyDate(1995,6,1), 120, 12);//û�з������ʱ�����Ҫ�û��Լ�ȥ����������
	arr[2] = new HourlyEmployee(1003, "����", 1994, 5, 1, 200, 12);
	arr[3] = new SalariedEmployee(1004, "����", new MyDate(1997,12,1));//���Բ�����ֵ��ʱ����ӡʲô
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
		System.out.println("ʵ�ʹ��ʣ�" + arr[i].earnings());
	}
	
	System.out.println("------------");
	System.out.println("�����뱾���·�");
	Scanner input = new Scanner(System.in);
	int month = input.nextInt();
	
	for (int i = 0; i < arr.length; i++) {
		if(arr[i].getBrithday().getMonth() == month) {//�жϱ�����û��������
			System.out.println(arr[i]);
			System.out.println("ʵ�ʹ��ʣ�" + (arr[i].earnings() + 100));
		}else {
			System.out.println(arr[i]);
			System.out.println("ʵ�ʹ��ʣ�" + arr[i].earnings());
		}
	}
	
	}		
}

