package cn.tedu.exer;

public class EcmDef {
	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		//.String---->int
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = ecm(a,b);
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("�������Ͳ�һ��");
		} catch (EcDef e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ȱ�������в���");
		} catch (ArithmeticException e) {
			System.out.println("��0�ˣ�����");
		}
		System.out.println("over");	
		//System.out.println(a +" "+b);
	}
	public static int ecm(int a,int b) throws EcDef {//�쳣����
		if(a<0 || b<0) {
			throw new EcDef("���ӻ��ĸ����Ϊ����");
		}
		return a/b;
	}

}
