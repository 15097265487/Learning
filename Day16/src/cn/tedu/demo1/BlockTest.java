package cn.tedu.demo1;
/*
    ��ĳ�Ա֮�ģ������
        1.���������ã�������ʼ����Ͷ���
        2.���ࣺ��̬����� �Ǿ�̬�����
        3.ֻ��ʹ��static����

        4.��̬�����
            ���ڲ�����д�����䣬���Ժ���ļ��ض�ִ��
            �����һ�����ж����˶����̬����飬˳��ִ��
            �۾�̬��������ڷǾ�̬�����ִ��
            �ܾ�̬������У�ֻ�ܵ��þ�̬�����ԡ�����
        5.�Ǿ�̬�����
            ���ڲ�����д�����䣬���Ŷ���Ĵ�����ִ�У�new��
            �����һ�����ж����˶���Ǿ�̬����飬˳��ִ��
            �۷Ǿ�̬������У����ܵ��þ�̬�����ԡ����������Ե��÷Ǿ�̬�����ԡ�����
 */

import java.util.function.DoubleToIntFunction;

public class BlockTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
    }
}
class Person{
    String name;
    int age;
    static String des = "����һ����";

    public Person() {
        super();
    }
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    //��static�����
    {
        System.out.println("block 1");
        //���÷Ǿ�̬�ṹ
        name = "";
        toString();
        //���þ�̬�ṹ
        des = "";
        show();//ǰ���ʡ����Person------->Person.show();
    }
    {
        System.out.println("block 11");
    }

    //��̬�����
    static {
        System.out.println("block 2");
        //�����Ե��÷Ǿ�̬�ṹ


    }
    static {
        System.out.println("block 22");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void show(){
        System.out.println("������  ��");
    }

}
