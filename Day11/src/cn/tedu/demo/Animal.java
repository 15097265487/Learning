package cn.tedu.demo;
/*
 * ������������֮һ����װ
 * 	һ���������룺
 * 	  �����Ǵ�����һ������֮�����ǿ���ͨ���������Զ�������Խ��и�ֵ
 * 	  ��ֵ����ֻ�ܵ����Ե��������͵�����
 * 	  ����֮�⣬û������������������ʵ������������������Ҫ�����Լ���������������
 * 	  ��������Ͳ�������������ʱ���֣�����ֻ��ͨ������������������ӡ���setAge��int i��
 * 	  ʱ��������Ҫ�����û���ʹ�á�������.���ԡ������Ը�ֵ
 *	  ���Ե��������ó�˽�е�private��privateֻ�����ڱ�����ʹ�ã�------->��ʱ��������Ծ������˷�װ��
 * 	
 * 	 get set:
 * 			set()�Ǹ����Ը�ֵ�ģ�get()��ȡ������ֵ�� 
 * 	������װ�Ե�����
 * 	  ������˽�л����ṩ�����ķ������������ԣ������Ⱪ¶��˽�з���
 * 		xxx setXxx(...)   void
 * 			getXxx()      �޲��з���ֵ
 * 	  ����ģʽ
 * 	������װ�Ե����֣���Ҫ�������η�
 * 	 ��. 4���η���private  public  ȱʡ      protected
 * 	 ��. 4��Ȩ�����η����������༰����ڲ��ṹ
 * 		����   ����   ������   �ڲ���
 * 	 ��. ���η���public ȱʡ
 * 		4��Ȩ�����η����������༰����ڲ��ṹ������   ����   ������   �ڲ���
 * 
 * �ܽ��װ�ԣ�
 * 	java�ṩ4��Ȩ�����η����������༰����ڲ��ṹ
 * 	�����༰����ڲ��ṹ�ڱ�����ʱ�Ŀɼ���	  

 */

public class Animal {
	private String name;//����
	private int age;//����
	//privateֻ���ڵ�ǰ��������ʹ�ã�˽�е�
	private int legs;//��
	public Animal() {
		
	}
	public Animal(String n,int m,int i) {
		name=n;
		age=m;
		legs=i;
	}
	/**��legs���Խ�������*/
	public void setLegs(int n) {
		if(n>=0 && n%2==0) {//ż��
			legs = n;
		}else {
			//���쳣
			legs=0;
		}
	}
	/**�����Խ��л�ȡ�ķ���*/
	public int getLegs() {
		return legs;
	}
	/**�������������*/
	public void setAge(int a) {
		if(a>=0) {
			age = a;
		}else {
			age=0;
		}
	}
	/**���������Խ�������*/
	public int getAge() {
		return age;
	}
	/**�����ֽ�������*/
	public void setName(String m) {
		name=m;
	}
	/**���������Խ�������*/
	public String getName() {
		return name;
	}
	

	public void eat() {
		System.out.println("�����ʳ");
	}
	public void sleep() {
		System.out.println("����˯��");
	}
	public void info() {
		System.out.println("name:"+name+",age:"+age+",legs:"+legs);
	}

}
