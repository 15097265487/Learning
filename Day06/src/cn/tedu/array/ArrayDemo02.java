package cn.tedu.array;

public class ArrayDemo02 {
	/*
	 * ��ά�����ʹ�ã�
	 * 	��ά�����Ϊ�������Ԫ�أ��ڲ�����Ԫ��
	 * 	int[][] arr=new int[3][4];
	 * 	���Ԫ�أ�arr[0]��arr[1](ÿ��Ԫ������Ϊint)
	 * 	�ڲ�Ԫ�أ�arr[0][0],arr[0][2]��
	 * 
	 * 	Ԫ��Ĭ�ϳ�ʼ����
	 * 	��ʼ������һ��
	 * 	int[][] arr=new int[4][3];
	 * 	��Ԫ�صĳ�ʼֵ����ֵַ
	 * 	��Ԫ�صĳ�ʼֵ����һά����������ͬ
	 * 	��ʼ����������
	 * 	int[][] arr=new int[4][]
	 * 	��Ԫ�صĳ�ʼֵ��null
	 * 	��Ԫ�صĳ�ʼֵ�����ܵ��ã����򱨴���ָ���쳣
	 */

	public static void main(String[] args) {
		//������Ԫ��Ĭ�ϳ�ʼ��
		int[][] arr=new int[4][3];
		System.out.println("\nһά�����ַ��"+arr[0]);//��ַ
		System.out.println("һά�����е�Ĭ��ֵ��"+arr[0][0]);//0
		System.out.println("��ά�����ַ��"+arr);//��ַ
		
		float[][] arr1=new float[4][3];
		System.out.println("\nһά�����ַ��"+arr1[0]);//��ַ
		System.out.println("һά�����е�Ĭ��ֵ��"+arr1[0][0]);//0
		System.out.println("��ά�����ַ��"+arr1);//��ַ
		
		String[][] arr2=new String[4][3];
		System.out.println("\nһά�����ַ��"+arr2[0]);//��ַ
		System.out.println("һά�����е�Ĭ��ֵ��"+arr2[0][0]);//0
		System.out.println("��ά�����ַ��"+arr2);//��ַ
		
		System.out.println("-----------------");
		double[][] arr3=new double[4][];
		//double[] d; δʵ��������������Ĺ��̣�
		System.out.println(arr[0]);//null
		//System.out.println(arr3[0][0]);//�����ָ��

	}

}
