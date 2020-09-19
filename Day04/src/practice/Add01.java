package practice;

import java.awt.Toolkit;
import java.util.Scanner;

public class Add01 {

	public static void main(String[] args) {
        int i=0;
        int number1=0,number2=0;
        for(;;) {
            number1=(int) (Math.random()*10);
            number2=(int) (Math.random()*10);
            //加法部分
            System.out.println("What is "+number1+"+"+number2+"?");
            Scanner scan=new Scanner(System.in);
            int answer=scan.nextInt();
            if(answer==number1+number2) {
                System.out.println("√");
                Toolkit.getDefaultToolkit().beep();
                //System.out.println('\007');
                
            }else {
                System.out.println("×");
                System.out.println(number1+"+"+number2+" should be "+(number1+number2));
            }
            //减法部分
            if(number1<number2) {
                int temp;
                temp=number1;
                number1=number2;
                number2=temp;
            }
            System.out.println("What is "+number1+"-"+number2+"?");
            int answer2=scan.nextInt();
            if(answer2==number1-number2) {
                System.out.println("√");
                for(int time=0;time<6;time++)
                Toolkit.getDefaultToolkit().beep();
            }else {
                System.out.println("×");
                System.out.println(number1+"-"+number2+" should be "+(number1-number2));
            }
            //判断加减法完成次数
            i++;
            if(i==5) {
                break;
            }
        }
    }
}


