package cn.tedu.demo3;
/*
 * 	super�ؼ��ֵ�ʹ�ã�
 * 	1.super����Ϊ�������
 * 	2.super���Ե��ã����������ԡ�������
 * 		ʹ�ã�
 * 			1.�������ԡ�������    �﷨��super.������super.����
 * 			    1.1������͸����ж�����ͬ��������ʱ���������������з��ʸ���������������
 * 			   	         �������ʾ��ʹ�á�super.���ԡ��ķ�ʽ����ʾ��ʱ���õ��Ǹ�������ԡ�
 * 				1.2super.����
 * 				         �������д�˸����еķ����������������з��ʸ���ķ�����
 * 				         �������ʾ��ʹ�á�super.����������ʾ���õ��Ǹ����б���д�ķ���
 * 			2.super���ù�����		
 * 				���﷨��super(�����б�);
 * 				��super(�����б�);   �������������๹����������
 * 				���ڹ������У�super�������б�����this.�������б���ֻ�ܶ�ѡһ������ͬʱ����
 * 				���ڹ����������У����û����ʾ������super�������б�����this�������б�����Ĭ�ϵ��ø�����޲ι�����
 * 				������Ĺ������У�������һ����Ĺ�������ʹ����super(�����б�);
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
