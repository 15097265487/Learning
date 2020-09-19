package cn.tedu;

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		/*
		 * 条件表达式必须是布尔表达式（逻辑表达式或关系表达式）、布尔变量
		 * 语句块只有一条执行语句时，一对{}可以省略，但建议保留
		 *当 if-else语句结构，根据需要可以嵌套使用
		 * 当if-else结构是“多选一时”最后的else是可选的，根据需要可以省略
		 * 当多个条件时“互斥”关系时，条件判断语句及执行语句间顺序无所谓，当多个条件是“包含”关系时，“小上大下/子上父下”
		 * if(条件表达式){
		 *    //if语句块
		 * }
		 * 
		 * if(条件表达式){
		 *    //if语句块1
		 * }else{
		 * 	  //if语句块1
		 * }
		 * 
		 * if(条件表达式){
		 *    //if语句块1
		 * }else if(条件表达式){
		 * 	  //if语句块2
		 * }else if(条件表达式){
		 * 	  //if语句块3
		 * }
		 */
		
		int a = 10;
		if(a>10) {
			System.out.println(a);
		}else {
			System.out.println(a+10);//20
			//a+=10-->a=a+10
			System.out.println(a+=10);//20
			System.out.println(a);//20
		}
		int c = 100;
		if(c>100) {
			System.out.println("男生");
		}else {
			System.out.println("女生");
		}
		System.out.println("over");
		
		/*
		 * 收银系统
		 *   不打折
		 * 总价>100   九折
		 * 总价>400  八折
		 * 总价>800 六折
		 * 总价>1000 五折折
		 *输出值及付款金额、商品总价、找零 
		 *(键盘输入：商品单价*数量)
		 */
		System.out.println("-----------------收银系统-------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入商品单价：");
		int price = sc.nextInt();
		System.out.println("请输入商品数量：");
		int num = sc.nextInt();
		
		int money = num*price;
		
		if(money<=100) {
			System.out.println("此商品不打折！");
			money*=money;
		}else if(money>100) {
			money*=0.9;
			System.out.println("此商品九折："+money*0.9+"元");
		}else if(money>=400) {
			System.out.println("此商品八折："+money*0.8+"元");
			money*=0.8;
		}else if(money>=800) {
			System.out.println("此商品六折："+money*0.6+"元");
			money*=0.6;
		}else if(money<=1000) {
			System.out.println("此商品五折："+money*0.5+"元");
			money*=0.5;
		}
		//应付金额
	    System.out.println("总价："+money+"元");
		//实付
		System.out.println("实际付款金额：");
		int d = sc.nextInt();
		int i = d-money;
		if(d<money) {
			System.out.println("金额不足还缺："+(money-d)+"元");
		}else 
			//找零=实际-总价
			System.out.println("找零："+i+"元");
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
