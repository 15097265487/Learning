package cn.tedu;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {1,3,2,4};
		System.out.println(a==b);//地址不一致结果false
		//boolean equals(int[] a,int[] b);
		System.out.println(Arrays.equals(a, b));
		//String toString(int[] a);
		System.out.println(Arrays.toString(a));
		//void fill(int[] a,int val)
		Arrays.fill(a, 10);
		System.out.println(Arrays.toString(a));
		//void sort(int[] a);
		Arrays.sort(b);//排序，升序
		System.out.println(Arrays.toString(b));

	}

}
