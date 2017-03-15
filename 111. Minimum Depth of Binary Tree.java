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
    public int minDepth(TreeNode root) {
    if(root==null) return 0;
    Queue<TreeNode> queue=new LinkedList<>();
    queue.offer(root);
    int level=1;
    //int cur=1,nextcur=0;
    while(!queue.isEmpty()){
        int size=queue.size();
        for(int i=0;i<size;++i){
            TreeNode temp=queue.poll();    
            if(temp.left==null&&temp.right==null) return level;
            if(temp.left!=null) {
                queue.offer(temp.left);
            }    
            if(temp.right!=null) {
                queue.offer(temp.right);
            }
        } 
        level++;
    }
    return level;
    }
}

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
    public int minDepth(TreeNode root) {
    if(root==null) return 0;
    if(root.left==null) return minDepth(root.right)+1;
    if(root.right==null) return minDepth(root.left)+1;
    return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }
}