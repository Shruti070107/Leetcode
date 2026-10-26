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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode prevSt= head;
        int size= 2;
        while(prevSt != null && prevSt.next != null) {
            ListNode curr = prevSt.next;
            int c=0;

            while(c<size && curr != null){
                curr= curr.next;
                c++;
            }

        if(c %2 ==0){
            ListNode grpSt = prevSt.next;
            ListNode prev= null;
            ListNode temp = grpSt;
            for(int i =0;i<c; i++){
                ListNode fir = temp.next;
                temp.next= prev;
                prev= temp;
                temp= fir;
            }
            grpSt.next = temp;
            prevSt.next = prev;
            prevSt = grpSt;
        }

        else{
            for(int i =0;i< c;i++){
                prevSt= prevSt.next;
            }
        }
        size++;
    }
    return head;
    }
}