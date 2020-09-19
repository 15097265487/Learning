package cn.tedu;

import java.util.Scanner;

public class ArraySortDemo {
	public static void main(String[] args) {
		/*
		 * 冒泡排序：
		 * 	1.比较响铃的元素
		 * 		如果第一个比第二个大（升序）
		 * 	2.对每一对元素做相同的工作
		 * 	3.针对所有元素重复以上步骤
		 * 	4.持续每次对越来越少的元素
		 * 	数组长度有五轮则比较四轮，比较的次数为长度-1
		 * 	每一轮都会冒出一个数
		 * 	冒出来的数在不做比较
		 * 	34 33 42 11 78
		 * 	1： 78冒出来
		 * 		34>33? y 33 34 42 11 78
		 * 		34>42? n 33 34 42 11 78
		 * 		42>11? y 33 34 11 42 78	
		 * 		42>78? n 33 34 11 42 78
		 * 	2. 42冒出来
		 * 	    33>34? n 33 34 11 42 78
		 * 		34>11? y 33 11 34 42 78	
		 * 		34>42? n 33 11 34 42 78
		 * 	3. 34冒出来	
		 * 		33>11? y 11 33 34 42 78	
		 * 		33>34? n 11 33 34 42 78
		 * 	4. 33冒出来	
		 * 		11>33? n 11 33 34 42 78	
		 */
		/*Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("输入数字<以空格分开>：");*/
		int[] arr = new int[] {69,0,28,77,35};
		int temp = 0;
		//升序
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("冒泡升序：");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		//降序
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("冒泡降序：");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
