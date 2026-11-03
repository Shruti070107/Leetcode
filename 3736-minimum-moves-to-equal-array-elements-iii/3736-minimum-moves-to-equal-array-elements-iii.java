class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        long sum=0;

        for(int x :nums){
            if(x >max){
                max=x;
            }
            sum+=x;
        }
        long t =(long)max *nums.length;
        return (int)(t -sum);
    }
}
