package cn.tedu.demo;
/**
 *String StringBuffer StringBuilder 
 *	һ�����߶Աȷ���
 * String ���ɱ���ַ����У��ײ���ʹ��char[]
 * StringBuffer,�ɱ���ַ�����,�̰߳�ȫ��,Ч�ʵͣ��ײ���ʹ��char[]
 * StringBuilder,�ɱ���ַ�����,�̲߳���ȫ��,Ч�ʸߣ��ײ���ʹ��char[] (AbstractStringBuilder) Դ�������
 * ��String s = new String(); //char[] value = new char[0] String s = new
 * String("abc"); //char[] value = new char[]{'a','b','c'};
 * 
 * ��StringBuffer s = new StringBuffer(); //char[] value = new
 * char[16];�ײ㴴����һ������Ϊ16������ s.length()-->0 StringBuffer s = new
 * StringBuffer("a"); //char[] value = new char["a".length()+16]; s.length()-->1
 * 	�������⣺syso(s.length()) 
 * 	�������⣺���Ҫ��ӵ�����ײ�����ʢ�����ˣ�
 * 		�Ǿ���Ҫ���ݵײ����顣
 * 		Ĭ������£�����Ϊԭ��������2��+2��ͬʱ��ԭ�������е�Ԫ�ظ�ֵ���������� (value=Arrays.copyOf(value�������鳤��) )
 * ����StringBuffer���÷�����
 *	����append(xxx) 
 * 	ɾ��delete(int start,int end) 
 * 	�ģ�replace(int start,int end,String str)/setCharAt(int n,char ch) 
 * 	�飺charAt(int index)/indexOf(String s) 
 * 	�壺insert(int offset,xxx) ���ȣ�length() 
 * 	������ toString() / for()+charAt()
 * 
 * capacity:����
 */
public class Review {

}

