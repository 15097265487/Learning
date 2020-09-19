package cn.tedu.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/*
 * 异常处理：抓抛模型
 * "抛"：程序在执行的过程中，一旦出现异常就会在异常的代码处生一个对应的异常类对象，并将对象抛出。一旦抛出对象以后，其后面的代码就不再执行。
 * "抓"：可以理解为异常的处理方式
 * 
 * 	说明：
 * 		1.finally是可选的。
 * 		2.使用try将可能出现异常的代码包起来，在执行的过程中，一旦出现异常，就会产生一个异常类的对象，(try{}后面的代码不再执行)根据对象的类型，与catch中进行匹配。
 * 		3.一旦try中的异常对象匹配到某一个catch，就进入catch中进行异常的处理。一旦处理完成，就跳出当前的try-catch（在未写finally），继续执行其后代码
 * 		4.catch中的异常类型如果没有子父类关系。则声明先后顺序。若存在子父关系，则要求子类一定在父类上面。否则编译错误
 * 		5.try中声明的变量，只能在try{}中使用，出了try结构后，就不能在被调用访问
 * 		6.try-catch-finally可以嵌套使用
 * 		7.常用的异常类型兑现的处理方式：
 * 			①String getMessage()
 * 			②void printStackTrace()
 * 		
 * 
 * 		1.使用try-catch-finally处理编译时异常，是使的程序在编译时不报错，但运行时仍可能报错，相当于我们使用try-catch-finally将编译时可能出行异常，
 * 			延迟到运行时出现	
 * 		2.开发时，由于异常比较常见，所以我们通常不针对运行时异常编写try-catch-finally，针对编译时异常，就一定要考虑到异常的处理
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
 			System.out.println("文件找不到");
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
            System.out.println("数值转换异常");
        }catch(NullPointerException e){
            //System.out.println("出现空指针");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(Exception e) {
        	System.out.println("出现异常");
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
