package cn.tedu;

public class ArrayDemo02 {

	public static void main(String[] args) {
		/*
		 * ������Ԫ�ص�Ĭ�ϳ�ʼֵ
		 */
		/*int[] arr1 = new int[5];
		double[] arr2 = new double[5];
		boolean[] arr3 = new boolean[5];//Ĭ����false
		String[] arr4 = new String[5];//������������Ĭ��ֵΪnull
		/*
		 *  i������������е�ÿһ��Ԫ��
		 *  :���������ΪҪ�����ļ��ϻ�����
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
