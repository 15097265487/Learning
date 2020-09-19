package cn.tedu.demo2;
/*
 * 异常处理：抓抛模型
 * "抛"：程序在执行的过程中，一旦出现异常就会在异常的代码处生一个对应的异常类对象，并将对象抛出。一旦抛出对象以后，其后面的代码就不再执行。
 * "抓"：可以理解为异常的处理方式
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
            System.out.println("数值转换异常");
        }catch(NullPointerException e){
            System.out.println("出现空指针");
        }
    }

}
