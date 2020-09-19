package cn.tedu;

import java.util.Scanner;

public class YearTest {

	public static void main(String[] args) {
		//键盘输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year+"是闰年");
			if(month==2) {//二月29天
				System.out.println(month+"月:29天");
				//闰年的1.3.5.7.8.10.12个月是31天
		    }else if(month==1||month==3||month==5||month==7||month==8||month==11||month==12){
					System.out.println(month+"月:31天");
			}else {//其余的都是30天
					System.out.println(month+"月:30天");
			}
		}else{//否则是平年
			    System.out.println(year+"是平年");
		    if(month==4||month==6||month==9||month==11) {//判断是否为几月，
				System.out.println(month+"月:30天");
				//平年的1.3.5.7.8.10.12个月是31天
		    }else if(month==1||month==3||month==5||month==7||month==8||month==11||month==12){
					System.out.println(month+"月:31天");
			}else {
					System.out.println(month+"月:28天");//平年2月28天
			}
		}
	}
}
