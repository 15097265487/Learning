package cn.tedu.exer;

import java.util.Arrays;

import org.junit.Test;

public class StringTest {
	@Test
	public void test1() {
		String str2 = "abccdabdefabcrabfrabdeab";
		String str1 = "ab";
		int count = 0;;
		int index = 0;
		while((index=str2.indexOf(str1,index))!=-1) {
			index = index+str1.length();
			count++;
		}
		System.out.println(count);
		
//		String str2 = "abccdabdefabcrabfrabdeab";
//		String str1 = "ab";
		int i = getCount(str1,str2);
		System.out.println(i);
		
	}
	//二
	public int getCount(String str1,String str2) {
		int count = 0;
		int index = 0;
		int a = str1.length();
		int b = str2.length();
		if(a>b) {
			while((index = str1.indexOf(str2))!=-1) {//有返回对应下标，没有返回-1
				index = index+str2.length();
			}
			return count;
		}
		return 0;
	}
	
	@Test
	public void test2() {
		String str = "abcdefghi";//
		char[] ch = str.toCharArray();
		for(int i=2,j=6;i<j;i++,j--) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		System.out.println("数组长度："+ch.length);
		String s = new String(ch);
		System.out.println(s);
	}
	@Test
	public void test3() {
		String str = "qwertyuiopasdfghjkl";
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		String s = new String(ch);
		System.out.println(s);
	}
	//获取两个字符串，中最大相同字符串
	@Test
	public void test4() {
		String s1 = "abcwerthelloyuiodef";
		String s2 = "cvhellobnm";
		String s = getMaxSubString(s1,s2);
		System.out.println("相同的子串："+s);
	}
	public String getMaxSubString(String s1,String s2) {
		//查找长的字符串
		String maxStr = s1.length()>s2.length()?s1:s2;
		String minStr = s1.length()>s2.length()?s2:s1;
		
		int len = minStr.length();
		for(int i=0;i<len;i++){
			for(int x=0,y=len-i;y<len-1;x++,y++) {
				if(maxStr.contains(minStr.substring(x,y))) {
					return minStr.substring(x,y);
				}
			}
		}
		return null;
	}

}
