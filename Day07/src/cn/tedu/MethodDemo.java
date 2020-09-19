package cn.tedu;

public class MethodDemo {
	/*
	 * void     println();
	 * void     print("");必须有参数
	 * xxx      s.nextXxx();
	 * double   Math.random();
	 * void     Arrays.sort(int[] a);
	 * T[]      Arrays.copyOf(original, newLength)
	 * void     System.arraycopy(src, srcPos, dest, destPos, length);
	 * 
	 * 一个方法尽量只做一件事
	 * ①方法：   封装一个特定的逻辑功能
	 * 		方法和方法之间是并列的关系，不能在方法中定义方法
	 * ②语法
	 * 	     修饰词，返回值类型，方法名(方法名){
	 * 		//方法体
	 *   }
	 * ③方法的使用
	 *   有参必须传参，参数数据类型一致
	 *   
	 * ④return:
	 *   	适用范围：方法体中
	 *   	作用：
	 *   		①return;结束方法
	 *   		②return 数据;
	 *   			针对于方法有返回值类型的方法，使用return返回所要的数据
	 *   		注意：return关键字后面不可有内容
	 * ⑤返回值类型  
	 *   通常情况下没有返回值则不需要return，如果使用return就表示结束方法
	 *   
	 * 	 static final abstract来修饰方法，
	 * 	 Java中的4中权限修饰符：private public 缺省protected
	 * 
	 */

	public static void main(String[] args) {
		Method m = new Method();
		m.sayHi();
		String str = "World";
		int a = 100;
		m.sayHello(a);//有参数必须传参数，且类型一致
		int i = m.sum();//35
		int j = m.add(12, 20);//12+20
		System.out.println(i+" "+j);
	}
}
class Method{
	//无惨无返回值
	public void sayHi() {
		System.out.println("hi");
	}
	//有参无返回值
	public void sayHello(int msg) {//形参
		if(msg>90) {
			return;
		}
		System.out.println("hello "+msg);
	}
	//无参有返回值
	public int sum() {//形参
		System.out.println("sum()");
		return 12+23;
	}
	//有参有返回值
	public int add(int a,int b) {//形参
		System.out.println("add()");
		return a+b;
	}
}









