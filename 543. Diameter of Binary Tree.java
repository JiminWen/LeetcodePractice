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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        int res=maxdepth(root);
        return max;
    }
    public int maxdepth(TreeNode node){
        if(node==null) return 0;
        int left=maxdepth(node.left);
        int right=maxdepth(node.right);
        max=Math.max(max,left+right);
        return Math.max(left,right)+1;
    }
}