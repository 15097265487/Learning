package cn.tedu.method;

import java.util.Arrays;

public class Method {

	public static void main(String[] args) {
		/*
		 * ����һ�������һά����
		 * 			���鳤�ȼ�������Ԫ�صķ�Χ���û�����
		 */
		
		array();
		
		Method m =new Method();
		int[] array = m.generatrArray(10, 10, 20);//����   ��С----���
		String str = Arrays.toString(array);
		System.out.println();
		System.out.println(str);
		
	}
	public static void array() {
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100);
			System.out.print(arr[i]+" ");
		}
	}
	public int[] generatrArray(int lenght,int start,int end) {
		int[] array = new int[lenght];
		if(start>end) {//100 10
			//System.out.println("����Ԫ��ΪĬ��ֵ");
			int temp = start;
			start = end;
			end = temp;
		}
		if(start==end) {
			for(int i=0;i<array.length;i++) {
				array[i]=start;
			}
		}
		if(end>start) {
		for(int i=0;i<array.length;i++) {
			//[0,range]--->[10,100]
			array[i] = (int) (Math.random()*(end-start-1)+start);
			}
		}
		return array;
	}
}
