package cn.tedu;

public class MaxDemo {//ÈýÄ¿ÔËËã

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int max = a>b?a:b;
		System.out.println("max:"+max);
		
		
		int c = 11;
		 max = (a>b?a:b)>c?(a>b?a:b):c;
		System.out.println("max:"+max);

	}

}
