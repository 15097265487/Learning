package cn.tedu;

import java.util.Scanner;

public class Oper {

	public static void main(String[] args) {
		/**
		 * 运算符
		 * 
		 * ++、--
		 * 单独使用：放在前后没有区别
		 * 被使用
		 *   ++在前，先自增在运算
		 *   ++在后，先运算后自增
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
		//++放在变量名后，先输出a1自身的值11，在自增
		System.out.println(a1++);//11
		//++在前面，先自增在运算。
		System.out.println(++a2);//12
		
		a=10;a1=12;
		
		int c = 10,d=10;
		int s = a++ + ++a1 + a-- + a1++;//10+13+11+13=47
		//输出a b s的值
		System.out.println(a);//10
		System.out.println(a1);//14
		System.out.println(s);//47
		/*
		 * s = 10+13+11+13=47
		 * 实际的值：a 11  10
		 *        b  13  14
		 */
		s = a++ + a1++ +a1-- + ++a;//10+14+15+12
		System.out.println(s);//51
		
		/*
		//scanner引用型变量
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int num = sc.nextInt();
		int e = num/100;
		int f = num%100/10;
		int g = num%10;
		System.out.println("百位:"+e);
		System.out.println("十位:"+f);
		System.out.println("个位:"+g);
		*/
		
		
		//赋值运算符
		int n=10;
		int m = 10;
		m += 10;//m+10     20
		m = (int)(m+10.9);//double--->int    20+10
		
		//n=n+22;n=10+22      10+22   (n++)+(++n)
		n+=(n++)+(++n);//n+22   10+12=22+n=32
		System.out.println(n);
		System.out.println(m);//   
		
		//关系运算符、结果都是boolean型，要么是true，要么是false
		//==  != <  >  <=  >=
		
		boolean t = true,f=false;
		System.out.println(t == f);
		System.out.println(m = n);//把n的值赋值给m
		
		//逻辑运算符：&逻辑与        |逻辑或       !逻辑非        &&短路与          ||短路或           ^逻辑异或
		/*
		 * & &&当且仅当两个操作数都为真，条件才为真        
		 * 		当&&第一个表达式结果为假时，后面不再执行
		 * 		当&第一个表达式结果为假时，后面会执行
		 * 如果任何两个操作数任何一个为真，条件为真
		 * 如果条件为true，则逻辑非运算符将得到false。
		 */
		m = 6;n = 6;
		boolean bo1 = m>10 & m++>0;   
		m=6;
		boolean bo2 = m>10 && n++>0;
		System.out.println(bo1+","+bo2);  //
		System.out.println(m+","+n);
		
		/*
		 * 如果任何两个操作数任何一个为真，条件为真
		 * 		当||第一个表达式结果为真时，后面不再执行
		 * 		当|第一个表达式结果为真时，后面会执行
		 */
		m = 6;n = 6;
		bo1 = m<10 | m++>0;
		m=6;
		bo2 = m<10 || n++>0;
		System.out.println(bo1+","+bo2);
		System.out.println(m+","+n);
		//逻辑与
		int x= 1;
		int y= 1;
		if(x++==2&++y==2) {
			x=7;
		}
		System.out.println("x="+x+",y="+y);
		//短路与
		x= 1;
		y=1;
		if(x++==2&&++y==2) {
			x=7;
		}
		System.out.println("x="+x+",y="+y);
		//逻辑或
		x= 1;
		y=1;
		if(x++==1|++y==1) {
			x=7;
		}
		System.out.println("x="+x+",y="+y);
		//短路或
		x= 1;
		y=1;
		if(x++==1||++y==1) {
			x=7;
		}
		System.out.println("x="+x+",y="+y);
		
		//三目运算符
		/*
		 * 条件表达式？表达式一：表达式二      ？前面表达式为布尔类型
		 * true---->执行表达式一
		 * false--->执行表达式二
		 * 
		 * 1）表达式1 2类型要一致
		 * 2）
		 * 
		 * 两个数最大值
		 * 三个数最大值
		 * 平年闰年判断
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
		
		
		/*  1）如果其中有一个变量
		 *   	按照自动类型转换规则处理成一致的类型
		 *  2）如果都是常量：
		 *  	如果一个是char，如果另一个是【0-65530】之间的一个整数按照char处理；
		 *  	如果一个是char，另一个是其他，按照自动类型转换规则处理成一致的类型
		 */
		char x1 = 'x';
		int i1 = 10;
		System.out.println(true?x1:i1);
		System.out.println(true?'x':-97);
		
		//为抵抗洪水89个小时，是多少天零多少小时
		
		int t1 = 89;
		int time = t1/24;
		int hour = t1%24;
		System.out.println("共计"+time+"天"+hour+"小时");
		
		int week =4;
		week += 100;
		week=week%7;
		System.out.println("100天之后是星期"+week);
		
		//赋值运算符自带强转功能
		
	}

}
