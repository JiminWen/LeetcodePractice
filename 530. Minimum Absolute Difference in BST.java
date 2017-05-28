/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    int res=Integer.MAX_VALUE;
    Integer pre=null;
    public int getMinimumDifference(TreeNode root) {
    helper(root);
    return res;
    }
    public void helper(TreeNode root){
    if(root==null) return;
    helper(root.left);
    if(pre!=null) res=Math.min(res,root.val-pre);
    pre=root.val;
    helper(root.right);
    }
}