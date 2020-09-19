package cn.tedu.exer;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(" "+show(4));
	}
	
	public static int show(int num) {
		int i = 1;
		switch(num) {
		case 1:
			i++;
		case 2:
			i++;
		case 3:
			i++;
		case 4:
			i++;
		case 5:
			i++;
			default:
				i++;
		}
		return i+num;
	}
}
