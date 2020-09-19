package cn.tedu.array;

public class ArrayDemo03 {

	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,3};
		for(int i:arr1) {
			System.out.println(i+" ");
		}
		System.out.println();
		int[] arr2 = arr1;
		arr2[0] = 10;
		for(int i:arr1) {
			System.out.println(i+" ");//10 2 3
		}

	}

}
