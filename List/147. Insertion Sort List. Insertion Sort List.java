/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
    if(head==null){
        return null;
    }    
    ListNode root=new ListNode(0);
    ListNode cur=head;
    ListNode pre=root;
  //  root.next=head;
    while(cur!=null){
        pre=root;
        while(pre.next!=null&&pre.next.val<cur.val){
            pre=pre.next;
        }
        ListNode next=cur.next;
        cur.next=pre.next;
        pre.next=cur;
        cur=next;
    }
    return root.next;
    }
}