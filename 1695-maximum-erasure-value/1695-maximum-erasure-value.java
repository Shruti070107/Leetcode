class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int l=0,maxL=0, sum=0;
        
        for(int r=0;r<nums.length;r++){
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                sum -=nums[l];
                l++;
            }
            
            set.add(nums[r]);
            sum+=nums[r];
            maxL=Math.max(maxL,sum);
        } 
    return maxL;
    }
}