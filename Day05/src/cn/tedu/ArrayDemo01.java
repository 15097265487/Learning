package cn.tedu;

public class ArrayDemo01 {

	public static void main(String[] args) {
		/*
		 * ���飺һ����ͬ��������Ԫ�صļ���
		 *������������������
		 *���鳤��һ�������ˣ����ɸı�
		 * ����������
		 * ��ֵ��
		 * ʹ�ã�С����㿪ʼ��������鳤��-1
		 */
		//1.����
		int[] arr1,arr0;//��������
		int arr2[];
		//2.��ʼ��
		int[] arr3 = new int[10];//10��0����̬��ʼ��
		//��̬��ʼ��:�����ʼ����Ԫ�صĸ�ֵ��ͬʱ����
		int[] arr4 = new int[] {1,2,3,4,5,6};
		int[] arr5 = {1,2,3,4,5,1};
		int[] arr6 = new int[] {};//��������0��

		arr1 = new int[5];
		arr2 = new int[] {1,2,3,4,5,6};
		//arr0 = {1,2,3};�������
		
		//��arr2������λ������
		arr2 = new int[0];
		arr2 = new int[] {};
		
		//����ʾ����
		//int arr = new int[];����ָ�����鳤��
		//int arr = new int[3]{};������ָ�����鳤��
		//int[5] arr = new int[5];��������ǰ���[]������
		
		//3.ʹ�ã�ͨ���±�������������
		//����ĳ��ȣ�������.lenght
		int lenght = arr3.length;
		System.out.println("����ĳ���;"+lenght);//10
		//����ĵ�һ��Ԫ��
		arr3[0] = 12;
		//��������һ��Ԫ��
		arr3[arr3.length-1] = 100;
		//������������
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]+" ");
			
		}	
	}
}