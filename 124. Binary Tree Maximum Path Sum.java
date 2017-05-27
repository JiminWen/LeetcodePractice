public class Solution {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    private int helper(TreeNode root){
        if(root==null) return 0;//left sum, right sum
        int lsm=root.val,rsm=root.val;
        if(root.left!=null){
            int l=helper(root.left);
            lsm+=Math.max(0,l);
        }
        if(root.right!=null){
            int r=helper(root.right);
            rsm+=Math.max(0,r);
        }
        max=Math.max(max,lsm+rsm-root.val);
        return Math.max(lsm,rsm);
    }
}