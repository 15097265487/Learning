package cn.tedu.demo;
/*
 * this�ؼ���ʹ��
 * 1.this�����������Ρ��������ԡ�������������
 * 2.this�������� ����
 * 		this���Ϊ��
 * 		��ǰ�Ķ��� �� ��ǰ���ڴ����Ķ���
 * 	2.1 ����ķ����У�ͨ�����·�ʽ���ö�������Ժͷ���
 * 		this.����
 * 		this.����
 * 	 
 * 	......
 * 3.this���ù�����	
 * 		this(�����б�)
 * 		
 */
public class ThisTest {
	public static void main(String[] args) {
		Cort p = new Cort("",1);
		System.out.println("over");
	}
}
class Cort{
	private String name;
	private int age;
	//constructor getter setter toString
	public Cort(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}
	public Cort() {
		System.out.println("123");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void eat() {
		System.out.println("��");
		this.sleep();
	}
	public void sleep() {
		System.out.println("˯");
	}
	
	
}