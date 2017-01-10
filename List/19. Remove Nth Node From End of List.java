/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head==null){
        return head;
    }
    ListNode run=head;
    int count=1;
    while(run.next!=null){
        run=run.next;
        ++count;
    }
    ListNode root=new ListNode(0);
    root.next=head;
    run=root;
    int cur=0;
    while(cur<=count-n-1){
        run=run.next;
        ++cur;
    }
    run.next=run.next.next;    
    return root.next;
    }
}

//Best solution
public ListNode removeNthFromEnd(ListNode head, int n) {
    
    ListNode start = new ListNode(0);
    ListNode slow = start, fast = start;
    slow.next = head;
    
    //Move fast in front so that the gap between slow and fast becomes n
    for(int i=1; i<=n+1; i++)   {
        fast = fast.next;
    }
    //Move fast to the end, maintaining the gap
    while(fast != null) {
        slow = slow.next;
        fast = fast.next;
    }
    //Skip the desired node
    slow.next = slow.next.next;
    return start.next;
}