/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
    if(head==null||head.next==null) return head;
    ListNode temp=new ListNode(0);
    ListNode cur=temp;
    temp.next=head;
    while(cur.next!=null&&cur.next.next!=null){
        ListNode first=cur.next;
        ListNode second=cur.next.next;
        first.next=second.next;
        second.next=first;
        cur.next=second;
        cur=first;
    }
    return temp.next;
    }
}