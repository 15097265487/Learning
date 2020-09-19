package cn.tedu;

public class ArrayDemo02 {

	public static void main(String[] args) {
		/*
		 * 数组中元素的默认初始值
		 */
		/*int[] arr1 = new int[5];
		double[] arr2 = new double[5];
		boolean[] arr3 = new boolean[5];//默认是false
		String[] arr4 = new String[5];//所有引用类型默认值为null
		/*
		 *  i代表的是数组中的每一个元素
		 *  :后面的内容为要便利的集合或数组
		 */
		/*for(int i:arr1) {
			System.out.print(i+" ");
		}
		for(double i:arr2) {
			System.out.print(i+" ");
		}
		for(boolean i:arr3) {
			System.out.print(i+" ");
		}
		for(String i:arr4) {
			System.out.print(i+" ");
		}*/
		
		int[] arr5 = new int[10];
		int[] arr6 = new int[] {2,5,8};
		int[] arr7;
		arr7 = new int[] {2,5,8};
		//System.out.print(arr7);
		
		int[] as=new int[3];
		as[0]=100;
		as[1]=200;
		as[2]=300;
		//System.out.println(as);
		//System.out.println(as.length);
		//System.out.println(as[3]);
		
		int arr[] = new int[10];
		//int in = as[]
		int max=arr[0];
		int min=arr[9];
		for(int i=0;i<arr.length-1;i++) {
		    arr[i] = (int)(Math.random()*100);
		    System.out.println(arr[i]+" ");
			if(arr[i]>max) {
				max=arr[i];
				
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}
}
