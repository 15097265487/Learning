package cn.tedu.demo;


/**
 * һ���Ƚ���
 * 	1.������
 * 		java������������бȽϣ�������� ==��!=��equals()
 * 		���ʵ�����������Ĵ�С�Ƚ�
 * 	2.ʹ�ýӿڣ�Comparable Comparator	
 * 	 2.1)ʵ��Comparable�ӿ� ��Ȼ����
 * 		ʵ�ֽӿ�,
 * 		��д intCompareTo(obj),
 * 		������Ϊ�ȽϹ���:
 * 			�����ǰ�Ķ���this�����βζ���obj���򷵻�������
 *  		�����ǰ�Ķ���thisС���βζ���obj���򷵻ظ�����
 *   		�����ǰ�Ķ���this�����βζ���obj���򷵻��㡣
 * 	 2.2)java.util.Comparator ��������
 * 		����:����ʵ����Comprable�ӿڵĹ����������ʱ
 * 			��String�������޸ĵ�ǰ�ıȽϵķ���
 *  		��Goods���������޸ĵ�ǰ�ıȽϵķ���
 *   		��ô�Ϳ���ʹ��Comparator�Ķ���������
 *    	�ȽϹ���
 *    		����������������������ʾo1����o2��
 *    		�������0����ʾ��ȣ�
 *    		���ظ���������ʾo1С��o2��	
 *    	Arrays.sort(arr,new Comparator(){...��д...});
 *      int Double.compare(d1,d2);
 * 	����������
 * 		System Math BigInteger BigDecimal
 * 	�ġ�	ö����enum
 * 		1.ö�����ʹ�ã�
 * 			1)��⣺��Ķ���ֻ�����޸���ȷ���ġ����ǳƴ���Ϊö����
 *  		2)����Ҫ����һ�鳣��ʱ������ʹ��ö����
 *  		3)���ö������ֻ��һ�������������Ϊ����ģʽ��ʵ�ַ�ʽ
 *		2.��ζ���ö����
 *			1)jdk5ǰ���Զ���ö����  
 *  		2)jdk5��ʹ�ùؼ���enum	
 *  			2.1) values() 
 *  				��������ö������󹹳ɵ�����
 *  			2.2) ofValue("xx") 
 *  				(IllegalArgumentException)
 *  				����ö�����ж�������obj�Ķ��� 
 *  				Season v = Season.valueOf("WINTER");
 *  			2.3) toString()
 *  				Season.class.getSuperclass()--->Enum
 *  				Enum.class.getSuperclass()-->Object
 *  				����ö�ٶ�����
 *  			
 *  			
 */
public class Review {

}
