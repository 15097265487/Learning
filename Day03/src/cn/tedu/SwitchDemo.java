package cn.tedu;

public class SwitchDemo {

	public static void main(String[] args) {
		/*分支结构switch--case
		 * 1)格式：
		 * switch(表达式key){
		 * case value1：
		 * 		     语句块；
		 * case value2：
		 * case value3：
		 * ...
		 * defalut:
		 * 		语句块；
		 * }
		 *2）根据switch表达式key的值，依次匹配各个case后的value
		 *     一旦匹配成功后，则进入相应的case结构中调用其执行语句
		 *     当调用完执行语句后，则任然向下执行直到遇到break，或者switch结构结束，才会执行结束
		 *3）switch结构中的表达式只能是如下类型：
		 *		byte  short   char   int  枚举     String
		 *4)key value的类型要一致（或可进行自动转换）
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
		break;//跳出结构，执行结束
		default:
			System.out.println("default");
			
		}
		
	}

}
