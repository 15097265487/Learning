package cn.tedu.demo1;

import javax.sound.midi.Synthesizer;

import org.junit.Test;
/*
 * ��װ�ࣺ Wrapper
 * 	java�ṩ�˰��ֻ����������Ͷ�Ӧ�İ�װ�࣬ʹ�û����������͵ı����߱����������
 * 
 * 	������������     ��װ��      String����֮���ת��
 */

public class JunitTest {
	@Test
	public void test1() {
		//����----����װ�࣬�����˰�װ��Ĺ�����
		int num=10;
		Integer in1=new Integer(num);
		Integer in2=new Integer("123");
		
		System.out.println(in1);
		System.out.println(in2.toString());
		
		Integer in3=new Integer("123");//�쳣
		System.out.println(in3.toString());
		
		Float f = new Float("12");
		Float f1 = new Float("12.0F");
		System.out.println(f);
		
		Boolean b = new Boolean(true);
		Boolean b1 = new Boolean("true132");
		System.out.println(b1);
		System.out.println("------------------");
	}
	@Test
	public void test2() {
		//��װ��------������
		//���ð�װ��Ķ������.xxxvalue()
		Integer in1 = new Integer(129);
		int i = in1.intValue();
		byte b = in1.byteValue();
		System.out.println(b);
	}
	/*
	 * JDK5.0������   �Զ�װ��  �Զ�����
	 */
	public void test3() {
		//�Զ�װ�䣺����--------------����װ
		int num = 200;
		Integer in1 = num;
		boolean b = true;
		Boolean bo1=b;
		//�Զ����䣺��װ--------------������
		System.out.println(in1);
		//in1.intValue();
		int i=in1;
	}
	@Test
	public void test4() {
		//��������װ----------------------��String����
		//����String��valueOf(Xxx xxx);
		int num = 10;
		String s=num+"";
		s=String.valueOf(num);
		
		Double d = new Double(66.66);
		s = String.valueOf(d);
		System.out.println(s);
	}
	@Test
	public void test5() {
		//�ַ���---->��������װ
		//���ð�װ���parseXxx(String str);
		String str = "1";
		int i = Integer.parseInt(str);
		System.out.println(i);
		
		str = "true1234";
		boolean b = Boolean.parseBoolean(str);
		System.out.println(b);
	}
	

}
 