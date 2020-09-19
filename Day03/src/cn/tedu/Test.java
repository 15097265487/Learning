package cn.tedu;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int a = 5;
		int b = 13;
		int max = a>b?a:b;
		System.out.println(max);
		
		int c = 50;
		int max1 = (a>b?a:b)>c?(a>c?a:c):c;
		System.out.println(max1);
		
		
		System.out.println("----------------------------------------------");
		if(a>b) {
			System.out.println(a+"\n"+b);
		}else if(a<b){
			System.out.println(a+"\n"+b);
		}
		System.out.println("----------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字（以空格分开！）：");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println("num1:"+num1+"\t"+"num2:"+num2+"\t"+"num3:"+num3);
		if(num1>num2) {
			if(num2>num3) {
				System.out.println("由小到大："+num3+"<"+num2+"<"+num1);
			}else if(num3>num1) {
				System.out.println("由小到大："+num2+"<"+num1+"<"+num3);
		   }else {
			    System.out.println("由小到大："+num2+"<"+num3+"<"+num1);
		   }
		   }else {
			   
		   if(num1>num3) {
				System.out.println("由小到大："+num3+"<"+num1+"<"+num2);
			}else if(num3>num2){
				System.out.println("由小到大："+num1+"<"+num2+"<"+num3);
			}else {
				System.out.println("由小到大："+num1+"<"+num3+"<"+num2);
				  }
		   //练习
		   boolean bo = true;
		   if(bo = false)
			   System.out.println("a");
		   else if(bo)
			   System.out.println("b");
		   else if(!bo)
			   System.out.println("c");
		   else
			   System.out.println("d");
			   }
			
		
		   }
	}
	
		

			
			

			
		
	


