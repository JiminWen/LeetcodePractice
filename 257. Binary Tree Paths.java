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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        String temp=new String();
        helper(root,res,temp);
        return res;
        
    }
    private void helper(TreeNode root,List<String> res,String temp){
        if(root==null){
            return;
        }
        if(temp.length()==0){
            temp+=root.val;
        }
        else{
        temp=temp+"->"+root.val;
        }
        if(root.left==null&&root.right==null){
            res.add(temp);
        }
        helper(root.left,res,temp);
        helper(root.right,res,temp);
        
    }
}