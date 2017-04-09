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
    public List<List<Integer>> verticalOrder(TreeNode root) {
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    if(root==null) return res;
    
    HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
    LinkedList<TreeNode> queue=new LinkedList<>();
    LinkedList<Integer> col=new LinkedList<>();
    queue.offer(root);
    col.offer(0);
    int max=0,min=0;
    while(!queue.isEmpty()){
    TreeNode temp=queue.poll();
    int collum=col.poll();
    if(!map.containsKey(collum)){
        map.put(collum,new ArrayList<Integer>());
    }
    map.get(collum).add(temp.val);
    if(temp.left!=null){
        queue.offer(temp.left);
        col.offer(collum-1);
        min=Math.min(min,collum-1);
    }
    if(temp.right!=null){
        queue.offer(temp.right);
        col.offer(collum+1);
        max=Math.max(max,collum+1);
    }  
    
    }
    for(int i=min;i<=max;i++){
        if(map.containsKey(i)){
            res.add(map.get(i));
        }
    }
    return res;
    }
}