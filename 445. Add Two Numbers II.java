/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    while(l1!=null){
        s1.push(l1.val);
        l1=l1.next;
    }
    while(l2!=null){
        s2.push(l2.val);
        l2=l2.next;
    }
    int carry=0;
    ListNode temp=new ListNode(0);
    while(!s1.isEmpty()||!s2.isEmpty()){
        int first=s1.isEmpty()?0:s1.pop();
        int second=s2.isEmpty()?0:s2.pop();
        int sum=carry+first+second;
        carry=sum/10;
        temp.val=sum%10;
        ListNode next=new ListNode(carry);
        next.next=temp;
        temp=next;
    }
    return temp.val==0?temp.next:temp;
    }
}