package cn.tedu.array;

public class ArrayDemo01 {
	/*
	 * 二维数组：
	 * 	1.理解：
	 * 		对于二维数组的理解，我们可以看作成一维数组array1又做为array2的元素
	 * 		其实从底层的运行机制来看，没有多维
	 * 	2.二维数组的使用：
	 * 		①二维数组的声明初始化
	 * 		②访问数组指定位置元素
	 * 		③获取数组长度
	 * 		④遍历数组
	 * 		⑥数组元素默认初始化
	 * 		⑦内存解析
	 */

	public static void main(String[] args) {
		//①二维数组的声明初始化
		int[] a = new int[] {1,2,3,4};
		//静态初始化
		int[][] arr1 = new int[][] {{1,2},{2,3},{'1'}};
		int[][] arr0 = {{},{12,13}};
		//动态初始化1
		String[][] arr2 = new String[3][2];//前面中括号必须写
		//动态初始化2
		String[][] arr3 = new String[3][];
		//以下写法正确，声明
		int arr4[][]; 
		int[] arr5[];
		//*****以下错误情况*****
		//String[][] arr6 = new String[][3];
		//String[4][3] arr7 = new String[][];
		//String[][] arr8 = new String[3][3] {{12,23},{12,24}};
		
		//②访问数组指定位置元素 下标
		//arr1:{{12,36},{14,36}}
		System.out.println(arr1[0]);//地址
		System.out.println(arr1[2][0]);
		System.out.println(arr2[0]);//地址
		System.out.println(arr2[0][0]);//null
		
		//③获取数组的长度
		System.out.println(arr0.length);
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println(arr3.length);
		//System.out.println(arr4.length);
		//System.out.println(arr5.length);错误
		//String[] s;	null;	arr3,[3][]
		//System.out.println(arr3[0].length);//空指针异常
		System.out.println(arr2[2].length);
		System.out.println(arr1[2].length);
		arr3[0]=new String[3];
		System.out.println(arr3[0].length);
		
		//④遍历数组二维数组
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				System.out.println(arr1[i][j]);
			}
			System.out.println();
		}
	}

}
