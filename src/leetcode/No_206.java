package leetcode;
/*
    Created by YS
    2020/10/6 17:43
*/

public class No_206 {
    public ListNode reverseList(ListNode head) {
        ListNode cur=head;
        ListNode prev=null;

        //依次将cur指向prev，然后将两个指针往后移动一个元素
        while (cur!=null){
           ListNode tmp=cur.next;
           cur.next=prev;
           prev=cur;
           cur=tmp;
        }

        return prev;
    }

    private class ListNode {
        ListNode next;
        int val;
        ListNode(int x){val=x;}
    }
}
