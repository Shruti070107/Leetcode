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
 // TC O(N)   SC O(1)
class Solution {
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.next.val < curr.val){
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
    return reverse(head);
    }

    ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr= head;
        while(curr != null){
            ListNode temp= curr.next;
            curr.next = prev;
            prev= curr;
            curr= temp;
        }
    return prev;
    }
}



//Tc o(n)   Sc o(n)

    /*  Stack <Integer> st = new Stack<>();
        int n =0, ind=0;
        ListNode curr = head;
        while(curr != null){
            n++;
            curr= curr.next;
        }

        int arr[] = new int[n];
        curr = head;
        while(curr !=null){
            arr[ind++] = curr.val;
            curr = curr.next;
        }

        for(int i= n-1;i>=0;i--) {
            if(st.isEmpty() || st.peek()<= arr[i]) {
                st.push(arr[i]);
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(!st.isEmpty()){
            temp.next = new ListNode(st.pop());
            temp = temp.next;
        }
    return dummy.next;
    }
}
*/