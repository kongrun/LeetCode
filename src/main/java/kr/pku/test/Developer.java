package kr.pku.test;
/**
 * Created by Administrator on 2017/7/31.
 */
public class Developer {

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr0 = {1,72,3,41};
        String[] arr1 = {"a","b","c","d","e"};
        String[] arr2 = {"1","2","3"};
        froTest(arr);
        merge(arr1, arr2);
//        printFabonaci();
        order(arr0);
    }

    public static void merge(String[] arr1,String[] arr2)
    {
        String[] tem = new String[20];
        int i =0,j=0;int k=0;
        while(i<arr1.length &&j<arr2.length)
        {
            tem[k] = arr1[i];
            i++;
            k++;
            tem[k] = arr2[j];
            j++;
            k++;
        }
        if(arr1.length > arr2.length)
        {
            for(int m = arr2.length;m< arr1.length;m++)
            {
                tem[arr2.length +m] = arr1[m];
            }

        }else if(arr1.length < arr2.length)
        {
            for(int m = arr1.length;m< arr2.length;m++)
                tem[arr1.length +m] = arr2[m];
        }
    }
    public static int froTest(int[] numArr)
    {
        if(null == numArr) return 0;
        int num = 0;
        for(int i = 0;i<numArr.length;i++)
            num += numArr[i];
        System.out.println("总和为：" + num);

        int j = 0;
        num = 0;
        while(j < numArr.length)
        {
            num +=  numArr[j];
            j++;
        }
        System.out.println("总和为：" + num);
        return num;
    }


    public static void printFabonaci()
    {
        long first = 0;
        long second = 1;
        long third;
        System.out.print(first + " " + second);
        for(int tem = 3;tem < 101;tem++)
        {
            third = first + second;
            System.out.print(" " + third);
            first = second;
            second = third;
        }
    }

    public static long order(int[] arr)
    {
        if(arr == null) return 0;
        String numStr = "";
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length -i-1;j++)
            {
//                System.err.print(j + " ");
                if(compare(arr[j],arr[j+1]))
                {
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
            numStr += arr[arr.length-i-1];
        }
        System.out.println("最大数：" + numStr);
        return Long.parseLong(numStr);
    }
    public static boolean compare(int first,int second)
    {
        first = Integer.parseInt((""+first).substring(0,1));
        second = Integer.parseInt(("" + second).substring(0, 1));
        if(first >= second) return true;
        else return false;
    }

    public static int compute(String str)
    {
        if(str == null || str == "") return 0;
        int length = str.length();

        return 0;
    }











}
