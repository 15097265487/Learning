package cn.tedu;

public class DailyDemo07 {

	public static void main(String[] args) {
		int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
		//第一种反转方法
		for(int i=0;i<arr.length/2;i++) {
			int temp =arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-i-1]=temp;
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}//第二种反转方法
		for(int a=0,j=arr.length-1;a<j;a++,j--) {
			int temp=arr[a];
			arr[a]=arr[j];
			arr[j]=temp;
		}System.out.println();
		for(int s:arr) {
			System.out.print(s+" ");
		}
	}
}
