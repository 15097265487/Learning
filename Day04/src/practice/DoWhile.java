package practice;

public class DoWhile {
	/*
	 * 
	 * do {
        //代码语句
        }while(布尔表达式);
        
                       布尔表达式在循环体的后面，所以语句块在检测布尔表达式之前已经执行了。 如果布尔表达式的值为 true，则语句块一直执行，直到布尔表达式的值为 false
	 */

	public static void main(String[] args) {
		int i = 10;
		do {
			System.out.println(i);
			i++;
			System.out.println();
		} while (i<20);
	}
}
