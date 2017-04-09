/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    if(root==null) return "#!";
        String res=root.val+"!";
        res=res+serialize(root.left);
        res=res+serialize(root.right);
        return res;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] value=data.split("!");
        LinkedList<String> queue=new LinkedList<>();
        for(String temp:value){
            queue.add(temp);
        }    
        return convert(queue);
    }
    public TreeNode convert(LinkedList<String> queue){
        String m=queue.poll();
        if(m.equals("#")){
            return null;
        }
        TreeNode res=new TreeNode(Integer.valueOf(m));
        res.left=convert(queue);
        res.right=convert(queue);
        return res;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));