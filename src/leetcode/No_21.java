package leetcode;

/**
 * Created by YS
 * 2020/12/8 23:23
 */

public class No_21 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode q=new ListNode(-1);
        ListNode p=q;
        while (l1!=null&&l2!=null){
            if(l1.val<l2.val){
                p.next=l1;
                l1=l1.next;
            }else {
                p.next=l2;
                l2=l2.next;
            }
            p=p.next;
        }
        p.next=l1==null? l2:l1;
        return q.next;
    }
}
