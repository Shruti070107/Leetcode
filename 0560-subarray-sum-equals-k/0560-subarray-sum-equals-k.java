class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int c=0, sum=0,tar=0;

        for(int n:nums){
            sum+=n;
            tar=sum-k;

            if(map.containsKey(tar)){
                c+= map.get(tar);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
    return c;
    }
}