package cn.tedu;

public class StringDemo {

	public static void main(String[] args) {
		String str = "af";
		boolean b = true;
		str = str + b;//aftrue
		System.out.println(str);
		char c = 'a';
		int num = 1;
		str ="hello";
		System.out.println(c+num+str);
		System.out.println(c+str+num);
		System.out.println(c+(num+str));
		System.out.println((c+num)+str);
		System.out.println(str+num+c);
		
		
		String str2  = 3.5f+"";
		System.out.println(str2);
		System.out.println('a'+1+"hello");
		
		//Á·Ï°*    *
		System.out.println("*   *");
		System.out.println('*'+'\t'+'*');
		System.out.println('*'+"\t"+'*');
		System.out.println('*'+'\t'+"*");
		System.out.println('*'+('\t'+"*"));
		
		
		char a1 = '*';
		int a2 = a1;
		System.out.println(a2);
		
		
		
		
		
	}

}
