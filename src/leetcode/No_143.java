package leetcode;
/*
    Created by YS
    2020/10/20 16:24
*/

import java.util.ArrayList;
import java.util.List;

public class No_143 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public void reorderList(ListNode head) {
        List<ListNode> list=new ArrayList<>();

        while (head!=null){
            list.add(head);
            head=head.next;
        }
        int i=0,j=list.size()-1;
        while (i<j){
            list.get(i).next=list.get(j);
            i++;
            if(i==j){
                break;
            }
            list.get(j).next=list.get(i);
            j--;

        }
        list.get(i).next=null;
    }
}
