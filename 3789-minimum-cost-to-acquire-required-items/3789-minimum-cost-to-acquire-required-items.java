class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long c1 =Math.min(cost1,costBoth);
        long c2 =Math.min(cost2,costBoth);
        long cb =Math.min(costBoth, (long)cost1+cost2);
        long m =Math.min(need1,need2);
        return m*cb + (need1-m)*c1 + (need2-m)*c2;
    }
}
