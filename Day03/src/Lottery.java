import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		//������������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int num = sc.nextInt();
		//��ȡ�������ֵ�ʮλ��
		int nums = num/10;
		//��ȡ�������ֵĸ�λ��
		int numg = num%10;
		/*
		 *[1,100]
		 *int i=(int)(Math.random()*100)+1   //��������ת����(Ҫת��������)(����)
		 *[1,10)--->[10,99] [0,90)--->[10,100)
		 */
		//Math.random( :[0,1)* 90 ��>[0,90)+10>[10,100)��[10,99]
		int value =(int)(Math.random()*90+10);//���������[10,99)  --->[10,89+10)
		System.out.println("��Ʊ���ǣ�"+value);
		//�������ʮλ��
		int values = value/10;
		//������ĸ�λ��
		int valueg = value%10;
		//������ͬ
		if(num==value) {
			System.out.println("��ϲ���¶��ˣ�����10000��Ԫ");
			//���ֶ���ƥ�䣬��˳��ͬ
		}else if(nums==valueg && numg==values) {
			System.out.println("��ϲ���¶��ˣ�����3000��Ԫ");
			//����˳��ƥ��һ��
		}else if(nums==values || numg==valueg){
			System.out.println("��ϲ���¶��ˣ�����1000��Ԫ");
			//���ַ�˳��ƥ��һ��
		}else if(nums==valueg || numg==values){
			System.out.println("��ϲ���¶��ˣ�����500��Ԫ");
		}else {//û��ƥ�䵽����
			System.out.println("һ����û���У���Ʊ����");
		}
		

	}

	

}
