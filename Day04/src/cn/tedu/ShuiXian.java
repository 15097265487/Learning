package cn.tedu;

public class ShuiXian {
	/*
	 * Ë®ÏÉ»¨
	 */

	public static void main(String[] args) {
		for(int i=100;i<1000;i++) {
			int a = i/100;
			int b = i%100/10;
			int c = i%10;
			int sum = a*a*a* + b*b*b + c*c*c;
			if(i==sum) {
				System.out.println(i+"ÄãºÃ");
			}
		}
	}
}
