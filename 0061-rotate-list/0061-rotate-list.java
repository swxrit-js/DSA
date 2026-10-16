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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0)
        {
            return head;
        }

        int count=1;
        ListNode temp = head;
        while(temp.next!=null)
        {
            count++;
            temp=temp.next;
        }
        ListNode tail=temp;
        tail.next=head;

        k=k%count;

        temp=head;
        for(int i=0;i<count-k-1;i++)
        {
           temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
    return head;
    }
}