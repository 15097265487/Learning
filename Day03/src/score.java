import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		/*
		 * ����ѧ���ɼ�����60�֣�����ϸ񡣵���60�ֵģ�������ϸ�
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ĳɼ���");
		int num = sc.nextInt();
		if(num>=60) {
			System.out.println("�ϸ�");
		}else {
			System.out.println("���ϸ�");
		}

	}

}
