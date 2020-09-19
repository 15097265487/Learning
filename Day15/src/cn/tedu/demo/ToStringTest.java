package cn.tedu.demo;
/*
 * toString();
 * 	1.当我们输出一个对象时，实际上调用的当前对象的toString()方法
 * 	2.Object类中的toString()定义
 * 		public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    	}
    3.String Date File 包装重写了Object中的toString方法
 * 	1、自反性：对于任何非空引用值 x，x.equals(x) 都应返回 true。
            2、对称性：对于任何非空引用值 x 和 y，当且仅当 y.equals(x) 返回 true 时，x.equals(y) 才应返回 true。
            3、传递性：对于任何非空引用值 x、y 和 z，如果 x.equals(y) 返回 true，并且 y.equals(z) 返回 true，那么 x.equals(z) 应返回 true。
            4、一致性：对于任何非空引用值 x 和 y，多次调用 x.equals(y) 始终返回 true 或始终返回 false，前提是对象上 equals 比较中所用的信息没有被修改。
 */

public class ToStringTest {

	public static void main(String[] args) {
		Customer c = new Customer();
		System.out.println(c);//c.toString()
		Object o = new Customer();
		//运行时类库class cn.tedu.demo.Customer
		System.out.println(o.getClass());
		String str = new String ("123");
		System.out.println(str);

	}

}
