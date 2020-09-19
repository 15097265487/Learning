package practice;

public class Test {
 
	public static void main(String[] args) {
		//定义次数变量
		int count=0;
		//
		for (int i = 1; i <= 1000; i++) {
			int num = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0)
					num += j;
			}
			if (num == i) {
				System.out.println(i);
				count++;//次数
			}
		}//输出完数个数
		System.out.println("1000之间的完数个数为：" + count);
	}
}

