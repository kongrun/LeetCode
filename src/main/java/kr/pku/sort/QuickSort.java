package kr.pku.sort;

/**
 * Created by Administrator on 2017/8/14.
 */
public class QuickSort {
    public static void sort(int[] arr,int start,int end)
    {
        if(arr == null || arr.length == 0) return;
        if(start >= end) return;
        int part = partition(arr,start,end);
        sort(arr,start,part - 1);
        sort(arr,part+1,end);
    }
    public static int partition(int[] arr,int start,int end)
    {
        while(start < end)
        {
            while(start < end && arr[end] > arr[start]) end --;
            int tem = arr[start];arr[start] = arr[end];arr[end] = tem;
            while(start < end && arr[start] <= arr[end]) start ++;
            tem = arr[start];arr[start] = arr[end];arr[end] = tem;
        }
        return start;
    }
}
