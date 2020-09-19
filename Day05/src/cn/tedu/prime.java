package cn.tedu;

public class prime {

	public static void main(String[] args) {
		/*
		 * 	质数
		 */
		long ts1 = System.currentTimeMillis();
		int num=0;
		for(int i=2;i<=100;i++) {
			boolean flag = true;
			for(int j=2;j<i;j++) {//三种方法
			//for(int j=2;j<=Math.sqrt(i);j++)
			//for(int j=2;j<i/2;j++) 	
				if(i%j==0) {
					//不是质数
					flag = false;
					break;
				}
			}
			if(flag) {//质数
				System.out.println(i);
				num++;
			}
		}
		long ts2 = System.currentTimeMillis();
		long c=ts2-ts1;
		System.out.println("运行时间："+c);
		System.out.println("质数个数："+num);
	}
}


