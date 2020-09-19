package cn.tedu.demo;

public class MyExceptionTest {
	public static void main(String[] args) {
		try {
			m1();//�׳��쳣
			System.out.println("123");//��ִ�У�
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
		//stu.setID(23);���쳣���봦��try/throw��
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
			System.out.println("�Ƿ�����!");
			//�ֶ��׳��쳣
			//throw new RuntimeException("���ݷǷ�");
			//throw new Exception("���ݷǷ�");
			throw new MyException("����Ҫ����0������");
			//throw new Object();�����׳��������͵��쳣;�쳣���ͱ�����Throwable������
		}
	}
	public String toString() {
		return "id="+id;
	}
}