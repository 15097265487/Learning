package cn.tedu.demo;

public class MyExceptionTest {
	public static void main(String[] args) {
		try {
			m1();//抛出异常
			System.out.println("123");//不执行，
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		//********************
		System.out.println("********************");
		Student stu = new Student();
		try {
			stu.setID(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//stu.setID(23);有异常必须处理（try/throw）
		System.out.println(stu);
	}
	public static void m1() throws MyException {
		throw new MyException("xxx");
	}

}
class Student{
	private int id;
	public void setID(int id) throws Exception {
		if(id>0) {
			this.id=id;
		}else {
			System.out.println("非法数据!");
			//手动抛出异常
			//throw new RuntimeException("数据非法");
			//throw new Exception("数据非法");
			throw new MyException("数据要大于0！！！");
			//throw new Object();不能抛出对象类型的异常;异常类型必须是Throwable的子类
		}
	}
	public String toString() {
		return "id="+id;
	}
}