package cn.tedu;

public class Test {

	public static void main(String[] args) {
		/*
		 * ��һ�������в���һ�����֣����������22��
		 */
		int dest=22;
		boolean isFlag=true;
		int[] arr= new int[] {10,25,47,86,56,41,89,11,25,23};//���һ���ҵ�
		//�������ֵĵ�һ�ַ���
		for(int i=0;i<arr.length;i++) {
			if(dest==arr[i]) {
				System.out.println(i);
				isFlag=false;
				break;
			}
		}
		if(isFlag){//i==arr.lenght;i=9
			System.out.println("δ�ҵ�");
		}
		//�������ֵĵڶ��ַ���
		int i=0;
		for(;i<arr.length;i++) {
			if(dest==arr[i]) {
				System.out.println(i);
				break;
			}
		}
		System.out.println();
		if(i==arr.length){//i==arr.lenght;i=9
			System.out.println("δ�ҵ�");
		}

	}

}
