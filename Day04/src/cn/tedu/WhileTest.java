package cn.tedu;

public class WhileTest {

	public static void main(String[] args) {
		/*
		 * 1初始化部分
		 * while(循环条件部分){
		 * 	循环部分
		 * 	迭代部分
		 *  }
		 *
		 */
		int a=1;
		while(a<=10) {
			//循环10次
			System.out.println(a);//无数次
			a++;
		}//循环了11次
		System.out.println(a);
	}
}
