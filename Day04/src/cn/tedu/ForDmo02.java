package cn.tedu;

public class ForDmo02 {

	public static void main(String[] args) {
		/*
		 * Ƕ��forѭ��
		 * ���ѭ��ִ��һ�Σ����ִ�����д�
		 * break:ֻ������һ��
		 * continue:��������ѭ�������´�ѭ��
		 */
		for(int i=0;i<5;i++) {
			System.out.print(i+" ");
			for(int j=0;j<5;j++) {
				System.out.print(j);
				//break;//
				continue;
			}
			System.out.println();
		}
		System.out.println("over");

	}

}
