class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        //TC - O(n) & SC - O(1)
        int rem= nums.length - k;
        int top= -1;

        for(int num : nums) {
            while(top >=0 && rem >0 && nums[top]> num){
                top--;
                rem--;
            }
            nums[++top] = num;
        }
        int ans[] = new int[k];
        for(int i =0;i<k;i++){
            ans[i]= nums[i];
        }
    return ans;
    }
}


/*
        //TC - O(n) & SC - O(n)
        Stack <Integer> st = new Stack<>();
        int rem= nums.length - k;
        for(int num : nums) {
            while(!st.isEmpty() && rem >0 && st.peek()> num){
                st.pop();
                rem--;
            }
            st.push(num);
        }
        int ans[] = new int[k];
        for(int i =0;i<k;i++){
            ans[i]=st.get(i);
        }
    return ans;
    }
}
*/