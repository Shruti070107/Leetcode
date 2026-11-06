class Solution {
    public int longestSubarray(int[] nums) {
        int left=0,c =0,maxL=0;

        for(int right=0;right<nums.length;right++){
           if(nums[right]==0){
            c++;
           }

           while(c>1){
            if(nums[left]==0){
                c--;
            }
            left++;
           }
           
            maxL=Math.max(maxL,right-left);
        }
    return maxL;
    }
}