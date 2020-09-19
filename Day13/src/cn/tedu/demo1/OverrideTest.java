package cn.tedu.demo1;
/*
 * 	方法的重写：
 * 		1.子类继承了父类以后，可以对父类中的同名同参的方法进行覆盖操作（重写/覆盖）
 * 		2.应用：
 * 		3.重写规定
 * 			方法声明格式：修饰符  返回值类型  方法名(形参列表){
 * 					方法体
 * 			}
 * 			①方法名和参数列表必须一致，
 * 			②访问权限修饰符                  子类重写的权限修饰符不小于( >= )父类被重写的访问权限修饰符
 * 				特殊方法：private修饰的方法子类不能重写
 * 			③返回值类型：
 * 				父类被重写的方法返回值类型为void则子类重写的方法为void
 * 				父类被重写的方法返回值类型为A类， 则子类重写的方法为A类或者A的子类
 * 				父类被重写的方法返回值类型为基本数据类型，则返回值类型必须是相同的
 * 				父---------------子
 * 				父void----->子void
 * 				A类-----------------》A类或A的子类
				double------->double(基本)
			④异常：子<=父
				子类抛出的议程类型不大于父类抛出的异常			
 * 			如果方法为static修饰不构成重写（静态的）
 * 
 * 			区分：overload和override的区别
 * 
 */

public class OverrideTest {

	public static void main(String[] args) {
		Student s = new Student();
		s.eat();
		s.walk(10);
		s.show();
		s.sleep();
		System.out.println("++++++++++++++");
		s.study();
		Person p = new Person();
		//p.show();为private
		s.walk(2);


	}

}
