package cn.tedu.test;

import java.util.Scanner;

public class Guessing {
	
	/*
	 * 系统随机产生5个字符，由用户进行猜测并记录用户每次猜对的字符数及猜对数的位置 列如：ABCDE，用户猜测：afqwe 则猜对字符数为3个，猜对位置数为1个
	 * 要求：
	 *  ①系统随机产生字符要求： 均为大写 A-Z 且不可重复 
	 *  ②得分规则要求： 总分500分(一个字符100分) 每猜错一次扣10分
	 * 	③当用户输入EXIT时退出程序 
	 * 	④输出结果要求： 最终输出总得分 猜错总次数
	 * 
	 * 1、设计数据结构（数据应如何存储）
	 * 		随机5个字符--- cahr[] chs；
	 * 		用户猜测的结果--char[] input；
	 * 		猜测结果------int[] result
	 * 		分数---------int score
	 * 		猜错次数------int count
	 * 2、设计程序结构（方法）
	 * 		随机产生5个字符的方法
	 * 		随机产生与用户猜测字符比较的方法
	 * 		在主方法中完成调用main(){}
	 * 3、在主方法中调用
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Guessing g = new Guessing();
		char[] chs = g.genrerate();
		//System.out.println(g.grerate());
		//g.genrerate();
		int score=500,count=0;
		while(true) {//死循环
			System.out.println("请开始猜：：");
			String str = sc.next();
			str = str.toUpperCase();//转换为大写
			if("EXIT".equals(str)){
				System.out.println("欢迎再次挑战！");
				break;
			}
			char[] input = str.toCharArray();
			//chs[] input[]比较
			int[] result  = g.check(chs,input);
			if(result[1]==chs.length) {//完全对
				System.out.println("恭喜你猜对了");
				System.out.println("一共猜错了"+count+"次");
				System.out.println("总得分："+score+"分");
				break;
			}else {//错误
				count++;
				score-=10;
				System.out.println("字符对的是"+result[0]+",位置对的个数为"+result[1]);
				
			}
		}

	}
	/**
	 * 生成随机字符，	
	 */
	public char[] genrerate() {
		char[] chs = new char[5];
		//A-Z随机字符的取值
		char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V','W', 'X', 'Y', 'Z'};
		boolean[] flags = new boolean[letters.length];
		for(int i=0;i<chs.length;i++) {
			int index;
			//判断是否index产生过
			do {//生成随机下标
				index = (int) (Math.random()*26);
			} while (flags[index]==true);
			chs[i] = letters[index];
			flags[index]=true;
		}
		return chs;
	}
	public int[] check(char[] chs,char[] input) {
		//result[0]字符对   result[1]位置对
		int[] result = new int[2];
		for(int i=0;i<chs.length;i++) {//遍历随机字符数组
			for(int j=0;j<input.length;j++) {//
				if(chs[i]==input[j]) {//字符对
					result[0]++;//增加1
					if(j==j) {//位置对+1
						result[1]++;
					}
					break;
				}
			}
		}
		return result;//返回值
	}

}
