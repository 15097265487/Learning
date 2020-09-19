package cn.tedu.test;

public class StudentTest {

	public static void main(String[] args) {
		Student01 st = new Student01();
		Student01[] stu = new Student01[20];
		//System.out.println(stu);//地址
		//System.out.println(stu[0]);//null
		for(int i=0;i<stu.length;i++){
			//实例化数组中的每一个学生元素
			stu[i] = new Student01();//给每个元素给个值
			stu[i].number = i+1;//学号
			stu[i].state =(int)(Math.random()*6+1);//年级
			stu[i].score =(int)(Math.random()*101);//分数
			//stu[i].infor();
			System.out.println(stu[i].infor());
		}
		//问题一：找出三年级的学生
		System.out.println("----------------查找三年级----------------");
		for(int i=0;i<stu.length;i++) {//调用输出学生信息的方法
			if(stu[i].state==3) {
				//stu[i].infor();
				System.out.println(stu[i].infor());
			}
		}
		//问题二：冒泡排序
		System.out.println("-----------------成绩从大到小---------------");
		for(int i=0;i<stu.length-1;i++) {
			for(int j=0;j<stu.length-1-i;j++) {
				if(stu[j].score<stu[j+1].score) {
					//如果需要换序交换的是Student01的对象
					Student01 temp=stu[j]; 
					stu[j]=stu[j+1];
					stu[j+1]=temp;
				}
			}
		}
		for(int i=0;i<stu.length;i++) {
			stu[i].infor();
			System.out.println(stu[i].infor());
		}
	}
}

