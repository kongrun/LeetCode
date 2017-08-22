package kr.pku.testNet;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/22.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i< n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        if( arr == null || arr.length == 0 || arr.length == 1)
            System.out.print("yes");
        int l1 = isUpdate(arr,0);
        int l2 = isDown(arr,l1);
        int l3 = isUpdate(arr,l2);
        if(l1 == arr.length) {System.out.print("yes");return;}
        if(l2 == arr.length && arr[l2-1] > arr[l1-1]) {System.out.print("yes");return;}
        if(l3 == arr.length && arr[l2-1] > arr[l1-1] && arr[l2] > arr[l1]) {System.out.print("yes");return;}
        else {System.out.print("no");return;}
    }
    public static int isUpdate(int[] num ,int l)
    {
        for(int i = l;i< num.length - 1;i++)
        {
            if(num[i] > num[i+1]) return i+1;
        }
        return num.length ;
    }
    public static int isDown(int[] num ,int l)
    {
        for(int i = l;i< num.length - 1;i++)
        {
            if(num[i] < num[i+1]) return i+1;
        }
        return num.length ;
    }
}
