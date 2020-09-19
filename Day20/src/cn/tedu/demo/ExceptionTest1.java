package cn.tedu.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/*
 * �쳣����ץ��ģ��
 * "��"��������ִ�еĹ����У�һ�������쳣�ͻ����쳣�Ĵ��봦��һ����Ӧ���쳣����󣬲��������׳���һ���׳������Ժ������Ĵ���Ͳ���ִ�С�
 * "ץ"���������Ϊ�쳣�Ĵ���ʽ
 * 
 * 	˵����
 * 		1.finally�ǿ�ѡ�ġ�
 * 		2.ʹ��try�����ܳ����쳣�Ĵ������������ִ�еĹ����У�һ�������쳣���ͻ����һ���쳣��Ķ���(try{}����Ĵ��벻��ִ��)���ݶ�������ͣ���catch�н���ƥ�䡣
 * 		3.һ��try�е��쳣����ƥ�䵽ĳһ��catch���ͽ���catch�н����쳣�Ĵ���һ��������ɣ���������ǰ��try-catch����δдfinally��������ִ��������
 * 		4.catch�е��쳣�������û���Ӹ����ϵ���������Ⱥ�˳���������Ӹ���ϵ����Ҫ������һ���ڸ������档����������
 * 		5.try�������ı�����ֻ����try{}��ʹ�ã�����try�ṹ�󣬾Ͳ����ڱ����÷���
 * 		6.try-catch-finally����Ƕ��ʹ��
 * 		7.���õ��쳣���Ͷ��ֵĴ���ʽ��
 * 			��String getMessage()
 * 			��void printStackTrace()
 * 		
 * 
 * 		1.ʹ��try-catch-finally�������ʱ�쳣����ʹ�ĳ����ڱ���ʱ������������ʱ�Կ��ܱ����൱������ʹ��try-catch-finally������ʱ���ܳ����쳣��
 * 			�ӳٵ�����ʱ����	
 * 		2.����ʱ�������쳣�Ƚϳ�������������ͨ�����������ʱ�쳣��дtry-catch-finally����Ա���ʱ�쳣����һ��Ҫ���ǵ��쳣�Ĵ���
 * 
 */

public class ExceptionTest1 {
	public static void main(String[] args) {
		
	}
	@Test
	public void test2() {
		try {
			File file = new File("hello.text");
			FileInputStream fis = new FileInputStream(file);
			int data = fis.read();
			while(data != -1) {
				System.out.println((char)data);
				data = fis.read();
				
			}
			fis.close();
		} catch (FileNotFoundException e) {
 			//e.printStackTrace();
 			System.out.println("�ļ��Ҳ���");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("-------------------------------------------------");
	}
	
	@Test
	public void test1(){
        String s = "abc";
        int num = 10;
        try{
        	System.out.println(2/1);
            s=null;
            System.out.println(s.toCharArray());
            num = Integer.parseInt(s);
            System.out.println("--------1");

        }catch(NumberFormatException e){
            System.out.println("��ֵת���쳣");
        }catch(NullPointerException e){
            //System.out.println("���ֿ�ָ��");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(Exception e) {
        	System.out.println("�����쳣");
        	try {
        		System.out.println(2/0);
        	}catch(Exception e2) {
        		System.out.println(e.getMessage());
        	}
        }
        System.out.println(num);
        System.out.println("over");
    }

}
