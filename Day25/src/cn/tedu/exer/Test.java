package cn.tedu.exer;

public class Test {
	String str  = "good";
	char [] c = {'t','e','s','t'};
	
	public void change(String str ,char[] c) {
		str = "test ok";
		c[0] = 'b';
		
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.change(t.str, t.c);
		System.out.println(t.str);
		System.out.println(t.c);
		String s = "hello";
		s+="world";
		System.out.println(s);
	}
	
	
}
