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
    int res=0;
    public int longestConsecutive(TreeNode root) {
    helper(root,Integer.MIN_VALUE,0);
    return res;
    }
    private void helper(TreeNode root, int pre ,int cur){
    if(root==null) return;
    if(root.val==pre+1) cur++;
    else cur=1;
    res=Math.max(res,cur);
    helper(root.left,root.val,cur);
    helper(root.right,root.val,cur);   
    
    }
}