class Solution {
    public int maxLength(int[] nums) {
        int maxLen = Math.min(2, nums.length);
        int left = 0;
        int prod = 1;

        for (int right = 0; right < nums.length; right++) {
            while (gcd(prod, nums[right]) > 1) {
                prod /= nums[left];
                left++;
            }
            prod *= nums[right];
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    private int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
