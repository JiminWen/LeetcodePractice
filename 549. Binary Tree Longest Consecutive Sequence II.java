public class Solution {
    int res=0;
    public int longestConsecutive(TreeNode root) {
        helper(root);
        return res;
    }
    private int[] helper(TreeNode root){
        if(root==null){
            return new int[] {0,0};//{in,de}
        }
        int in=1,de=1;
        if(root.left!=null){
            int[] l=helper(root.left);
            if(root.val==root.left.val-1){
                in=l[0]+1;
            }
            else if(root.val==root.left.val+1){
                de=l[1]+1;
            }
        }
        if(root.right!=null){
            int[] r=helper(root.right);
            if(root.val==root.right.val-1){
                in=Math.max(r[0]+1,in);
            }
            else if(root.val==root.right.val+1){
                de=Math.max(r[1]+1,de);
            }
        }
        res=Math.max(res,in+de-1);
        return new int[] {in,de};
    }
}