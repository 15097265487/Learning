package cn.tedu.demo2;
/*
 * �쳣����ץ��ģ��
 * "��"��������ִ�еĹ����У�һ�������쳣�ͻ����쳣�Ĵ��봦��һ����Ӧ���쳣����󣬲��������׳���һ���׳������Ժ������Ĵ���Ͳ���ִ�С�
 * "ץ"���������Ϊ�쳣�Ĵ���ʽ
 * 
 * 
 */

public class ExceptionTest2 {
	public static void main(String[] args) {
		
	}
	public void test(){
        String s = "abc";
        int num = 10;
        try{
            s=null;
            num = Integer.parseInt(s);
            System.out.println("--------1");

        }catch(NumberFormatException e){
            System.out.println("��ֵת���쳣");
        }catch(NullPointerException e){
            System.out.println("���ֿ�ָ��");
        }
    }

}
