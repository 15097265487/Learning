package cn.tedu.demo;
/**
 *String StringBuffer StringBuilder 
 *	一、三者对比分析
 * String 不可变的字符序列，底层是使用char[]
 * StringBuffer,可变的字符序列,线程安全的,效率低，底层是使用char[]
 * StringBuilder,可变的字符序列,线程不安全的,效率高，底层是使用char[] (AbstractStringBuilder) 源码分析：
 * ①String s = new String(); //char[] value = new char[0] String s = new
 * String("abc"); //char[] value = new char[]{'a','b','c'};
 * 
 * ②StringBuffer s = new StringBuffer(); //char[] value = new
 * char[16];底层创建了一个长度为16的数组 s.length()-->0 StringBuffer s = new
 * StringBuffer("a"); //char[] value = new char["a".length()+16]; s.length()-->1
 * 	长度问题：syso(s.length()) 
 * 	扩容问题：如果要添加的数组底层数组盛不下了，
 * 		那就需要扩容底层数组。
 * 		默认情况下，扩容为原来容量的2倍+2，同时将原有数组中的元素赋值到新数组中 (value=Arrays.copyOf(value，新数组长度) )
 * 二、StringBuffer常用方法：
 *	增：append(xxx) 
 * 	删：delete(int start,int end) 
 * 	改：replace(int start,int end,String str)/setCharAt(int n,char ch) 
 * 	查：charAt(int index)/indexOf(String s) 
 * 	插：insert(int offset,xxx) 长度：length() 
 * 	遍历： toString() / for()+charAt()
 * 
 * capacity:容量
 */
public class Review {

}

