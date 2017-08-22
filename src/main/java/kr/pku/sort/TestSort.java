package kr.pku.sort;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/8/14.
 */
public class TestSort {
    public static void main(String[] args)
    {
        int[] arr = {4,1,6,9,3,5};
        //直接插入排序

        InsertSort.sort(arr);
        System.out.println(Arrays.toString(arr));

        MergeSort.sort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
