class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack <Integer> st = new Stack<>();
        int ng[] = new int[10001];
        Arrays.fill(ng,-1);
        for(int num: nums2) {
            while(!st.isEmpty() && st.peek() < num) {
                ng[st.pop()]=num;
            }
            st.push(num);
        }
        
        int ans[] = new int[nums1.length];
        for(int i =0;i< nums1.length;i++){
            ans[i]= ng[nums1[i]];
        }
    return ans;    
    }
}