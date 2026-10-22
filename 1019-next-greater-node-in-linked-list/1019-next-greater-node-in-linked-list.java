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
    public int[] nextLargerNodes(ListNode head) {
        int n = 0;
        ListNode curr= head;
        while(curr != null){
            curr = curr.next;
            n++;
        }
        int ans[] = new int[n];
        curr= head;
        for(int i =0;i<n;i++){
            ans[i]= curr.val;
            curr= curr.next;
        }
        Stack <Integer> st = new Stack<>();
        for(int i = n-1;i>=0;i--){
            int val = ans[i];
            while(!st.isEmpty() && st.peek() <= val){
                st.pop();
            }
        if(st.isEmpty()){
            ans[i]= 0;
        }
        else{
            ans[i]= st.peek();
        }
        st.push(val);
    }
    return ans;
    }
}
//we can use arraylist for storing values too