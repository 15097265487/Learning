package cn.tedu;

public class Review {

	public static void main(String[] args) {
		/*
	 * 	一维数组：
	 * 			①一维数组的声明初始化
	 * 				int arr[] = {};
	 * 			②访问数组指定位置元素
	 * 			③获取数组长度
	 * 			④遍历数组
	 * 			⑥数组元素默认初始化
	 * 			⑦内存解析
	 * 			⑧数组的复制
	 * 				Arrays.copyof(原数组，数组的长度)
	 * 				System.arraycopy(原数组, 原数组的下标, 新数组, 新数组的下标, 要复制的元素的个数);
	 * 			⑨数组的排序：
	 * 				Arrays.sort(arr);需要接收，升序
	 * 				冒泡排序：for(int i=0;i<arr.lenght-1;i++){外层控制的轮数
	 * 						for(int j=0;j<arr.lenght-i-1;j++){里层控制的次数，j初始值为0，下标
	 * 							if(arr[j]<arr[j+1]){
	 * 							int t=arr[j];
	 * 							arr[j]=arr[j+1];
	 * 							arr[j+1]=t;
	 * 							}
							}
	 * 					}
	 * 
	 * 			⑩数组的赋值（数组间）
	 * 				int[] arr1 = new int[10];
	 * 				int[] arr2 = arr1;
	 * 				arr2[0] = 18;
	 * 				arr1[0] =?//18
	 * 				arr1 arr2指向同一个地址，操作的是同一组数据
	 * 			int[] arr1 = new int[]{1,2,3,4};
	 * 			int[] arr2 = new int[]{1,2,3,4};
	 * 			arr1=arr2?// f 地址不同
	 * 
	 * 
	 *2.二维数组的使用：
	 * 			①二维数组的声明初始化
	 * 				int[][] arr;int arr[][];int[] arr[];
	 *				int[][] arr = new int[3][2];
	 *				int[][] arr = new int[3][];//int[] a;null
	 *   			arr[0] = new int[5];
	 *				int[][] arr = new int[][] {{1},{1,2},{}};
	 *				int[][] arr = {{1,3},{1,2},{6,8,10}};
	 * 			②访问数组指定位置元素
	 * 				arr[0]---类型int[]----打印时输出地址/null
	 * 				arr[0][1]----类型int---打印时输出数组元素默认值或者空指针异常或打印的值
	 * 			③获取数组长度
	 * 				arr.lenght
	 * 				arr[0].lenght
	 * 			④遍历数组
	 * 				for(int i=0;i<arr.lenght-1;i++){
	 * 					for(int j=0;j<arr[i].lenght;j++){
	 * 						arr[i][j]
	 *     }
	 * }
	 * 			⑥数组元素默认初始值
	 * 				int[][] arr = new int[3][2]
	 * 					arr[0]---地址
	 * 					arr[0][0]----默认值0
	 * 				int[][] arr = new int[3][]
	 * 					arr[0]--null
	 * 					arr[00][]---空指针异常
	 * 			⑦内存解析
		 */
		int[] arr = new int[10];
				System.out.println(arr[10]);//下标越界
		int[] arr1 = null;
				System.out.println(arr[0]);//空指针异常
	}

}
