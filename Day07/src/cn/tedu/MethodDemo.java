package cn.tedu;

public class MethodDemo {
	/*
	 * void     println();
	 * void     print("");�����в���
	 * xxx      s.nextXxx();
	 * double   Math.random();
	 * void     Arrays.sort(int[] a);
	 * T[]      Arrays.copyOf(original, newLength)
	 * void     System.arraycopy(src, srcPos, dest, destPos, length);
	 * 
	 * һ����������ֻ��һ����
	 * �ٷ�����   ��װһ���ض����߼�����
	 * 		�����ͷ���֮���ǲ��еĹ�ϵ�������ڷ����ж��巽��
	 * ���﷨
	 * 	     ���δʣ�����ֵ���ͣ�������(������){
	 * 		//������
	 *   }
	 * �۷�����ʹ��
	 *   �вα��봫�Σ�������������һ��
	 *   
	 * ��return:
	 *   	���÷�Χ����������
	 *   	���ã�
	 *   		��return;��������
	 *   		��return ����;
	 *   			����ڷ����з���ֵ���͵ķ�����ʹ��return������Ҫ������
	 *   		ע�⣺return�ؼ��ֺ��治��������
	 * �ݷ���ֵ����  
	 *   ͨ�������û�з���ֵ����Ҫreturn�����ʹ��return�ͱ�ʾ��������
	 *   
	 * 	 static final abstract�����η�����
	 * 	 Java�е�4��Ȩ�����η���private public ȱʡprotected
	 * 
	 */

	public static void main(String[] args) {
		Method m = new Method();
		m.sayHi();
		String str = "World";
		int a = 100;
		m.sayHello(a);//�в������봫������������һ��
		int i = m.sum();//35
		int j = m.add(12, 20);//12+20
		System.out.println(i+" "+j);
	}
}
class Method{
	//�޲��޷���ֵ
	public void sayHi() {
		System.out.println("hi");
	}
	//�в��޷���ֵ
	public void sayHello(int msg) {//�β�
		if(msg>90) {
			return;
		}
		System.out.println("hello "+msg);
	}
	//�޲��з���ֵ
	public int sum() {//�β�
		System.out.println("sum()");
		return 12+23;
	}
	//�в��з���ֵ
	public int add(int a,int b) {//�β�
		System.out.println("add()");
		return a+b;
	}
}









