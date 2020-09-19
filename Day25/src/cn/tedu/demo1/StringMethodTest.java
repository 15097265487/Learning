package cn.tedu.demo1;

import org.junit.Test;

public class StringMethodTest {
	@Test
	public void test2() {
		String str = "hellowowrld";//0 1 2 3 4 5 6 7 8 9 10 11 12
		System.out.println(str.endsWith("rld"));//是否以*结尾
		System.out.println(str.startsWith("hel"));//是否以*开头
		System.out.println(str.startsWith("h",0));//下标为0开始，匹配对应位置是否正确
		System.out.println(str.contains("oe"));//包含差值的序列（顺序）
		System.out.println(str.indexOf("o"));//返回字符串第一个出现的位置下标
		System.out.println(str.charAt(4));//返回下标为几的字符串
		System.out.println(str.indexOf("ow", 5));//从下标指定的下标位置查找元素
		System.out.println(str.indexOf(101));
		System.out.println(str.lastIndexOf("ow"));//6   倒着数
		System.out.println(str.lastIndexOf("ow",7));//6
		System.out.println();
		System.out.println();
	}
	@Test
	public void test1() {
		String str = " H E l l o World  ";
		System.out.println(str.length());//18----->返回当前字符串的长度
		System.out.println(str.isEmpty());//f------>是否为空
		System.out.println(str.toLowerCase());//转换为小写（原来的不会改变）
		System.out.println(str);
		System.out.println(str.toUpperCase());//转换为大写（原来的不会改变）
		System.out.println(str.trim());//去掉开头和结尾的的空格
		System.out.println(str);
		//System.out.println("-----------------------------");
		//str = null------->System.out.println(str.equals(""));异常
		System.out.println(" ".equals(str));//一般常量放在前面个
		System.out.println(" H E l l o World  ".equalsIgnoreCase(str));//忽略大小写比较两个字符串的值
		System.out.println(str.concat("123456789"));//拼接-----> H E l l o World  123456789
		String str1 = "abc";//97 98 99
		String str2 = "acd";
		System.out.println(str1.compareTo(str2));//比较的是两个不一样的差值abc-abd--->-1       按字典顺序比较两个字符串。
		System.out.println(str.substring(5));//从下标为5的位置的字符串
		System.out.println(str.substring(0, 6));//含头不含尾，从0开始到6
		System.out.println(str.charAt(3));//返回的指定位置（下标）对应的字符
		
		
		
	}

}
