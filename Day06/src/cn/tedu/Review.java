package cn.tedu;

import java.util.Arrays;

public class Review {

	public static void main(String[] args) {
		/*
		 * ���飺
		 * 	1.�������飺Array
		 * 	�Ƕ����ͬ��������Ԫ�صļ���
		 * 	ͨ����ŵķ�ʽ����Щ���ݽ���ͳһ�Ĺ���
		 * 	2.��ظ���
		 * 	��������Ԫ�ء��Ǳꡢ�±ꡢ������
		 * 	���鳤��:Ԫ�صĸ���
		 * 	3.�����ص�
		 * 	3.1)�����������
		 * 	3.1)�������������������͵ı��������ݵ�Ԫ�ؿ����ǻ����������ͣ�Ҳ������������������
		 * 	3.3)���������������ڴ��п���һ���������Ŀռ�
		 * 	3.4)����ĳ���һ���������Ͳ��ܸı�
		 * 	4.���ݵķ���
		 * 	4.1)����ά�� һά��ά��ά...
		 * 	4.2)��������Ԫ������
		 * 		������������Ԫ�ص�����
		 * 		������������Ԫ�ص�����
		 * 	5.�����ʹ��
		 * 		�����������ʼ��
		 * 			int[] arr;
		 * 			int arr[];
		 * 
		 * 			��̬�����������ͬʱ��ָ�������е�Ԫ��
		 * 			��̬����������ͬʱָ�������е�ÿһ��Ԫ��
		 * 			int[] arr = new int[6];
		 * 			int[] arr = new int[]{1,2,3,4};
		 * 			int[] arr = {1,2,3,4};//�����ƶ�
		 * 
		 * 			arr = new int[1];
		 * 			arr = new int[]{};//0��Ԫ��
		 * 			����չʾ��arr = {1,2,3};
		 * 		��������ָ��λ��Ԫ��
		 * 			�±꣺[0,arr.lenght-1]
		 * 		��ȡ���鳤��
		 * 			arr.lenght
		 * 		��������
		 * 			forѭ��
		 * 		����Ԫ��Ĭ�ϳ�ʼ��
		 * 			int byte short 0
		 * 			double 0.0
		 * 			char 0��\'u0000' 
		 *     		long 0L
		 *       	String(�������Ͷ���) null
		 *       	boolean false
		 *       	float 0.0F
		 * 		�ڴ����
		 * 
		 *	Arrays.copyOf(original, newLength);
		 *		 original;ԭ���飬Ҫ���Ƶ�����
		 *		 newLength��������ĳ���
		 *		   ����ֵΪ��������������
		 *		   ���ݣ���ԭ���鳤������
		 *		   ���ݣ���ԭ����С������
		 *	System.arraycopy(src, srcPos, dest, destPos, length);
		 *		 src:ԭ���飬Ҫ���Ƶ�����
		 *		 srcPos:ԭ������±�
		 *		 dest:������
		 *		 destPos:��������±�
		 *		 length:������ĸ���
		 */
		int[] arr = new int[] {1,3,14,52,62};
		//arr[0] = 20;
		//arr[4] = 100;
		int[] array = Arrays.copyOf(arr, arr.length);
		Arrays.sort(array);//������������
		for(int i:array) {
			System.out.print(i+" ");
		}
		//���鸴�Ƶĵڶ��ַ�ʽ
		//array = new int[10];
		System.out.println();
		System.arraycopy(arr, 2, array, 0, 2);
		for(int i:array) {
			System.out.print(i+" ");
		}
		

	}

}
