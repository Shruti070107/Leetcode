class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums==null || nums.length<3){
            return false;
        }
        Stack <Integer> st=new Stack<>();
        int two=Integer.MIN_VALUE;
        
        for(int i=nums.length-1; i>=0;i--){
            if(nums[i]<two){
                return true;
            }
            
            while(!st.isEmpty() && st.peek()<nums[i]){
                two=st.pop();
            }
            st.push(nums[i]);
        }
    return false;
    }
}