package cn.tedu.array;

public class ArrayDemo01 {
	/*
	 * ��ά���飺
	 * 	1.��⣺
	 * 		���ڶ�ά�������⣬���ǿ��Կ�����һά����array1����Ϊarray2��Ԫ��
	 * 		��ʵ�ӵײ�����л���������û�ж�ά
	 * 	2.��ά�����ʹ�ã�
	 * 		�ٶ�ά�����������ʼ��
	 * 		�ڷ�������ָ��λ��Ԫ��
	 * 		�ۻ�ȡ���鳤��
	 * 		�ܱ�������
	 * 		������Ԫ��Ĭ�ϳ�ʼ��
	 * 		���ڴ����
	 */

	public static void main(String[] args) {
		//�ٶ�ά�����������ʼ��
		int[] a = new int[] {1,2,3,4};
		//��̬��ʼ��
		int[][] arr1 = new int[][] {{1,2},{2,3},{'1'}};
		int[][] arr0 = {{},{12,13}};
		//��̬��ʼ��1
		String[][] arr2 = new String[3][2];//ǰ�������ű���д
		//��̬��ʼ��2
		String[][] arr3 = new String[3][];
		//����д����ȷ������
		int arr4[][]; 
		int[] arr5[];
		//*****���´������*****
		//String[][] arr6 = new String[][3];
		//String[4][3] arr7 = new String[][];
		//String[][] arr8 = new String[3][3] {{12,23},{12,24}};
		
		//�ڷ�������ָ��λ��Ԫ�� �±�
		//arr1:{{12,36},{14,36}}
		System.out.println(arr1[0]);//��ַ
		System.out.println(arr1[2][0]);
		System.out.println(arr2[0]);//��ַ
		System.out.println(arr2[0][0]);//null
		
		//�ۻ�ȡ����ĳ���
		System.out.println(arr0.length);
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println(arr3.length);
		//System.out.println(arr4.length);
		//System.out.println(arr5.length);����
		//String[] s;	null;	arr3,[3][]
		//System.out.println(arr3[0].length);//��ָ���쳣
		System.out.println(arr2[2].length);
		System.out.println(arr1[2].length);
		arr3[0]=new String[3];
		System.out.println(arr3[0].length);
		
		//�ܱ��������ά����
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				System.out.println(arr1[i][j]);
			}
			System.out.println();
		}
	}

}
