/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
    if(lists==null||lists.length==0){
        return null;
    }    
    PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->(a.val-b.val));
    for(ListNode i:lists){
        if(i!=null){
        pq.add(i);  
        }
    }
    ListNode root=new ListNode(0);
    ListNode cur=root;
    while(!pq.isEmpty()){
        cur.next=pq.poll();
        cur=cur.next;
        if(cur.next!=null){
        pq.add(cur.next);  
        }
    }
    return root.next;
    }
}