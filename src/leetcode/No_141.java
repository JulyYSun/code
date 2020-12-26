package leetcode;

/**
 * Created by YS
 * 2020/12/21 23:18
 */




public class No_141 {

    public boolean hasCycle(ListNode head) {
        ListNode fast,slow;
        fast=slow=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
}
