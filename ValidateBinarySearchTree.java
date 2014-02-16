/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean isValidLeft = true;
        boolean isValidRight = true;
        if (root.left != null) {
            if (root.left.val < root.val){
                isValidLeft = isValidBST(root.left);
                if (isValidLeft == false) {
                    return false;
                }
            } else
            return false;
        }        
        if (root.right != null) {
            if (root.right.val > root.val){
                isValidRight = isValidBST(root.right);
                if (isValidRight == false) {
                    return false;
                }
            } else
            return false;
        }
        return true;
        
    }
}
