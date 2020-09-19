package cn.tedu.demo1;
/*
����ģʽ֮����ʽ
    ����ʽ��
        ����:�������ʱ�����
        �ô���Ĭ���߳��ǰ�ȫ��
    ����ʽ��
        �ô����ӳٶ���Ĵ���
        Ŀǰ��д���Ļ����ǲ���ȫ�ģ����߳�ʱ���޸ģ�
����ģʽ�Ķ���ʽʵ��

 */

public class SingletonTest1 {
    public static void main(String[] args) {
        Order o1 = Order.getInstance();
        Order o2 = Order.getInstance();
        System.out.println(o1==o2);

    }
}
class Order{
    //1.˽�еĹ�����
    private Order(){

    }
    //2.  ������̬����Ķ���
    private static Order instance = new Order();

    //3.�ṩ�����ľ�̬�ķ������������ص�ǰ��Ķ���
    public static Order getInstance(){
        return instance;
    }
}
