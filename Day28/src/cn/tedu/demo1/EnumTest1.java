package cn.tedu.demo1;

import org.junit.Test;
/*
 * 	һ��ö�����ʹ��
 * 	1.��⣺��Ķ���ֻ�����޸���ȷ���ġ�
 * 	2.����Ҫ����һ�鳣��ʱ������ʹ��ö����
 * 	3.���ö������ֻ��һ�����������ʹ�õ���ģʽ
 * 	������ζ���ö��
 * 	1.jdk5ǰ���Զ���ö����
 * 	2.jdk5��
 */

public class EnumTest1 {
	@Test
	public void test1() {
		Season1 s = Season1.SUMMER;
		System.out.println(s);
	}

}
//��Ķ���ֻ�����޸���ȷ����
//�Զ���ö����
class Season1{
	//1.����Season1�������ԣ�private��final����
	private final String Season1Name;
	private final String Season1Sesc;
	//2.˽�л���Ĺ�������������������Ը�ֵ
	
	private Season1(String Season1Name, String Season1Sesc) {
		this.Season1Name = Season1Name;
		this.Season1Sesc = Season1Sesc;
	}
	//�ṩ��ǰ��Ķ���public static final
	public static final Season1 SPRING = new Season1("��", "��ů����");
	public static final Season1 SUMMER = new Season1("��", "��������");
	public static final Season1 AUTUMN = new Season1("��", "�����ɬ");
	public static final Season1 WINTER = new Season1("��", "��ѩ����");

	public String getSeason1Name() {
		return Season1Name;
	}
	public String getSeason1Sesc() {
		return Season1Sesc;
	}
	@Override
	public String toString() {
		return "Season1 [Season1Name=" + Season1Name + ", Season1Sesc=" + Season1Sesc + "]";
	}
	
}