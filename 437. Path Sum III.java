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
    public int pathSum(TreeNode root, int sum) {
        if(root==null) return 0;
        return helper(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
//        return map.get(sum);
    }
    private int helper(TreeNode root,int current){
    if(root==null) return 0;     
    int res=0;
    if(current==root.val) res++;
    res+=helper(root.left,current-root.val)+helper(root.right,current-root.val);
    return res;
    
    }
}