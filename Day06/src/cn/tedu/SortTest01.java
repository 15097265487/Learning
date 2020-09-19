package cn.tedu;

import java.util.Arrays;

public class SortTest01 {

	public static void main(String[] args) {
		//使用冒泡排序，实现如下的数组从小到大排序
		int[] arr = new int[] {34,5,22,-98,6,-76,0,-3};
		int temp = 0;
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int n:arr) {
			System.out.print(n+" ");
		}//创建新数组，使用方法复制1
		System.out.println("\n新数组：");
		int[] array=Arrays.copyOf(arr, 10);
		Arrays.sort(array);
		for(int s:array) {
			System.out.print(s+" ");
		}//创建新数组，使用方法复制2
		System.out.println();
		array = new int[10];
		System.arraycopy(arr, 0, array, 1, 7);
		for(int s:array) {
			System.out.print(s+" ");
		}
		System.out.println();
		int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
		}
	}
}
