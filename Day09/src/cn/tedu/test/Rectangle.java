package cn.tedu.test;


public class Rectangle {
	public static void main(String[] args) {
		Rectangle re = new Rectangle();
		re.method();//��һ�����
		System.out.println("-----------------");
	
		
		re.area();//�ڶ������
		
		int s = re.area1(5, 5);//���������
		System.out.println("�����"+s);
		
		
	}
	public void method() {
		for(int i=1;i<11;i++) {
			for(int j=1;j<9;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public int area() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<8;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return 10*8;
	}
	public int area1(int m,int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return m*n;
	}
}

	

