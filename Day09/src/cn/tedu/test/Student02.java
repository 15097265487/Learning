package cn.tedu.test;

import java.util.Arrays;

public class Student02 {
	//属性，成员变量
	int number;//学号
	int state;//年级
	int score;//分数
	
	/**输出,打印学生信息*/
	/*public void infor() {
		System.out.println("学号"+number+"\t"+"年级"+state+"\t"+"分数"+score); 
	}*/
	public String infor() {
		return"学号"+number+"\t"+"年级"+state+"\t"+"分数"+score;
	}
	//要遍历的数组
	public void print(Student02[] ss) {
		for(int i=0;i<ss.length;i++) {
			System.out.println(ss[i].infor());
		}
	}
	//查找数组中指定年级的学生信息
	public void find(Student02[] s,int state) {//指定年级 指定年级
		for(int i=0;i<s.length;i++) {
			if(s[i].state==state) {
				System.out.println(s[i].infor());
			}
		}
	}
	/*public void state(Student02[] s,int state) {//指定年级 指定年级
		Student02[] ss = new Student02();
		for(int i=0;i<s.length;i++) {
			if(s[i].state==state) {
				System.out.println(s[i].infor());
				ss = Arrays.copyOf(ss, ss.length+1);
				ss[ss.length-1] = s[i];
			}
		}
		return ss;
	}*/
	/**
	 * 	要遍历的学生数组
	 */
	public void sort(Student02[] stu) {
		for(int i=0;i<stu.length-1;i++) {
			for(int j=0;j<stu.length-1-i;j++) {
				if(stu[j].score<stu[j+1].score) {
					//如果需要换序交换的是Student01的对象
					Student02 temp=stu[j]; 
					stu[j]=stu[j+1];
					stu[j+1]=temp;
				}
			}
		}
	}
}