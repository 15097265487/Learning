import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		/*
		 * ����ָ�����·��������·������ļ���
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int mon = sc.nextInt();
		switch(mon) {
		case 3:
		case 4:
		case 5:
			System.out.println(mon+"�·��Ǵ���");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(mon+"�·����ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(mon+"�·����＾");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(mon+"�·��Ƕ���");
			break;
		default:
			System.out.println("��������·ݲ����ڣ�����");
		}
	}

}
