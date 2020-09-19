package cn.tedu.exer;

public class DailyExam10 {

	public static void main(String[] args) {
		String str = "hi";
		DailyExam10 d = new DailyExam10();
		d.change(str);
		System.out.println(str);
		
		//d.f(12);
		for(int i=1;i<12;i++) {
			System.out.print(d.f(i)+" ");
		}
		

	}
	public void change(String s) {
		s = "hello";
	}
	public int f(int n) {
		if(n==1 || n==2) {
			return 1;
		}else {
			return f(n-1)+f(n-2);
		}
	}

}
