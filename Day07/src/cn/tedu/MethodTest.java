package cn.tedu;

import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {
		/*
		 * 系统随机产生5个字符，由用户进行猜测并记录用户每次猜对的字符数及猜对数的位置 列如：ABCDE，用户猜测：afqwe 则猜对字符数为3个，猜对位置数为1个
		 * 要求：
		 *  ①系统随机产生字符要求： 均为大写 A-Z 且不可重复 
		 *  ②得分规则要求： 总分500分(一个字符100分) 每猜错一次扣10分
		 * 	③当用户输入EXIT时退出程序 
		 * 	④输出结果要求： 最终输出总得分 猜错总次数
		 */
		// 获取键盘输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要猜的5个字母：");
		int n=sc.nextInt();
		int count = 0;
		char[] ch = letter(n);
		//System.out.println(ch);输出随机产生的字符
		while(true) {
			/*String s = sc.next().trim().toUpperCase();
			char[] input = s.toCharArray(); */
			String s = sc.next();
			char[] guess = convert(s);
			//比较输入和产生
			int[] num = input(ch, guess);
			int score = 500-count*10;
			if(s.equals("EXIT")) {
				System.out.println("退出");
				break;
			}
			if(score<=0) {
				score=0;
			}
			if(num[1]==ch.length) {
				System.out.println("恭喜你！猜对了！你的得分是："+score);
				break;
			}else {
				count++;
				System.out.println("你猜对"+num[0]+"个字符，其中"+num[1]+"个字符的位置正确！总次数="+count);
				break;
			}
		}
	}
	//随机数的产生
	public static char[] letter(int n){
	// 产生5位随机大写字母并判断字符是否重复
		char[] c = new char[5];
		for (int i = 0; i < c.length; i++) {
			c[i] = (char) ('A' + Math.random() * 26);
		// i 的位置和 i 前面每一个位置判断一下有没有重复
			for (int j = 0; j < i; j++) {
				if (c[i] == c[j]) {
					i--;// 让程序还在原来位置重复生成字母
					break;
					}
				}
			}
			return c;
		}
	//比较输入的字符和产生的字符是否一致
	public static int[] input(char[] ran,char[] guess) {
		int[] num = new int[2];
		for(int i=0;i<ran.length;i++) {
			for(int j=0;j<guess.length;j++) {
				if(ran[i]==guess[j]) {
					num[0]++;//字母输对了，字母正确数加1
					if(i==j) {
						num[1]++;//说明位置对了，位置数加1
					}
					break;
				}
			}
		}
		return num;
	}
	public static char[] convert(String str) {
        char[] numb = new char[5];
        // 将字符串切割成每个字符
        for (int i = 0; i < numb.length; i++) {
            numb[i] = str.charAt(i);
        }
        return numb;
    }
}