package cn.tedu;

public class SwitchDemo {

	public static void main(String[] args) {
		/*��֧�ṹswitch--case
		 * 1)��ʽ��
		 * switch(���ʽkey){
		 * case value1��
		 * 		     ���飻
		 * case value2��
		 * case value3��
		 * ...
		 * defalut:
		 * 		���飻
		 * }
		 *2������switch���ʽkey��ֵ������ƥ�����case���value
		 *     һ��ƥ��ɹ����������Ӧ��case�ṹ�е�����ִ�����
		 *     ��������ִ����������Ȼ����ִ��ֱ������break������switch�ṹ�������Ż�ִ�н���
		 *3��switch�ṹ�еı��ʽֻ�����������ͣ�
		 *		byte  short   char   int  ö��     String
		 *4)key value������Ҫһ�£���ɽ����Զ�ת����
		 */
		int i = 12;
		switch (i) {
		case 1:
			System.out.println(1);
		case 2:
			System.out.println(2);
		case 12:
			System.out.println("12");
			
		case 'a'://97
			System.out.println("100");
		break;//�����ṹ��ִ�н���
		default:
			System.out.println("default");
			
		}
		
	}

}
