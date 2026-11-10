class Solution {
    public int climbStairs(int n, int[] costs) {
        int step3=0,step2=0,step1=0;

        for(int j=1;j<=n;j++){
            int cost=Integer.MAX_VALUE;

            if(j>= 1){
                cost=Math.min(cost,step1+ costs[j-1] +1);
            }
            if(j >=2){
                cost=Math.min(cost,step2+ costs[j-1] +4);
            }
            if(j >=3){
                cost=Math.min(cost,step3+ costs[j-1] +9);
            }

            step3=step2;
            step2=step1;
            step1=cost;
        }
    return step1;
    }
}
