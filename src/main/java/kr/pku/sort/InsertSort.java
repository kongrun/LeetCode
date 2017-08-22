package kr.pku.sort;

/**
 * 基本思想：在要排序的一组数中，假设前面(n-1) [n>=2] 个数已经是排
 * 好顺序的，现在要把第n个数插到前面的有序数中，使得这n个数
 * 也是排好顺序的。如此反复循环，直到全部排好顺序。
 */
public class InsertSort {

    public static void sort(int[] arr)
    {
        for(int i = 1;i<arr.length;i++)
        {
            int tem = arr[i];
            int j = i - 1;
            while(j >= 0)
            {
                if(arr[j] <= tem )break;
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = tem;
        }
    }
}
