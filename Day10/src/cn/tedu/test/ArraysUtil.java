package cn.tedu.test;
/**
 * �Զ�������Ĺ�����
 * @author UID-ECD
 *
 */
public class ArraysUtil {
	/**���������Сֵ*/
	public int getMin(int[] arr) {
		int min = arr[0];//���������һ��ֵΪ���ֵ
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	/**����������ֵ*/
	public int getMax(int[] arr) {
		int max = arr[0];//���������һ��ֵΪ���ֵ
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	/**����ķ�ת*/
	public void reverse(int[] arr) {
		for(int i=1;i<arr.length/2;i++) {
			swap(arr,i,arr.length-1-i);
		}
	}
	public void reverse(String[] arr) {
		for(int i=1;i<arr.length/2;i++) {
		}
	}
	/**���������ð������*/
	public void sort(int[] arr) {//����
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}
	/**λ�õĽ���*/
	public void swap(int[] arr,int m,int n) {
		int temp=arr[m];
		arr[m]=arr[n];
		arr[n]=temp;
   }
	/**��������*/
	public void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	/**��������Ԫ�صĺ�*/
	public int sum(int[] s) {
		int sum=0;
		for(int i=0;i<s.length;i++) {
			sum=sum+s[i];
		}
		return sum;
	}
	/**�������ƽ��ֵ*/
	public int mean(int[] n) {
		int mea=0;
		for(int i=0;i<n.length;i++) {
			mea = (mea+n[i])/n.length;
		}
		return mea;
	}
	/**��������*/
	

}

