/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
       ListNode lessHead=new ListNode(-1);
       ListNode highHead=new ListNode(-1);


       ListNode lessTail=lessHead;
       ListNode highTail=highHead;

       ListNode temp=head;
       while(temp!=null)
       {
        if(temp.val<x)
        {
            ListNode asd=temp;
            temp=temp.next;
            asd.next=null;
            lessTail.next=asd;
            lessTail=asd;
        }
        else
        {
            ListNode asd=temp;
            temp=temp.next;
            asd.next=null;
            highTail.next=asd;
            highTail=asd;
        }
       } 
       lessTail.next=highHead.next;
       highTail.next=null;
       return lessHead.next;
    }
}