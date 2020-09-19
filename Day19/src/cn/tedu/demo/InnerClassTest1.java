package cn.tedu.demo;
/*
 * 
 * 1.内部类仍然是一个独立的类， 在编译之后内部类会被编译成独立的.class文件， 但
		是前面冠以外部类的类名和$符号， 以及数字编号。
 2.只能在声明它的方法或代码块中使用， 而且是先声明后使用。 除此之外的任何地方
		都不能使用该类。
 3.局部内部类可以使用外部类的成员， 包括私有的。
 4.局部内部类可以使用外部方法的局部变量， 但是必须是final的。 由局部内部类和局
		部变量的声明周期不同所致。
 5.局部内部类和局部变量地位类似， 不能使用public,protected,缺省,private
 6.局部内部类不能使用static修饰， 因此也不能包含静态成员
 */

public class InnerClassTest1 {
	public static void main(String[] args) {
		InnerClassTest1 i = new InnerClassTest1();
		i.method();
	}
	//用的比较少
	public void method() {
		int num = 10;
		int i = 1;
		//局部内部类
		class AA{
			//num = 100;
			//要求局部变量num声明为final
			public void f() {
				System.out.println(num);
			}
		}
		//num = 0;
		i=10;
		System.out.println(i);
		
	}
	public Comparable getComparable() {
		//方式一
//		class MyComparable implements Comparable{
//			@Override
//			public int compareTo(Object o) {
//				return 0;
//			}//局部内部类
//		}
//		return new MyComparable();
		//方式二
		return new Comparable() {//匿名实现类
			@Override
			public int compareTo(Object o) {
				return 0;
			}
		};
	}

}
