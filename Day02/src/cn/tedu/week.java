package cn.tedu;

public class week {
	//今天是周六，100天以后是周几
	public static void main(String[] args) {
		int week = 6;
		week += 100;//+=相当于week = week+1=100
		week = week%7;
		System.out.println("今天是周"+week);
		
	}

}
