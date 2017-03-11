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
    int max=0;
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root==null) return new int[0];
        HashMap<Integer,Integer> map=new HashMap<>();
        helper(root,map);
        Queue<Integer> list=new LinkedList<Integer>();
        for(int temp:map.keySet()){
            if(map.get(temp)==max) list.offer(temp);    
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;++i){
            res[i]=list.poll();
        }
        return res;
    }
    private int helper(TreeNode root,HashMap<Integer,Integer> map){
        if(root==null) return 0;
        int left=helper(root.left,map);
        int right=helper(root.right,map);
        int sum=left+right+root.val;
        map.put(sum,map.getOrDefault(sum,0)+1);
        max=max<map.get(sum)?map.get(sum):max;
        return sum;
    }
}