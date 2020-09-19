package cn.tedu;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		/*
		 * 运算符：
		 * 算术运算符
		 *    + - * / ++ --
		 * 关系运算符
		 *    > < = >= <= == !=
		 * 逻辑运算符
		 *    & | ^（逻辑异或）
		 *    && || !（非真既假，非假既真）
		 *    & && (短路逻辑)一假即假
		 *    | || (短路逻辑)一假即真
		 * 赋值运算符
		 *    += -= *= /= %= =
		 *    a+=19.8  //a=(int)+(19.8)
		 *               不会改变变量的数据类型           
		 * 三元运算符
		 *               条件表达式？表达式1：表达式2    //（double）
		 *               表达式类型要一致
		 *    4>2?'a':12  //'a'
		 *    4>2?'a':-12  //97
		 * 字符串连接符
		 *    +
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入任意三个整数，并以空格隔开，以回车键结束：");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		scanner.close();
		System.out.println("输入的值为：a = " + a + ",  b = " + b + ", c = " + c);
		if(a > b){
			if ( b > c) {
				System.out.println("按从小到大排序为：" + c + "," + b + "," + a);
				System.out.println("按从大到小排序为：" + a + "," + b + "," + c);
			}else if( c > a){
				System.out.println("按从小到大排序为：" + b + ","  + a + "," + c);
				System.out.println("按从大到小排序为：" + c + "," + a + "," + b);
			}else{
				System.out.println("按从小到大排序为：" + b + "," + c + ","  + a);
				System.out.println("按从大到小排序为：" + a + "," + c + "," + b);
			}
		}else{
			if(c < a){
                System.out.println("按从小到大排序为：" + c + "," + a + "," + b);
                System.out.println("按从大到小排序为：" + b + "," + a + "," + c);
            }else if(c > b){
                System.out.println("按从小到大排序为：" + a + "," + b + "," + c);
                System.out.println("按从大到小排序为：" + c + "," + b + "," + a);
            }else{
                System.out.println("按从小到大排序为：" + a + "," + c + "," + b);
                System.out.println("按从大到小排序为：" + b + "," + c + "," + a);
            }
		}
	}

}
