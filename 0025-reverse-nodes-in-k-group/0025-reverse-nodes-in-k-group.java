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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        while(prev != null){
        int c =k;
        ListNode check = prev;
        while(check.next != null && c>0){
            check= check.next;
            c--;
        }
        if(c>0){
            break;
        }

        ListNode ptr= prev;
        ListNode temp = prev.next;
        ListNode curr = prev.next.next;
        prev= prev.next;
        int size= k-1;

        while(curr != null && size>0) {
            ListNode rev= curr.next;
            curr.next = prev;
            prev= curr;
            curr= rev;
            size--;
        }
        ptr.next = prev;
        temp.next= curr;
        prev= temp;
    }
    return dummy.next;   
    }
}