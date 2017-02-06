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
    public boolean isBalanced(TreeNode root) {
    return depth(root)!=-1;    
    }
    private int depth(TreeNode root){
    if(root==null){
        return 0;
    }
    int leftDepth = depth(root.left);
		if(leftDepth == -1){
			return -1;
		}
		int rightDepth = depth(root.right);
		if(rightDepth == -1){
			return -1;
		}
		if(Math.abs(leftDepth-rightDepth)>1){
			return -1;
		}else{
			return 1+Math.max(leftDepth,rightDepth);
		}
    }
}