package cn.tedu;

public class Tset01 {

	public static void main(String[] args) {
		int[] arr=new int[6];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*30);
		}
		for(int s:arr) {
			System.out.print(s+" ");
		}
	}

}
