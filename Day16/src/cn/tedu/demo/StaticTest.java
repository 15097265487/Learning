package cn.tedu.demo;
/*
static �ؼ��ֵ�ʹ��
    1.static����̬��
    2.static���������Σ����� ���� ����� �ڲ���
    3.ʹ��static�������ԣ�����������Ա����  �ֲ����������ԣ��Ƿ���static����
                            ��̬����VS�Ǿ�̬����
                         �Ǿ�̬���������
                            ���Ǵ�����������ʱ���������ͬʱ����ͬһ����̬����ʱ���ᵼ�������Ķ�����þ�̬����ʱ�õ������޸ĺ�Ľ����
                         �Ǿ�̬����(ʵ������)
                  ���Ǵ�����������ʱ��ÿ������ӵ��һ�����еķǾ�̬���ԣ����޸�����һ������ķǾ�̬����ʱ���������Ķ���û��Ӱ��
                  �����޸���������ķǾ�̬����ֵ
     3.1.ʹ��˵��
        �پ�̬������������ļ��ض����صģ�����ͨ��������.��̬�������ķ�ʽ�����ã�
        �ھ�̬�����ļ������ڶ���Ĵ���
        ��������ļ���ֻ�����һ�Σ���̬�������ڴ���ֻ����һ�ݣ����ڷ������ľ�̬���С�
                  �����        ʵ������
      ��     yes             no
      ����   yes             no
        static���������ξֲ�����
     3.2.��̬���Ծ���
        System.out,Math.PI
    4.static���η�������̬����
        �پ�̬������������ļ��ض����أ�����ͨ������.��̬�������ķ�ʽ���е���
        ��            ��̬����        �Ǿ�̬����
              ��     yes             no
              ����   yes             yes
        �۷���֮��ĵ���
            ��̬�����У�ֻ�ܵ��þ�̬�����Ժͷ������������Ե��÷Ǿ�̬�ķ��������ԣ�
            �Ǿ�̬�ķ��������Ե��þ�̬�ķ���������Ҳ���Ե��÷Ǿ�̬�����Ժͷ���
    5.static
        ��̬�����У�������ʹ��this��super�ؼ���

    6.�����У����ȷ��һ��������static
        ���Կ����Ǳ�����������ģ����������Ĳ�ͬ����ͬ
        ����
    6.�����У����ȷ��һ��������static
        ������̬����ʱͨ������Ϊstatic��
        �������еķ�����ϰ��������Ϊstatic
            ���磺Arrays Math Collections

 */

public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.name="����ɽ";
        c1.age=85;
        c1.nation = "CHINA";
        Chinese c2 = new Chinese();
        c1.name="����ɽ";
        c1.age=85;
        c2.nation = "CN";
        System.out.println(c1.nation);//���۸ĳ�˭��ִֻ�����һ�ε�����
        System.out.println(c2.nation);
        System.out.println("-------------");
        Chinese.nation = "�й�";
        System.out.println(c1.nation);
        System.out.println(c2.nation);
        System.out.println("-------------");
        Chinese.show();
        c1.show();
        c2.show();
        System.out.println("-------------");
        //Chinese.eat();�������
        //Chinese.age;


    }
}
class Chinese{
    String name;
    int age;
    static String nation;
    public void eat(){
        System.out.println("���в�");
        //�Ǿ�̬�ķ������Ե��þ�̬�ķ���������
        show();
        age=10;
        toString();
    }
    public static void s(){}
    public static void show(){
        System.out.println("�й���");
        s();//��̬������
        nation=" ";//��̬���ԣ���ʵ��
        //age=1;��̬�����в����Ե��÷Ǿ�̬������
        //eat();��̬�����в����Ե��÷Ǿ�̬�ķ���
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}