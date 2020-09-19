package cn.tedu.demo;
/*
 * 面向对象的特征之三： 多态性
 * 		一个事物的多种形态
 * 
 * 	2.对象的多态性：父类的引用指向子类的对象，或将子类的对象赋值给父类的引用
 * 	3.对态的使用：
 * 			虚拟方法调用：有了对象的多态性后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类中重写的父类的方法。
 * 	4.总结：编译看左边，运行时看右边(只适用方法)
 * 		使用前提：①类的继承关系，②方法的重写
 * 	5.对象的多态性只适用于方法，不适用于属性，
 * 		属性：编译和运行都看左边
 */       
public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.eat();
		Man m = new Man();
		m.eat();
		m.age=18;
		System.out.println("-----------------");
		//对象的多态性：父类的引用指向子类的对象
		Person p2 = new Man();
		Person p3 = new Woman();
		
		p2.eat();//执行子类（虚拟方法调用）
		p2.walk();
		System.out.println("-----------------"); 
		System.out.println(p2.id);
		//p2.isHandsome=true;//编译看左边
		p3.eat();
		/*p2不能调用子类特有的属性和方法
		 * 
		 * p2是person类
		 * 有了这个多态后，内存中实际上加载了子类特有的属性和方法，。
		 * 编译时，只能调用父类中声明的属性和方法，子类中特有的方法和属性不能调用  
		 */
		
		System.err.println(p3);
		System.out.println("✔");
		/*
		 * 向上转型：（多态）父类引用指向子类的对象
		 * 
		 * 如何调用子类特有的属性和方法
		 * 向下转型：父类型引用----->子类型引用
		 * 
		 */
		Man man = (Man) p2;
		man.isHandsome=true;
		man.earnMoney();
		
		//使用向下转型时(强转)，可能会ClassCastException异常
//		Woman w = (Woman) p2;
//		System.out.println(w);
		
		
		
		/*
		 * instanceof关键字的使用
		 * 格式：a instanceof A
		 * 		判断对象a是否是类A的实例
		 * 		如果是，返回true
		 * 		如果不是，返回false
		 */
		if(p3 instanceof Woman) {
			Woman w = (Woman) p3;
			w.goShopping();
			System.out.println(w);
		}
		if(p2 instanceof Man) {
			//man man1 p2地址值一样
			Man man1 = (Man)p2;
			System.out.println(man1);
		}
		if(p2 instanceof Object) {
			System.out.println("Object");
		}
		//练习
		//问题一：编译时通过，运行时不通过
		Person p4 = new Woman();
		Man m1 = (Man) p4;
		Person p5 = new Person();
		Man m2 = (Man) p5;
		Object o = new PersonTest();
		Person p6 = (Person) o;//向下转型▲
		Man m3 = (Man) o;
		Woman m4 =(Woman) o;
		
		//问题二：编译不通过，
		//Woman w1 = new Man;
		//Woman w1 = new Person();
		
		//问题三：编译通过，运行通过
		Object o1 = new Person();
		o1 = new PersonTest();
		

		

	}

}
