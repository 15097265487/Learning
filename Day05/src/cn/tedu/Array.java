package cn.tedu;


public class Array {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int max,min;
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100);
			System.out.print(arr[i]+" ");
		}
			max=arr[0];
			min=arr[0];
			//最大值最小值
			for(int i1=1;i1<arr.length;i1++) {
			if(arr[i1]>max) {
				max=arr[i1];
			}
			if(arr[i1]<min) {
				min=arr[i1];
			}
		}//将数组的最小值放在新数组的第一位
		System.out.println();
		for(int i=1;i<arr.length-1;i++) {
			if(arr[0]<arr[i]) {
				int temp = arr[i];
				arr[i] = arr[9];
				arr[9] = temp;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nmax:"+max);
		System.out.println("min:"+min);
		
			/*System.out.println("新数组：");
			arr[arr.length-1]=max;
			for (int k = 0; k < arr.length; k++) {
				System.out.print(arr[k]+" ");
			}*/
			
	}
}
