package cn.tedu.demo1;
/*
����ģʽ������ʽʵ��
 */

public class SingletonTest2 {
    public static void main(String[] args) {
    Bank b1 = Bank.getInstance();
    Bank b2 = Bank.getInstance();
    System.out.println(b1==b2);
    System.out.println(b1);
    System.out.println(b2);
    }
}
class Bank{
    //1.˽�л���Ĺ�����
    private Bank(){

    }
    //2.������ǰ��Ķ���û�г�ʼ��
    //4.�˶������������static
    private static Bank instance = null;
    //3.���������ķ��������ص�ǰ��Ķ���
    public static Bank getInstance(){
        if (instance==null) {
            instance = new Bank();
        }
        return instance;
    }
}