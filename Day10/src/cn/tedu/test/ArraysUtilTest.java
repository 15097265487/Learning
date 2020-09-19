package cn.tedu.test;

public class ArraysUtilTest {

	public static void main(String[] args) {
		ArraysUtil util = new ArraysUtil();
		int[] a = {12,25,15,69,4,8,6,951,};
		util.print(a);
		System.out.println(util.getMin(a));
		util.sort(a);
		//System.out.print(util.sort(a));
		//数组中各个元素之和
		util.sum(a);
		System.out.println(util.sum(a));
		
		util.mean(a);
		System.out.println(util.mean(a));

	}

}
