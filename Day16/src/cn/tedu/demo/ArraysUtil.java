package cn.tedu.demo;
/**
 * 自定义数组的工具类
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
    public static int getMax(int[] arr) {
        int max = arr[0];//假设数组第一个值为最大值
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
    /**数组的反转*/
    public static void reverse(int[] arr) {
        for(int i=1;i<arr.length/2;i++) {
            swap(arr,i,arr.length-1-i);
        }
    }
    public static void reverse(String[] arr) {
        for(int i=1;i<arr.length/2;i++) {
        }
    }
    /**对数组进行冒泡排序*/
    public static void sort(int[] arr) {//升序
        for(int i=1;i<arr.length;i++) {
            for(int j=0;j<arr.length-i;j++) {
                if(arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
    }
    /**位置的交换*/
    private static void swap(int[] arr, int m, int n) {
        int temp=arr[m];
        arr[m]=arr[n];
        arr[n]=temp;
    }
    /**遍历数组*/
    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    /**求数组中元素的和*/
    public static int sum(int[] s) {
        int sum=0;
        for(int i=0;i<s.length;i++) {
            sum=sum+s[i];
        }
        return sum;
    }
    /**求数组的平均值*/
    public static int mean(int[] n) {
        int mea=0;
        for(int i=0;i<n.length;i++) {
            mea = (mea+n[i])/n.length;
        }
        return mea;
    }
    /**复制数组*/

    /**主方法*/
    public static void main(String[] args) {
        int[] arr = new int[]{12,25,41,36,95,45,21,23};
        int max = ArraysUtil.getMax(arr);
        System.out.println(max);
        ArraysUtil.sort(arr);
        ArraysUtil.print(arr);

        System.out.println("------------------");
        ArraysUtil.print(arr);
        System.out.println("------------------");



    }

}

