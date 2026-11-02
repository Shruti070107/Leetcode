class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid =nums[nums.length /2];
        int moves =0;
        for(int num :nums) {
            moves+= Math.abs(num -mid);
        }
    return moves;
    }
}
/*
public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int l=0,r=nums.length -1;
        int moves=0;
        while(l<r){
            moves +=(nums[r] -nums[l]);
            l++;
            r--;
        }
    return moves;
    }
}
*/