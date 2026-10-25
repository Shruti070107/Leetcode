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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null) {
            slow = slow.next;
            fast= fast.next.next;
        }
        ListNode prev= null;
        ListNode curr = slow;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev= curr;
            curr= temp;
        }

        ListNode fir= head;
        ListNode sec= prev;
        int sum=0, max=0;
        while(sec != null){
            sum= fir.val+ sec.val;
            max= Math.max(max, sum);
            fir= fir.next;
            sec= sec.next;
        }
    return max;  
    }
}