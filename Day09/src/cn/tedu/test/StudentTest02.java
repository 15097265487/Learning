package cn.tedu.test;

public class StudentTest02 {

	public static void main(String[] args) {
		//����Student2���͵�����
		Student02[] stu = new Student02[20];
		for(int i=0;i<stu.length;i++){
			//ʵ���������е�ÿһ��ѧ��Ԫ��
			stu[i] = new Student02();//��ÿ��Ԫ�ظ���ֵ
			stu[i].number = i+1;//ѧ��
			stu[i].state =(int)(Math.random()*6+1);//�꼶
			stu[i].score =(int)(Math.random()*101);//����
		}
		Student02 test = new Student02();
		test.print(stu);
		//����1����ӡ������͵�ѧ����Ϣ(1-6)�꼶
		System.out.println("******************************");
		test.find(stu, 3);//�����꼶
	    //����2��ʹ��ð������ѧ���ɼ����򣬲���������ѧ����Ϣ
		System.out.println("******************************");
		test.sort(stu);//����
		test.print(stu);//����
		//Student02[] state1 = test.state(stu,3);
		//System.out.println(state1.length);
		//test,print(state1)
	}
}


