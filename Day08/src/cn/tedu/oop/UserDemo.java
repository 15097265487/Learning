package cn.tedu.oop;

public class UserDemo {
	/*
	 *类中属性的使用
	 *（属性）成员变量  vs 局部变量
	 *1、相同点
	 *		定义格式  数据类型  变量名 = 变量值
	 *		先声明  在使用
	 *		变量都有自己的作用域
	 *2、不同点
	 *	 2.1定义的位置不同
	 *		属性：直接定义在类的{}里面
	 *		局部变量：声明在方法内、方法的的参数、代码块、构造器内部的变量									
	 *	 2.2作用范围不一致
	 *		从声明她开始到包含他最近的大括号
	 *	 2.3关于权限修饰符的不同
	 *		public private 缺省   protected
	 *		属性：可以在声明属性时，使用访问权限修饰符指明其权限
	 *		局部变量：不可以加以访问权限修饰符
	 *	 2.4默认初始化的值
	 *		属性：类的属性，根据其类型，都有默认初始值
	 *			整型4个：0
	 *			浮点型2个：0.0
	 *			字符型1个：0
	 *			引用数据类型：null
	 *			boolean:false
	 *		局部变量：没有默认初始化的值
	 *	 2.5在内存中的位置不同
	 *		属性：加载到堆空间中（非static）
	 *		局部变量：加载到栈空间中
	 *
	 *	   属性（成员变量）
	 *		定义在类里面，作用域范围整个类里面
	 *		可以访问权限修饰符  public private 缺省   protected
	 *		有默认初始化值（可以只进行声明）
	 *		在堆空间中（非static）
	 *	 局部变量：
	 *		定义在方法  形参  代码块  构造方法（形参）中
	 *		没有访问权限修饰符
	 *		没有默认值（使用前必须声明+初始化）
	 *		在栈空间
	 *
	
	 */

	public static void main(String[] args) {
		
	}
}
class User{
	//属性  成员变量
	public String name;
	private int age=1;
	boolean isMale;
	//方法
	public void eat() {
		String food = "火锅";
		System.out.println("人可以吃"+food);
		eat();
	}
	public void sleep() {
		System.out.println("人可以睡觉");
	}
	public void play(String project) {
		System.out.println("玩"+project);
	}
}