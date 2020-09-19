package cn.tedu.test;

import java.util.Arrays;

public class ArraySortTest4 {

	public static void main(String[] args) {
		int[] arr = new int[] {10,20,15,36,42};
		ArraySortTest4 a = new ArraySortTest4();
		a.sort(arr);
		String str= Arrays.toString(arr);
		System.out.println(str);

	}
	/*对数组进行冒泡排序*/
	public void sort(int[] arr) {//升序
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}
	/*位置的交换*/
	public void swap(int[] arr,int m,int n) {
		int temp=arr[m];
		arr[m]=arr[n];
		arr[n]=temp;
   }
}	
