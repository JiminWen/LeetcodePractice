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
    public int findBottomLeftValue(TreeNode root) {
    Queue<TreeNode> queue=new LinkedList<>();
    queue.offer(root);
    int last=0;
    while(!queue.isEmpty()){
        int size=queue.size();
        last=queue.peek().val;
        for(int i=0;i<size;++i){
            TreeNode temp=queue.poll();
            if(temp.left!=null) queue.offer(temp.left);
            if(temp.right!=null) queue.offer(temp.right);
        }
    }
    return last;
    }
}