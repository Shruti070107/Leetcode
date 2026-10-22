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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int c =0;
        ListNode dummy = new ListNode(0);
        dummy .next = head;
        ListNode prev = dummy;

        if (head == null || left == right) 
            return head;
        
       for(int i = 1; i< left; i++){ 
           prev = prev .next;
       }
       ListNode curr = prev.next.next;
       ListNode temp=prev.next;  
       ListNode ptr=prev;
       prev=prev.next;

       for(int i = 0; i< right- left; i++) {
        ListNode rev = curr.next;
        curr.next = prev;
        prev = curr;
        curr= rev;
       }
       ptr.next=prev;
       temp.next=curr;
       
    return dummy.next;
    }
}