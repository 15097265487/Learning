import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		//创建键盘输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个两位数：");
		int num = sc.nextInt();
		//获取输入数字的十位数
		int nums = num/10;
		//获取输入数字的个位数
		int numg = num%10;
		/*
		 *[1,100]
		 *int i=(int)(Math.random()*100)+1   //数据类型转换：(要转换的类型)(数据)
		 *[1,10)--->[10,99] [0,90)--->[10,100)
		 */
		//Math.random( :[0,1)* 90 →>[0,90)+10>[10,100)→[10,99]
		int value =(int)(Math.random()*90+10);//产生随机数[10,99)  --->[10,89+10)
		System.out.println("彩票数是："+value);
		//随机数的十位数
		int values = value/10;
		//随机数的个位数
		int valueg = value%10;
		//数字相同
		if(num==value) {
			System.out.println("恭喜您猜对了，奖励10000美元");
			//数字都能匹配，但顺序不同
		}else if(nums==valueg && numg==values) {
			System.out.println("恭喜您猜对了，奖励3000美元");
			//数字顺序匹配一个
		}else if(nums==values || numg==valueg){
			System.out.println("恭喜您猜对了，奖励1000美元");
			//数字非顺序匹配一个
		}else if(nums==valueg || numg==values){
			System.out.println("恭喜您猜对了，奖励500美元");
		}else {//没有匹配到数字
			System.out.println("一个都没猜中，彩票作废");
		}
		

	}

	

}
