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
 * 	ע�����ʾ
 * @author 
 *	1.����Annotation
 *		�ٴ� JDK 5.0 ��ʼ��Java �����˶� Annotation(ע��)��֧�֡�
 *		��ע����ʵ���Ǵ�����������ǣ�
 *	2.Annotation
 *		�������ĵ���ص�ע��
 *		���ڱ���ʱ���еĸ�ʽ��飨jdk�����õ���������ע�⣩
 *			@Override	�޶�����д����ķ�������ע��ֻ�����ڷ���
 *			@Deprecated	     ������ʾ�����ε�Ԫ���ѹ�ʱ,ͨ������Ϊ�����εĽṹ�Ƚ�Σ�ջ����Ǵ��ڸ��õ�ѡ��
 *			@SuppressWarnings   ���Ʊ���������
 *		�۸��ٴ��������ԣ�ʵ���滻�����ļ�����
 *	3.�Զ���ע�⣨����@SuppressWarnings��
 *		��ע������@interface
 *		���ڲ������Ա��ͨ����value��ʾ
 *		�ۿ���ָ����Ա��Ĭ��ֵ��ʹ��default����ʽ������ ��������() default Ĭ��ֵ--------->String value() default "hi";
 *		������Զ����ע��û���������ʾһ����ʶ 
 *	4.Ԫע��
 *		�����������е�ע��������Σ�����˵����ע��
 *		@Target	  ����ָ�������ε�ע���������������ЩԪ��
 *				{TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE}
��������	@Retention	�ƶ�������Annotation��ע�����������
					SOURCE��ֻ������Դ�ļ�.java
					CLASS��Ĭ�ϵ��������ڣ�������.class�ļ�����Ч
					RUNTIME:������ʱ��Ч��������ʱ������������java����ʱ��jvm�ᱣ��ע��
		******������*******
��������	@Documented	  ��ʾ���ε�ע���ٱ�javadoc����ʱ����������
    *��������	@Inherited	 �������ε�Annotation���߱��̳���
 *	5.��ȡ���ϵ�ע����Ϣ
 *		Person.class.getAnnotations()
 *	6.���ظ�ע��
 *		ʹ�÷�ʽ
 *		����MyAnnotation������@Repeataeble,��ԱֵΪMyAnnotation.class
 *		��ע�⣺MyAnnotation��MyAnnotations�����ε�Ԫע��(Target��Retention...)Ҫ��ͬ
 *	7.����ע��
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
		//��������Student�Ƿ�߱�MyAnnotation
		Class clazz = Student.class;
		Annotation[] annotations = clazz.getAnnotations();
		for(int i=0;i<annotations.length;i++) {
			System.out.println(annotations[i]);
		}
		System.out.println(Person.class.getAnnotations().length);
	}
}
//@MyAnnotation(value="hello")//��ֱ��ʹ��������ע������@MyAnnotationsʱ�����ظ�ע��@MyAnnotation���ܲ��ᱻ�ظ�
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