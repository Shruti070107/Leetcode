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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c = 0;
        ListNode temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        int k = c - n;
        if( k == 0) {    // only one node
            return head.next ; 
        }
        ListNode curr = head;
        while(k>1){
            curr=curr.next;
            k--;
        }
        curr.next = curr.next.next;
        
        return head;
    }
}
