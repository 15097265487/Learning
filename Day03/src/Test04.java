import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����루�ո�ֿ�����");
		int month = sc.nextInt();
		int day = sc.nextInt();
		int days = day;
		switch(month){
		case 12:
			//ǰ��11���µ�������
			//days += ��11�µ�����;
			days += 30;
		case 11:
			//ǰ��10���µ�������
			//days += ��10�µ�����;
			days += 31;
		case 10:
			days += 30;//����
		case 9:
			days += 31;//����
		case 8:
			days += 31;//����
		case 7:
			days += 30;//����
		case 6:
			days += 31;//����
		case 5:
			days += 30;//����
		case 4:
			days += 31;//����
		case 3:
			days += 29;//����
		case 2:
			days += 31;//һ��
			}
		System.out.println("2020���"+month+"��"+day+"���ǵ�"+days+"��");
	}
}
