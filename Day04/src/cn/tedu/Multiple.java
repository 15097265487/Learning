package cn.tedu;

public class Multiple {

	public static void main(String[] args) {
		int num=0;
		int count = 0;
		for(int i=1;i<=100;i++) {
			if(i%7==0) {
				System.out.println(i);
				
				count++;
				num+=i;
				
			}
		}
		System.out.println(num +","+count);

	}

}
