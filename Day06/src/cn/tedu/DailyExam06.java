package cn.tedu;

import java.util.Arrays;

public class DailyExam06 {

	public static void main(String[] args) {
		System.out.println();
		int arr[] = new int[10];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random());
			System.out.println("");
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("\n" + max);
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		arr1[arr1.length - 1] = max;
		for (int i : arr1) {
			System.out.println(i + " ");
			
		}	
		System.out.println();
		//3.2)將最大值放置新数组中第一位
		for (int i1 = 0; i1 < arr.length; i1++) {
			arr1[i1 + 1] = arr[i1];//i=0 1 2 3 4
		}
		arr1[0]=max;
		for(int i:arr1) {
			System.out.println(i+" ");
		}
		System.out.println();
		int[] array = Arrays.copyOf(arr, arr.length);
		Arrays.sort(array);//数组排序 升序
		for(int i:array) {
			System.out.println(i+" ");
		}
		//数组复制的第二种方式
		System.out.println();
		array=new int[10];
		System.arraycopy(arr, 1, array, 3, 3);
		for(int i:array) {
			System.out.println(i+" ");
		}
	}

}
