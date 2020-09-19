package cn.tedu;

public class Review {

	public static void main(String[] args) {
		/*
		 * 顺序结构：从上往下逐行执行
		 * 分支结构：有条件的执行某语句一次
		 * 循环结构：有条件的执行某语句块一次或多次
		 * 
		 * 分支结构格式：
		 * 1）if(条件表达式){...}
		 * 2）if(条件表达式){
		 *   }else{
		 *       //代码块
		 *   }
		 *    
		 *3）if(条件表达式){
		 *        //代码块
		 *	}else if(条件表达式){
		 *         //代码块
		 *	}else if(条件表达式){
		 *         //代码块
		 *	}else{
		 *         //代码块
		 *  }
		 *  
		 *  switch(表达式){byte short int char 枚举  String
		 *  case value1:
		 *  case value2:
		 *  		break;
		 *  default:
		 *  }
		    当表达式与value值匹配时执行switch结构
		   直到遇到break或直行至switch末尾时，switch...case执行结束
		 break：跳出switch..case结构
		 *  
		   凡是可以使用switch结构的都可以转换成if-else结构，反之、不成立
		 */
		byte b =(byte)128;
		System.out.println(b);
	}

}
