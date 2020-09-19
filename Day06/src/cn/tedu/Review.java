package cn.tedu;

import java.util.Arrays;

public class Review {

	public static void main(String[] args) {
		/*
		 * 数组：
		 * 	1.概述数组：Array
		 * 	是多个相同数据类型元素的集合
		 * 	通过编号的方式对这些数据进行统一的管理
		 * 	2.相关概念
		 * 	数组名、元素、角标、下标、索引、
		 * 	数组长度:元素的个数
		 * 	3.数组特点
		 * 	3.1)数组是有序的
		 * 	3.1)数组属于引用数据类型的变量，数据的元素可以是基本数据类型，也可以是引用数据类型
		 * 	3.3)创建数组对象会在内存中开辟一整段连续的空间
		 * 	3.4)数组的长度一旦声明，就不能改变
		 * 	4.数据的分类
		 * 	4.1)按照维数 一维二维三维...
		 * 	4.2)按照数组元素类型
		 * 		基本数据类型元素的数组
		 * 		引用数据类型元素的数组
		 * 	5.数组的使用
		 * 		数组的声明初始化
		 * 			int[] arr;
		 * 			int arr[];
		 * 
		 * 			动态：声明数组的同时不指定数组中的元素
		 * 			静态：声明数组同时指定数组中的每一个元素
		 * 			int[] arr = new int[6];
		 * 			int[] arr = new int[]{1,2,3,4};
		 * 			int[] arr = {1,2,3,4};//类型推断
		 * 
		 * 			arr = new int[1];
		 * 			arr = new int[]{};//0个元素
		 * 			错误展示：arr = {1,2,3};
		 * 		访问数组指定位置元素
		 * 			下标：[0,arr.lenght-1]
		 * 		获取数组长度
		 * 			arr.lenght
		 * 		遍历数组
		 * 			for循环
		 * 		数组元素默认初始化
		 * 			int byte short 0
		 * 			double 0.0
		 * 			char 0或\'u0000' 
		 *     		long 0L
		 *       	String(引用类型都是) null
		 *       	boolean false
		 *       	float 0.0F
		 * 		内存解析
		 * 
		 *	Arrays.copyOf(original, newLength);
		 *		 original;原数组，要复制的数组
		 *		 newLength：新数组的长度
		 *		   返回值为：操作后新数组
		 *		   扩容：比原数组长的数组
		 *		   缩容：比原数组小的数组
		 *	System.arraycopy(src, srcPos, dest, destPos, length);
		 *		 src:原数组，要复制的数组
		 *		 srcPos:原数组的下标
		 *		 dest:新数组
		 *		 destPos:新数组的下标
		 *		 length:新数组的个数
		 */
		int[] arr = new int[] {1,3,14,52,62};
		//arr[0] = 20;
		//arr[4] = 100;
		int[] array = Arrays.copyOf(arr, arr.length);
		Arrays.sort(array);//数组排序，升序
		for(int i:array) {
			System.out.print(i+" ");
		}
		//数组复制的第二种方式
		//array = new int[10];
		System.out.println();
		System.arraycopy(arr, 2, array, 0, 2);
		for(int i:array) {
			System.out.print(i+" ");
		}
		

	}

}
