package cn.tedu.demo;
/*
 * 	����Զ����쳣��
 * 		1.�̳����е��쳣�ṹ��RuntimeException Exception
 * 		2.�ṩȫ�ֳ�����serialVersionUID
 * 		3.�ṩ���ع�����
 * 
 */

public class MyException extends Exception{

	static final long serialVersionUID = 1L;
	public MyException() {
		
	}
	public MyException(String message) {
		super(message);
	}

}
