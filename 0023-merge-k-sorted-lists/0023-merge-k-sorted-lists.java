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

//  TC - O(nlogk)  Sc- O(logk)
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length==0){
            return null;
        }
    return mergeSort(lists,0, lists.length-1);
}   


private ListNode mergeSort(ListNode lists[], int l,int r){
    if(l==r){
        return lists[l];
    }
    int mid = l+ (r-l) /2;
    ListNode l1= mergeSort(lists, l, mid);
    ListNode l2 = mergeSort(lists,mid+1 , r);
    return merge(l1,l2);
}

private ListNode merge(ListNode head1, ListNode head2){
    ListNode dummy= new ListNode(-1);
    ListNode temp= dummy;
    while(head1 != null && head2 != null){
        if(head1.val <= head2.val){
            temp.next= head1;
            head1= head1.next;
        }
        else{
            temp.next= head2;
            head2= head2.next;
        }
        temp= temp.next;
    }
        if(head1 != null){
            temp.next = head1;
        }
        if(head2 != null){
            temp.next = head2;
        }
    return dummy.next;
    }
}



/*
 // T.C. - O(nk)  SC - O(1)    n is no. of nodes and k is no.of lists
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        ListNode head= lists[0];
        for(int i =1 ;i< lists.length ;i++){
            head= merge(head,lists[i]);
        }
    return head;  
    }
    ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy= new ListNode(-1);
        ListNode temp= dummy;
        while(head1 != null && head2 != null) {
            if(head1.val <= head2.val){
                temp.next= head1;
                head1= head1.next;
            }
            else{
                temp.next= head2;
                head2= head2.next;
            }
            temp= temp.next;
        }
        if(head1 != null){
            temp.next= head1;
        }
        if(head2 != null){
            temp.next= head2;
        }
    return dummy.next;
    }
} */