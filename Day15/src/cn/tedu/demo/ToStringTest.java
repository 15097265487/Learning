package cn.tedu.demo;
/*
 * toString();
 * 	1.���������һ������ʱ��ʵ���ϵ��õĵ�ǰ�����toString()����
 * 	2.Object���е�toString()����
 * 		public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    	}
    3.String Date File ��װ��д��Object�е�toString����
 * 	1���Է��ԣ������κηǿ�����ֵ x��x.equals(x) ��Ӧ���� true��
            2���Գ��ԣ������κηǿ�����ֵ x �� y�����ҽ��� y.equals(x) ���� true ʱ��x.equals(y) ��Ӧ���� true��
            3�������ԣ������κηǿ�����ֵ x��y �� z����� x.equals(y) ���� true������ y.equals(z) ���� true����ô x.equals(z) Ӧ���� true��
            4��һ���ԣ������κηǿ�����ֵ x �� y����ε��� x.equals(y) ʼ�շ��� true ��ʼ�շ��� false��ǰ���Ƕ����� equals �Ƚ������õ���Ϣû�б��޸ġ�
 */

public class ToStringTest {

	public static void main(String[] args) {
		Customer c = new Customer();
		System.out.println(c);//c.toString()
		Object o = new Customer();
		//����ʱ���class cn.tedu.demo.Customer
		System.out.println(o.getClass());
		String str = new String ("123");
		System.out.println(str);

	}

}
