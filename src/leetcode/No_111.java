package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by YS
 * 2020/12/21 21:49
 */

public class No_111 {
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
         TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int depth=1;
        while (!queue.isEmpty()){
            int adj=queue.size();
            for(int i=0;i<adj;i++){
                TreeNode treeNode=queue.poll();
                if(treeNode.left==null&&treeNode.right==null)
                    return depth;
                if(treeNode.left!=null)
                    queue.offer(treeNode.left);
                if(treeNode.right!=null)
                    queue.offer(treeNode.right);
            }
            depth++;
        }
        return depth;
    }

}
