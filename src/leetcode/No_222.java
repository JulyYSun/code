package leetcode;

/**
 * Created by YS
 * 2020/11/24 16:44
 */
public class No_222 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
   }
    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;
        int left=countNodes(root.left);
        int right=countNodes(root.right);
        return left+right+1;
    }
}
