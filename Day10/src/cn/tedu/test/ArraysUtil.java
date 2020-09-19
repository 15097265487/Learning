package cn.tedu.test;
/**
 * 自定义数组的工具类
 * @author UID-ECD
 *
 */
public class ArraysUtil {
	/**求数组的最小值*/
	public int getMin(int[] arr) {
		int min = arr[0];//假设数组第一个值为最大值
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	/**求数组的最大值*/
	public int getMax(int[] arr) {
		int max = arr[0];//假设数组第一个值为最大值
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	/**数组的反转*/
	public void reverse(int[] arr) {
		for(int i=1;i<arr.length/2;i++) {
			swap(arr,i,arr.length-1-i);
		}
	}
	public void reverse(String[] arr) {
		for(int i=1;i<arr.length/2;i++) {
		}
	}
	/**对数组进行冒泡排序*/
	public void sort(int[] arr) {//升序
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}
	/**位置的交换*/
	public void swap(int[] arr,int m,int n) {
		int temp=arr[m];
		arr[m]=arr[n];
		arr[n]=temp;
   }
	/**遍历数组*/
	public void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	/**求数组中元素的和*/
	public int sum(int[] s) {
		int sum=0;
		for(int i=0;i<s.length;i++) {
			sum=sum+s[i];
		}
		return sum;
	}
	/**求数组的平均值*/
	public int mean(int[] n) {
		int mea=0;
		for(int i=0;i<n.length;i++) {
			mea = (mea+n[i])/n.length;
		}
		return mea;
	}
	/**复制数组*/
	

}

