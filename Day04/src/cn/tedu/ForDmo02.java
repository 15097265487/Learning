package cn.tedu;

public class ForDmo02 {

	public static void main(String[] args) {
		/*
		 * 嵌套for循环
		 * 外层循环执行一次，里层执行所有次
		 * break:只能跳出一层
		 * continue:结束本次循环进入下次循环
		 */
		for(int i=0;i<5;i++) {
			System.out.print(i+" ");
			for(int j=0;j<5;j++) {
				System.out.print(j);
				//break;//
				continue;
			}
			System.out.println();
		}
		System.out.println("over");

	}

}
