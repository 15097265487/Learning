package cn.tedu.test;

public class StudentTest02 {

	public static void main(String[] args) {
		//声明Student2类型的数组
		Student02[] stu = new Student02[20];
		for(int i=0;i<stu.length;i++){
			//实例化数组中的每一个学生元素
			stu[i] = new Student02();//给每个元素给个值
			stu[i].number = i+1;//学号
			stu[i].state =(int)(Math.random()*6+1);//年级
			stu[i].score =(int)(Math.random()*101);//分数
		}
		Student02 test = new Student02();
		test.print(stu);
		//问题1：打印出三年纪的学生信息(1-6)年级
		System.out.println("******************************");
		test.find(stu, 3);//查找年级
	    //问题2：使用冒泡排序按学生成绩排序，并遍历所有学生信息
		System.out.println("******************************");
		test.sort(stu);//排序
		test.print(stu);//遍历
		//Student02[] state1 = test.state(stu,3);
		//System.out.println(state1.length);
		//test,print(state1)
	}
}


