package cn.tedu;

import java.util.Scanner;

public class ArraySortDemo {
	public static void main(String[] args) {
		/*
		 * ð������
		 * 	1.�Ƚ������Ԫ��
		 * 		�����һ���ȵڶ���������
		 * 	2.��ÿһ��Ԫ������ͬ�Ĺ���
		 * 	3.�������Ԫ���ظ����ϲ���
		 * 	4.����ÿ�ζ�Խ��Խ�ٵ�Ԫ��
		 * 	���鳤����������Ƚ����֣��ȽϵĴ���Ϊ����-1
		 * 	ÿһ�ֶ���ð��һ����
		 * 	ð���������ڲ����Ƚ�
		 * 	34 33 42 11 78
		 * 	1�� 78ð����
		 * 		34>33? y 33 34 42 11 78
		 * 		34>42? n 33 34 42 11 78
		 * 		42>11? y 33 34 11 42 78	
		 * 		42>78? n 33 34 11 42 78
		 * 	2. 42ð����
		 * 	    33>34? n 33 34 11 42 78
		 * 		34>11? y 33 11 34 42 78	
		 * 		34>42? n 33 11 34 42 78
		 * 	3. 34ð����	
		 * 		33>11? y 11 33 34 42 78	
		 * 		33>34? n 11 33 34 42 78
		 * 	4. 33ð����	
		 * 		11>33? n 11 33 34 42 78	
		 */
		/*Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("��������<�Կո�ֿ�>��");*/
		int[] arr = new int[] {69,0,28,77,35};
		int temp = 0;
		//����
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("ð������");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		//����
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("ð�ݽ���");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
