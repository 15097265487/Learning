package cn.tedu.test;

import java.util.Arrays;

public class Student02 {
	//���ԣ���Ա����
	int number;//ѧ��
	int state;//�꼶
	int score;//����
	
	/**���,��ӡѧ����Ϣ*/
	/*public void infor() {
		System.out.println("ѧ��"+number+"\t"+"�꼶"+state+"\t"+"����"+score); 
	}*/
	public String infor() {
		return"ѧ��"+number+"\t"+"�꼶"+state+"\t"+"����"+score;
	}
	//Ҫ����������
	public void print(Student02[] ss) {
		for(int i=0;i<ss.length;i++) {
			System.out.println(ss[i].infor());
		}
	}
	//����������ָ���꼶��ѧ����Ϣ
	public void find(Student02[] s,int state) {//ָ���꼶 ָ���꼶
		for(int i=0;i<s.length;i++) {
			if(s[i].state==state) {
				System.out.println(s[i].infor());
			}
		}
	}
	/*public void state(Student02[] s,int state) {//ָ���꼶 ָ���꼶
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
	 * 	Ҫ������ѧ������
	 */
	public void sort(Student02[] stu) {
		for(int i=0;i<stu.length-1;i++) {
			for(int j=0;j<stu.length-1-i;j++) {
				if(stu[j].score<stu[j+1].score) {
					//�����Ҫ���򽻻�����Student01�Ķ���
					Student02 temp=stu[j]; 
					stu[j]=stu[j+1];
					stu[j+1]=temp;
				}
			}
		}
	}
}