package leetcode;

import java.util.*;

/**
 * Created by YS
 * 2020/12/22 10:33
 */

public class No_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList();
        queue.offer(root);
        int i=1;
        while (!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=queue.size();
            for(int j=0;j<size;j++){
                TreeNode cur=queue.poll();
                if(cur.left!=null)
                    queue.offer(cur.left);
                if(cur.right!=null)
                    queue.offer(cur.right);
                list.add(cur.val);
            }
            if(i%2==0)
                Collections.reverse(list);
            i++;
            result.add(list);
        }
        return result;
    }
}
