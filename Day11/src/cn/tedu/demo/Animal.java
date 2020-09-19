package cn.tedu.demo;
/*
 * 面向对象的特征之一：封装
 * 	一、问题引入：
 * 	  当我们创建了一个对象之后，我们可以通过对象名对对象的属性进行赋值
 * 	  赋值操作只受到属性的数据类型的限制
 * 	  除此之外，没有其他限制条件，但实际问题中我们往往需要给属性加入额外的限制条件
 * 	  这个条件就不能再属性声明时体现，我们只能通过方法进行条件的添加。如setAge（int i）
 * 	  时。我们需要避免用户在使用“对象名.属性”给属性赋值
 *	  属性的声明设置成私有的private（private只可以在本类中使用）------->此时，针对属性就体现了封装性
 * 	
 * 	 get set:
 * 			set()是给属性赋值的，get()是取得属性值的 
 * 	二、封装性的体现
 * 	  将属性私有化，提供公开的方法来访问属性，不对外暴露的私有方法
 * 		xxx setXxx(...)   void
 * 			getXxx()      无参有返回值
 * 	  单列模式
 * 	三、封装性的体现，需要访问修饰符
 * 	 ①. 4修饰符：private  public  缺省      protected
 * 	 ②. 4种权限修饰符用来修饰类及类的内部结构
 * 		属性   方法   构造器   内部类
 * 	 ③. 修饰符：public 缺省
 * 		4种权限修饰符用来修饰类及类的内部结构：属性   方法   构造器   内部类
 * 
 * 总结封装性：
 * 	java提供4种权限修饰符用来修饰类及类的内部结构
 * 	体现类及类的内部结构在被调用时的可见性	  

 */

public class Animal {
	private String name;//名字
	private int age;//年龄
	//private只能在当前的累里面使用，私有的
	private int legs;//退
	public Animal() {
		
	}
	public Animal(String n,int m,int i) {
		name=n;
		age=m;
		legs=i;
	}
	/**对legs属性进行设置*/
	public void setLegs(int n) {
		if(n>=0 && n%2==0) {//偶数
			legs = n;
		}else {
			//抛异常
			legs=0;
		}
	}
	/**对属性进行获取的方法*/
	public int getLegs() {
		return legs;
	}
	/**对年龄进行设置*/
	public void setAge(int a) {
		if(a>=0) {
			age = a;
		}else {
			age=0;
		}
	}
	/**对年龄属性进行设置*/
	public int getAge() {
		return age;
	}
	/**对名字进行设置*/
	public void setName(String m) {
		name=m;
	}
	/**对名字属性进行设置*/
	public String getName() {
		return name;
	}
	

	public void eat() {
		System.out.println("动物进食");
	}
	public void sleep() {
		System.out.println("动物睡觉");
	}
	public void info() {
		System.out.println("name:"+name+",age:"+age+",legs:"+legs);
	}

}
