package cn.tedu.demo1;

import java.util.Scanner;

public class PayrollSystem {
	public static void main(String[] args) {
		
	Employee[] arr = new Employee[4];
	arr[0] = new SalariedEmployee(1001, "张三", 1996, 10, 1, 20000, 20, 22);
	arr[1] = new HourlyEmployee(1002, "李四", new MyDate(1995,6,1), 120, 12);//没有服务精神的时候就需要用户自己去创建对象了
	arr[2] = new HourlyEmployee(1003, "王五", 1994, 5, 1, 200, 12);
	arr[3] = new SalariedEmployee(1004, "六六", new MyDate(1997,12,1));//测试不传入值的时候会打印什么
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
		System.out.println("实际工资：" + arr[i].earnings());
	}
	
	System.out.println("------------");
	System.out.println("请输入本月月份");
	Scanner input = new Scanner(System.in);
	int month = input.nextInt();
	
	for (int i = 0; i < arr.length; i++) {
		if(arr[i].getBrithday().getMonth() == month) {//判断本月有没有人生日
			System.out.println(arr[i]);
			System.out.println("实际工资：" + (arr[i].earnings() + 100));
		}else {
			System.out.println(arr[i]);
			System.out.println("实际工资：" + arr[i].earnings());
		}
	}
	
	}		
}

