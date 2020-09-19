package cn.tedu.array;

public class ArrayDemo02 {
	/*
	 * 二维数组的使用：
	 * 	二维数组分为外层数组元素，内层数组元素
	 * 	int[][] arr=new int[3][4];
	 * 	外层元素：arr[0]，arr[1](每个元素类型为int)
	 * 	内层元素：arr[0][0],arr[0][2]等
	 * 
	 * 	元素默认初始化：
	 * 	初始化方法一：
	 * 	int[][] arr=new int[4][3];
	 * 	外元素的初始值：地址值
	 * 	内元素的初始值：与一维数组的情况相同
	 * 	初始化方法二：
	 * 	int[][] arr=new int[4][]
	 * 	外元素的初始值：null
	 * 	内元素的初始值：不能调用，否则报错，空指针异常
	 */

	public static void main(String[] args) {
		//⑤数组元素默认初始化
		int[][] arr=new int[4][3];
		System.out.println("\n一维数组地址："+arr[0]);//地址
		System.out.println("一维数组中的默认值："+arr[0][0]);//0
		System.out.println("二维数组地址："+arr);//地址
		
		float[][] arr1=new float[4][3];
		System.out.println("\n一维数组地址："+arr1[0]);//地址
		System.out.println("一维数组中的默认值："+arr1[0][0]);//0
		System.out.println("二维数组地址："+arr1);//地址
		
		String[][] arr2=new String[4][3];
		System.out.println("\n一维数组地址："+arr2[0]);//地址
		System.out.println("一维数组中的默认值："+arr2[0][0]);//0
		System.out.println("二维数组地址："+arr2);//地址
		
		System.out.println("-----------------");
		double[][] arr3=new double[4][];
		//double[] d; 未实例化（创建对象的过程）
		System.out.println(arr[0]);//null
		//System.out.println(arr3[0][0]);//报错空指针

	}

}
