/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
    if(head==null){
        return head;
    }
    ListNode pre=new ListNode(-1);
    ListNode root=pre;
    ListNode cur=head;
    root.next=head;
    int length=0;
    while(cur!=null){
        ++length;
        cur=cur.next;
    }
    k=k%length;
    cur=head;
    for(int index=0;index<=length-k-2;++index){
        cur=cur.next;
    }
    while(cur!=null&&cur.next!=null){
        ListNode temp=cur.next.next;
        cur.next.next=pre.next;
        pre.next=cur.next;
        cur.next=temp;
        pre=pre.next;
    }
    return root.next;
    }
}