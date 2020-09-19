package cn.tedu.demo;
/*
 * 	如何自定义异常类
 * 		1.继承现有的异常结构：RuntimeException Exception
 * 		2.提供全局常量：serialVersionUID
 * 		3.提供重载构造器
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
