package cn.tedu;

public class Test {

	public static void main(String[] args) {
		/*
		 * 在一个数组中查找一个数字，（下面查找22）
		 */
		int dest=22;
		boolean isFlag=true;
		int[] arr= new int[] {10,25,47,86,56,41,89,11,25,23};//最后一次找到
		//查找数字的第一种方法
		for(int i=0;i<arr.length;i++) {
			if(dest==arr[i]) {
				System.out.println(i);
				isFlag=false;
				break;
			}
		}
		if(isFlag){//i==arr.lenght;i=9
			System.out.println("未找到");
		}
		//查找数字的第二种方法
		int i=0;
		for(;i<arr.length;i++) {
			if(dest==arr[i]) {
				System.out.println(i);
				break;
			}
		}
		System.out.println();
		if(i==arr.length){//i==arr.lenght;i=9
			System.out.println("未找到");
		}

	}

}
