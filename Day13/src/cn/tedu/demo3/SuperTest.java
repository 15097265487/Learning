package cn.tedu.demo3;
/*
 * 	super关键字的使用：
 * 	1.super理解为：父类的
 * 	2.super可以调用：方法、属性、构造器
 * 		使用：
 * 			1.调用属性、方法：    语法：super.方法、super.属性
 * 			    1.1当子类和父类中定义了同名的属性时，我们想在子类中访问父类中声明的属性
 * 			   	         则必须显示的使用“super.属性”的方式来表示此时调用的是父类的属性。
 * 				1.2super.方法
 * 				         当子类从写了父类中的方法，但想在子类中访问父类的方法，
 * 				         则必须显示的使用“super.方法”来表示调用的是父类中被重写的方法
 * 			2.super调用构造器		
 * 				①语法：super(参数列表);
 * 				②super(参数列表);   必须声明在子类构造器的首行
 * 				③在构造器中，super（参数列表）和this.（参数列表）只能二选一，不能同时出现
 * 				④在构造器的首行，如果没有显示的声明super（参数列表）或this（参数列表）则默认调用父类的无参构造器
 * 				⑤在类的构造器中，字少有一个类的构造器中使用类super(参数列表);
 * 
 * 
 * 
 * 
 * 
 */

public class SuperTest {

	public static void main(String[] args) {
		Student s = new Student();
		s.info();
		System.out.println();
		s.study();
		System.out.println("----------------------");
		Student s1 = new Student();
		Student s2 = new Student(null, 0, 0);
		Student s3 = new Student(0);
		
	}

}

