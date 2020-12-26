package nowcoder;

import java.util.ArrayList;

/**
 * Created by YS
 * 2020/12/17 15:34
 */

public class JZ3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        while (listNode!=null){
            arrayList.add(0,listNode.val);
            listNode=listNode.next;
        }
        return arrayList;
    }

     public class ListNode {
         int val;
         ListNode next = null;

         ListNode(int val) {
             this.val = val;
         }
     }



}
