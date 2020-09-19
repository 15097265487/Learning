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
		//values() 返回所有枚举类对象构成的数组
		Season2[] vs1 = Season2.values();
		System.out.println(Arrays.toString(vs1));
		
		State[] vs2 = Thread.State.values();
		System.out.println(Arrays.toString(vs2));
		//返回的枚举类对象名时obj的对象
		Season2 v = Season2.valueOf("SUMMER");
		System.out.println(v);
		
		
	}

}
interface info{
	void show();
}
//类的对象只有有限个，确定的
//自定enum义枚举类
enum Season2 implements info{

	SPRING("春", "春暖花开"){
		@Override
		public void show() {
			System.out.println("你好，春天");
		}
	},
	SUMMER("夏", "夏日炎炎"), AUTUMN("秋", "秋风羞涩"), WINTER("冬", "白雪皑皑");
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
		System.out.println("季节");
		
	}

}