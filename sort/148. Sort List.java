/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
    if(head==null||head.next==null){
        return head;
    }
    ListNode slow=head,fast=head,temp=null;
    while(fast!=null&&fast.next!=null){
        temp=slow;
        slow=slow.next;
        fast=fast.next.next;
    }
  
    temp.next=null;
    ListNode left=sortList(head);
    ListNode right=sortList(slow);
    return mergeTwoLists(left,right);
        
    }
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     if(l1==null&&l2==null){
        return null;
    }    
    if(l1==null&&l2!=null){
        return l2;
    }
    if(l1!=null&&l2==null){
        return l1;
    }
    ListNode root=new ListNode(0);
    ListNode temp=root;
    while(l1!=null&&l2!=null){
        if(l1.val<l2.val){
            temp.next=l1;
            temp=temp.next;
            l1=l1.next;
        }    
        else{
            temp.next=l2;
            temp=temp.next;
            l2=l2.next;
        }
    }
    if(l1!=null){
        temp.next=l1;
    }
    if(l2!=null){
        temp.next=l2;
    }
    return root.next;
    }
}