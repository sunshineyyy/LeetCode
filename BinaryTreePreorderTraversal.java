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
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> nodeList = new ArrayList<Integer>();
        while (root != null) {
            nodeList.add(root.val);
            nodeList = addTwoArrayList(nodeList, preorderTraversal(root.left));
            nodeList = addTwoArrayList(nodeList, preorderTraversal(root.right));
            return nodeList;
        }
        return nodeList;
    }
    public ArrayList<Integer> addTwoArrayList(ArrayList<Integer> nodeListOne, ArrayList<Integer> nodeListTwo) {
        for (int i = 0; i < nodeListTwo.size(); i ++) {
            nodeListOne.add(nodeListTwo.get(i));
        }
        return nodeListOne;
    }
}
