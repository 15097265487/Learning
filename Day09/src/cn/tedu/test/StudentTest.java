package cn.tedu.test;

public class StudentTest {

	public static void main(String[] args) {
		Student01 st = new Student01();
		Student01[] stu = new Student01[20];
		//System.out.println(stu);//��ַ
		//System.out.println(stu[0]);//null
		for(int i=0;i<stu.length;i++){
			//ʵ���������е�ÿһ��ѧ��Ԫ��
			stu[i] = new Student01();//��ÿ��Ԫ�ظ���ֵ
			stu[i].number = i+1;//ѧ��
			stu[i].state =(int)(Math.random()*6+1);//�꼶
			stu[i].score =(int)(Math.random()*101);//����
			//stu[i].infor();
			System.out.println(stu[i].infor());
		}
		//����һ���ҳ����꼶��ѧ��
		System.out.println("----------------�������꼶----------------");
		for(int i=0;i<stu.length;i++) {//�������ѧ����Ϣ�ķ���
			if(stu[i].state==3) {
				//stu[i].infor();
				System.out.println(stu[i].infor());
			}
		}
		//�������ð������
		System.out.println("-----------------�ɼ��Ӵ�С---------------");
		for(int i=0;i<stu.length-1;i++) {
			for(int j=0;j<stu.length-1-i;j++) {
				if(stu[j].score<stu[j+1].score) {
					//�����Ҫ���򽻻�����Student01�Ķ���
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

