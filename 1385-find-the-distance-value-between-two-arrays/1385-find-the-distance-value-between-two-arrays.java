class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int dist=0;
        
        for(int x:arr1){
            int idx=Arrays.binarySearch(arr2,x-d);           
            if(idx<0){
                idx= -(idx + 1);
            }
            
            if(idx<arr2.length && arr2[idx]<= x+d){
                continue;
            }
            dist++;
        } 
    return dist;
    }
}
