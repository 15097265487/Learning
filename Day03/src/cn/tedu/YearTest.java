package cn.tedu;

import java.util.Scanner;

public class YearTest {

	public static void main(String[] args) {
		//��������
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = sc.nextInt();
		System.out.println("�������·ݣ�");
		int month = sc.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year+"������");
			if(month==2) {//����29��
				System.out.println(month+"��:29��");
				//�����1.3.5.7.8.10.12������31��
		    }else if(month==1||month==3||month==5||month==7||month==8||month==11||month==12){
					System.out.println(month+"��:31��");
			}else {//����Ķ���30��
					System.out.println(month+"��:30��");
			}
		}else{//������ƽ��
			    System.out.println(year+"��ƽ��");
		    if(month==4||month==6||month==9||month==11) {//�ж��Ƿ�Ϊ���£�
				System.out.println(month+"��:30��");
				//ƽ���1.3.5.7.8.10.12������31��
		    }else if(month==1||month==3||month==5||month==7||month==8||month==11||month==12){
					System.out.println(month+"��:31��");
			}else {
					System.out.println(month+"��:28��");//ƽ��2��28��
			}
		}
	}
}
