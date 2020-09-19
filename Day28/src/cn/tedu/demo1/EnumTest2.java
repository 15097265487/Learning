package cn.tedu.demo1;

import java.lang.Thread.State;
import java.util.Arrays;

import org.junit.Test;

public class EnumTest2 {
	@Test
	public void test1() {
		Season2 s = Season2.SPRING;
		System.out.println(s);
		System.out.println(s.getClass());
		System.out.println(Season2.class.getSuperclass());
		System.out.println(Enum.class.getSuperclass());
		//values() ��������ö������󹹳ɵ�����
		Season2[] vs1 = Season2.values();
		System.out.println(Arrays.toString(vs1));
		
		State[] vs2 = Thread.State.values();
		System.out.println(Arrays.toString(vs2));
		//���ص�ö���������ʱobj�Ķ���
		Season2 v = Season2.valueOf("SUMMER");
		System.out.println(v);
		
		
	}

}
interface info{
	void show();
}
//��Ķ���ֻ�����޸���ȷ����
//�Զ�enum��ö����
enum Season2 implements info{

	SPRING("��", "��ů����"){
		@Override
		public void show() {
			System.out.println("��ã�����");
		}
	},
	SUMMER("��", "��������"), AUTUMN("��", "�����ɬ"), WINTER("��", "��ѩ����");
	private final String Season2Name;
	private final String Season2Sesc;

	private Season2(String Season2Name, String Season2Sesc) {
		this.Season2Name = Season2Name;
		this.Season2Sesc = Season2Sesc;
	}

	public String getSeason2Name() {
		return Season2Name;
	}

	public String getSeason2Sesc() {
		return Season2Sesc;
	}

	@Override
	public String toString() {
		return "Season2 [Season2Name=" + Season2Name + ", Season2Sesc=" + Season2Sesc + "]";
	}

	@Override
	public void show() {
		System.out.println("����");
		
	}

}