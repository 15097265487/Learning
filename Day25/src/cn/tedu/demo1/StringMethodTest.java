package cn.tedu.demo1;

import org.junit.Test;

public class StringMethodTest {
	@Test
	public void test2() {
		String str = "hellowowrld";//0 1 2 3 4 5 6 7 8 9 10 11 12
		System.out.println(str.endsWith("rld"));//�Ƿ���*��β
		System.out.println(str.startsWith("hel"));//�Ƿ���*��ͷ
		System.out.println(str.startsWith("h",0));//�±�Ϊ0��ʼ��ƥ���Ӧλ���Ƿ���ȷ
		System.out.println(str.contains("oe"));//������ֵ�����У�˳��
		System.out.println(str.indexOf("o"));//�����ַ�����һ�����ֵ�λ���±�
		System.out.println(str.charAt(4));//�����±�Ϊ�����ַ���
		System.out.println(str.indexOf("ow", 5));//���±�ָ�����±�λ�ò���Ԫ��
		System.out.println(str.indexOf(101));
		System.out.println(str.lastIndexOf("ow"));//6   ������
		System.out.println(str.lastIndexOf("ow",7));//6
		System.out.println();
		System.out.println();
	}
	@Test
	public void test1() {
		String str = " H E l l o World  ";
		System.out.println(str.length());//18----->���ص�ǰ�ַ����ĳ���
		System.out.println(str.isEmpty());//f------>�Ƿ�Ϊ��
		System.out.println(str.toLowerCase());//ת��ΪСд��ԭ���Ĳ���ı䣩
		System.out.println(str);
		System.out.println(str.toUpperCase());//ת��Ϊ��д��ԭ���Ĳ���ı䣩
		System.out.println(str.trim());//ȥ����ͷ�ͽ�β�ĵĿո�
		System.out.println(str);
		//System.out.println("-----------------------------");
		//str = null------->System.out.println(str.equals(""));�쳣
		System.out.println(" ".equals(str));//һ�㳣������ǰ���
		System.out.println(" H E l l o World  ".equalsIgnoreCase(str));//���Դ�Сд�Ƚ������ַ�����ֵ
		System.out.println(str.concat("123456789"));//ƴ��-----> H E l l o World  123456789
		String str1 = "abc";//97 98 99
		String str2 = "acd";
		System.out.println(str1.compareTo(str2));//�Ƚϵ���������һ���Ĳ�ֵabc-abd--->-1       ���ֵ�˳��Ƚ������ַ�����
		System.out.println(str.substring(5));//���±�Ϊ5��λ�õ��ַ���
		System.out.println(str.substring(0, 6));//��ͷ����β����0��ʼ��6
		System.out.println(str.charAt(3));//���ص�ָ��λ�ã��±꣩��Ӧ���ַ�
		
		
		
	}

}
