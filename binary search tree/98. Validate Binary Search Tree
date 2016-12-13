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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(null);
        return helper(root,list);
    }
    private boolean helper(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return true;
        }
        boolean left=helper(root.left,list);
        if(list.get(0)!=null){
            if(root.val<=list.get(0)){
                return false;
            }    
        }
        list.set(0,root.val);
        boolean right=helper(root.right,list);
        return left&&right;
        
    }
}

//Another choice
public boolean isValidBST(TreeNode root) {  
    return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);   
}  
boolean helper(TreeNode root, int min, int max)     
{    
    if(root == null)    
       return true;    
    if(root.val <= min || root.val >= max)  
         return false;    
     return helper(root.left, min, root.val) && helper(root.right, root.val, max);  
}    