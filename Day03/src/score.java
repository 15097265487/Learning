import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		/*
		 * 对于学生成绩大于60分，输出合格。低于60分的，输出不合格
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的成绩：");
		int num = sc.nextInt();
		if(num>=60) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}

	}

}
