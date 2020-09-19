package cn.tedu.demo;

public class RecursionTest {

	public static void main(String[] args) {
		//1-100�ĺ�
		int sum = 0;
		for(int i=1;i<101;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		RecursionTest test = new RecursionTest();
		test.getMul(10);
		System.out.println(test.getMul(10));
		
		System.out.println(test.getSum(10));
		
		System.out.println(test.f(10));
		
		
		System.out.println("�Ʋ��������У�");
		for(int i=1;i<12;i++) {//����
			System.out.print(test.series(i)+" ");
		}
	}
	/*
	 * ����1-n֮��ĺ�
	 */
	public int getSum(int n) {
		if(n==1) {
			return 1;
		}else {
			return n+getSum(n-1);
		}
	}
	/*n!*/
	public int getMul(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*getMul(n-1);
		}
	}
	/**/
	public int f(int n) {
		if(n==0) {
			return 1;
		}else if(n==1){
			return  4;
		}else {
			return 2*f(n-1)+f(n-2);
		}
	}
	/*�Ʋ���������*/
	public int series(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return series(n-1)+series(n-2);
		}
	}
}
