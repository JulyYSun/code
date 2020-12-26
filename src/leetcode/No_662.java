package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by YS
 * 2020/12/22 13:21
 */

public class No_662 {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int width=0;
        while (!queue.isEmpty()){
            int sz=queue.size();
            if(sz>width)
                width=sz;
            for(int i=0;i<sz;i++){
                TreeNode cur=queue.poll();
                if(cur.left!=null)
                    queue.offer(cur.left);
                if(cur.right!=null)
                    queue.offer(cur.right);
            }
        }
        return width;
    }
}
