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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<>();
        helper(root,sum,res,temp);
        return res;
    }
    private void helper(TreeNode root,int sum,List<List<Integer>> res,List<Integer> temp){
        if(root==null){
          //  temp.remove(temp.size()-1);
            return;
        }
        temp.add(root.val);
        sum-=root.val;
        
        
        if(sum==0&&root.left==null&&root.right==null){
            res.add(temp);
            //temp.remove(temp.size()-1);
            return;
        }
        helper(root.left,sum,res,new ArrayList<Integer>(temp));
        helper(root.right,sum,res,new ArrayList<Integer>(temp));
    }
}