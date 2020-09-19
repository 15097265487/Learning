package cn.tedu;

public class DoWhileDemo {

	public static void main(String[] args) {
		/*
		 * do...while
		 */
		int a=1;//定义变量
		do {
			System.out.println(a);//10次
			a++;
		} while (a<=10);//条件表达式，布尔类型
		System.out.println(a);//11次
	}

}
