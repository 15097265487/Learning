package cn.tedu.test;

public class PassObject {
	public static void main(String[] args) {
		PassObject test = new PassObject();
		Circle c = new Circle();
		test.printArea(c, 5);
		
	}
	
	
	public void printArea(Circle c,int time) {
		System.out.println("Raduius\t\tArea");
		int i=1;
		for(;i<=time;i++) {
			//System.out.println(i);����ʽ
			//����Բ�İ뾶
			c.radius=i;
			double area = c.findArea();
			System.out.println(c.radius+"\t\t"+area);
		}
		c.radius=i;//time+1
		System.out.println("\n now radius is:"+c.radius);
	}

}
