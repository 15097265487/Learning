package cn.tedu.demo;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

import org.junit.Test;

/**
 * 	注解的演示
 * @author 
 *	1.理解Annotation
 *		①从 JDK 5.0 开始，Java 增加了对 Annotation(注解)的支持。
 *		②注解其实就是代码里的特殊标记，
 *	2.Annotation
 *		①生成文档相关的注解
 *		②在编译时进行的格式检查（jdk中内置的三个基本注解）
 *			@Override	限定于重写父类的方法，该注解只能用于方法
 *			@Deprecated	     用来表示所修饰的元素已过时,通常是因为所修饰的结构比较危险或者是存在更好的选择，
 *			@SuppressWarnings   抑制编译器警告
 *		③跟踪代码依赖性，实现替换配置文件功能
 *	3.自定义注解（参照@SuppressWarnings）
 *		①注解声明@interface
 *		②内部定义成员，通常用value表示
 *		③可以指定成员的默认值，使用default。格式：类型 属性名称() default 默认值--------->String value() default "hi";
 *		④如果自定义的注解没有属性则表示一个标识 
 *	4.元注解
 *		概述：对现有的注解进行修饰，解释说明的注解
 *		@Target	  用来指定被修饰的注解可以用于修饰哪些元素
 *				{TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE}
　　　　	@Retention	制定所修饰Annotation的注解的生命周期
					SOURCE：只存在于源文件.java
					CLASS：默认的生命周期，存在于.class文件中有效
					RUNTIME:在运行时有效（即运行时保留）当运行java程序时，jvm会保留注释
		******不常用*******
　　　　	@Documented	  表示修饰的注解再被javadoc解析时，保留下来
    *　　　　	@Inherited	 被他修饰的Annotation将具备继承性
 *	5.获取类上的注解信息
 *		Person.class.getAnnotations()
 *	6.可重复注解
 *		使用方式
 *		①在MyAnnotation上声明@Repeataeble,成员值为MyAnnotation.class
 *		②注意：MyAnnotation与MyAnnotations上修饰的元注解(Target，Retention...)要相同
 *	7.类型注解
 *		ElementType.TYPE_PARAMETER
 *		ElementType.TYPE_USER
 *		
 *.	
 */

public class AnnotationTest {
	@Test
	public void test1() {
		Student s = new Student();
		s.show();
	}
	@Test
	public void test2() {
		@SuppressWarnings("unused")
		int a=0;
		int b=100;
		@SuppressWarnings({ "rawtypes", "unused" })
		ArrayList list = new ArrayList();
		//测试子类Student是否具备MyAnnotation
		Class clazz = Student.class;
		Annotation[] annotations = clazz.getAnnotations();
		for(int i=0;i<annotations.length;i++) {
			System.out.println(annotations[i]);
		}
		System.out.println(Person.class.getAnnotations().length);
	}
}
//@MyAnnotation(value="hello")//在直接使用其容器注释类型@MyAnnotations时，可重复注释@MyAnnotation可能不会被重复
@MyAnnotation(value="hello")
@MyAnnotations({@MyAnnotation(value="hello"),@MyAnnotation(value="hello")})
class Person{
	@MyAnnotation
	int age;
	@MyAnnotation
	public void show() {
		System.out.println("super");
	}
}
class Student extends Person{
	@Override
	public void show() {
		System.out.println("sub");
	}
	
}
class A<@MyAnnotation T>{
	ArrayList<@MyAnnotation String> a = new ArrayList<String>();
	int num = (@MyAnnotation int)100L;
	public void a() throws @MyAnnotation RuntimeException{
		System.out.println(1);
		
	}
}