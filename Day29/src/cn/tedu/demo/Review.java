package cn.tedu.demo;


/**
 * 一、比较器
 * 	1.背景：
 * 		java中两个对象进行比较，正常情况 ==、!=、equals()
 * 		如何实现两个对象间的大小比较
 * 	2.使用接口：Comparable Comparator	
 * 	 2.1)实现Comparable接口 自然排序
 * 		实现接口,
 * 		重写 intCompareTo(obj),
 * 		方法体为比较规则:
 * 			如果当前的对象this大于形参对象obj，则返回正整数
 *  		如果当前的对象this小于形参对象obj，则返回负整数
 *   		如果当前的对象this等于形参对象obj，则返回零。
 * 	 2.2)java.util.Comparator 定制排序
 * 		背景:当类实现了Comprable接口的规则进行排序时
 * 			如String，不能修改当前的比较的方法
 *  		如Goods，不方便修改当前的比较的方法
 *   		那么就考虑使用Comparator的对象来排序
 *    	比较规则：
 *    		如果方法返回正整数，则表示o1大于o2；
 *    		如果返回0，表示相等；
 *    		返回负整数，表示o1小于o2。	
 *    	Arrays.sort(arr,new Comparator(){...重写...});
 *      int Double.compare(d1,d2);
 * 	三、其他类
 * 		System Math BigInteger BigDecimal
 * 	四、	枚举类enum
 * 		1.枚举类的使用：
 * 			1)理解：类的对象只有有限个，确定的。我们称此类为枚举类
 *  		2)当需要定义一组常量时，建议使用枚举类
 *  		3)如果枚举类中只有一个对象，则可以作为单例模式的实现方式
 *		2.如何定义枚举类
 *			1)jdk5前，自定义枚举类  
 *  		2)jdk5后，使用关键字enum	
 *  			2.1) values() 
 *  				返回所有枚举类对象构成的数组
 *  			2.2) ofValue("xx") 
 *  				(IllegalArgumentException)
 *  				返回枚举类中对象名是obj的对象 
 *  				Season v = Season.valueOf("WINTER");
 *  			2.3) toString()
 *  				Season.class.getSuperclass()--->Enum
 *  				Enum.class.getSuperclass()-->Object
 *  				返回枚举对象名
 *  			
 *  			
 */
public class Review {

}
