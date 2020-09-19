package cn.tedu;

public class SortTest {
	/*
	 * √∞≈›≈≈–Ú£∫Ωµ–Ú
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 2, 12, 6, 8, 45 };
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		for (int num : arr) {
			System.out.print(num+" ");
		}
		/*for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}*/
	}
}
