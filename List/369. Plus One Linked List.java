//Two pointers 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode plusOne(ListNode head) {
    if(head==null){
        return null;
    }   
    ListNode root=new ListNode(0);
    ListNode i=root;
    ListNode j=root;
    root.next=head;
    while(j.next!=null){
        j=j.next;
        if(j.val!=9){
            i=j;
        }    
    }
    if(j.val!=9){
        ++j.val;
        return root.next;
    }
    else{
        ++i.val;
        while(i.next!=null){
            i=i.next;
            i.val=0;
        }
    }
    if(root.val==1){
        return root;
    }
    return head;
    }
 
}

//recursive approach
public ListNode plusOne(ListNode head) {
    if (head == null)
        return new ListNode(1);
    ListNode plused = plusOne(head.next);
    if (plused != head.next)
        head.val++;
    if (head.val <= 9)
        return head;
    head.val = 0;
    plused.next = head;
    return plused;
}