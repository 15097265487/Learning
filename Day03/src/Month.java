import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		/*
		 * 根据指定的月份输出这个月份所属的季节
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份：");
		int mon = sc.nextInt();
		switch(mon) {
		case 3:
		case 4:
		case 5:
			System.out.println(mon+"月份是春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(mon+"月份是夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(mon+"月份是秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(mon+"月份是冬季");
			break;
		default:
			System.out.println("你输入的月份不存在！！！");
		}
	}

}
