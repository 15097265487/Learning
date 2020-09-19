package cn.tedu;

public class TriangleDemo {

	public static void main(String[] args) {
		/*int[][] arr=new int[10][10];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0 || j==i) {
					arr[i][j]=1;
				}else {
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j-1];
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/
		int[][] array = new int[10][];
		for(int i=0;i<array.length;i++) {
			array[i]=new int[i+1];
			//第一个最后一个元素都是1
			array[i][0]=array[i][i]=1;
			//第三行开始：每行非首末元素赋值
			if(i>1) {
			for(int j=1;j<array[i].length-1;j++) {
				array[i][j] = array[i-1][j] + array[i-1][j-1];
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
