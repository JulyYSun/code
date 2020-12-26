package leetcode;

/**
 * Created by YS
 * 2020/12/22 21:12
 */

public class No_700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
            return  null;
        else if(root.val==val)
            return root;
        else if(root.val<val)
            return searchBST(root.right,val);
        else
            return searchBST(root.left,val);

    }
}
