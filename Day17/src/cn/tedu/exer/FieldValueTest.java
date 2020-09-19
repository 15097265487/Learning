package cn.tedu.exer;
/*
 * 	对属性可以赋值的位置
 * 	①默认初始化
 * 	②显示初始化   /  ③在代码块中赋值
 * 	④构造器中初始化
 * 	⑤对象.属性，对象.方法
 * 	
 * 	先后顺序：①--->②/③--->④--->⑤
 * 	
 */

public class FieldValueTest {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.age);
	}
}
class Person{
	//int age = 12;显示初始化
	{
		age=100;
	}
	int age = 12;
}
