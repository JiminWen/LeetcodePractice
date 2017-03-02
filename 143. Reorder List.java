/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
    if(head==null||head.next==null) return;
    ListNode slow=head,fast=head.next;
    while(fast.next!=null&&fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    ListNode cur=slow.next;
    slow.next=null;
    ListNode pre=null,next=null;
    while(cur!=null){
        next=cur.next;
        cur.next=pre;
        pre=cur;
        cur=next;
    }
    
   // ListNode temp=head;
    cur=head; 
    while(cur.next!=null){
        ListNode temp=cur.next;
        cur.next=pre;
        cur=cur.next;
        pre=pre.next;
        cur.next=temp;
        cur=cur.next;
    }
    if(pre!=null){
        cur.next=pre;
    }
    
    }
}