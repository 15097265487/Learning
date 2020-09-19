package cn.tedu;

public class ForDemo {

	public static void main(String[] args) {
		/*
		 * 循环结构：
		 * 	有条件的执行某语句一次或者多次
		 * 循环三要素：
		 * 	循环变量的初始化
		 * 	循环条件（基于循环变量）
		 * 	循环变量的改变（向着循环结束的方向改变）
		 * 	(循环体)
		 * 循环变量：
		 * 	再循环过程中反复改变的量
		 * 1 2 4 3 243 243 243....2循环条件为假时结束
		 * 
		 * 变量作用域：
		 * 从声明他开始到包含他最近的大括号
		 * for(int j=1,i=99;j<2&&i<100;j++,i++)
		 * 
		 * m+=2
		 * m=m+m
		 * m++
		 * 
		 * //break后不可写代码
		 */
		
		//练习 打印1-10   能被3整除  1-10的和  阶乘
		//int i = 1;
		int sum = 0;
		int s = 1;
		for(int i=1;i<11;i++) {
			//判断是否被3整除
			if(i%3==0) {
				//System.out.println(i);
			}
			//求和
			sum+=i;
			//阶乘
			s*=i;
		}
		
		System.out.println(sum+","+s);
	}

}
