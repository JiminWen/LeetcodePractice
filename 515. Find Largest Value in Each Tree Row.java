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
    public List<Integer> largestValues(TreeNode root) {
    List<Integer> res=new ArrayList<>();
    if(root==null) return res;
    Queue<TreeNode> queue=new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
        int size=queue.size();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;++i){
            TreeNode temp=queue.poll();
            max=Math.max(max,temp.val);
            if(temp.left!=null) queue.offer(temp.left);
            if(temp.right!=null) queue.offer(temp.right);
            
        }
        res.add(max);
    }
    return res;
    }
}