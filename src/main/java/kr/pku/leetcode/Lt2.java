package kr.pku.leetcode;


/**
 * Created by Administrator on 2017/7/31.
 */
public class Lt2 {
    public static void main(String[] args)
    {
        ListNode l1 = new ListNode(5);
//        l1.next = new ListNode(4);
        ListNode tem = new ListNode(3);
//        tem.next = null;
//        l1.next.next = tem;
        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        tem = new ListNode(4);
//        tem.next = null;
//        l2.next.next = tem;
//        l2.next.next.next = tem;

        tem = addTwoNumbers(l1,l2);
        while(tem != null)
        {
            System.out.print(tem.val);
            tem = tem.next;
        }
        System.out.println("");
    }
    public static ListNode addTwoNumbers(ListNode l1,ListNode l2)
    {
        if(l1 == null || l2 == null)
            throw new IllegalArgumentException("no two num solution");
        ListNode l3 = null ,tem = null;
        int flag = 0;int val1 = 0;int val2 = 0;
        while(l1 != null || l2 != null)
        {
            val1 = val2 = 0;
            if(l1 != null) {val1 = l1.val;l1 = l1.next;}
            if(l2 != null) {val2 = l2.val;l2 = l2.next;}
            int sum = flag + val1 + val2;
            int val = sum % 10;
            flag = sum / 10;
            ListNode lt = new ListNode(val);
            lt.next = null;
            if(tem == null)
            {
                tem = lt;tem.next = null;
            }
            else tem.next = lt;
            tem = lt;
            if(l3 == null) l3 = tem;
        }
        if(flag > 0)
        {
            tem.next = new ListNode(flag);
        }
        return l3;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){this.val = x;}
}
