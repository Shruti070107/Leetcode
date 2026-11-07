class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sat=0,max=0,extra=0; 

        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                sat+=customers[i];
            }
            else{
                extra+=customers[i];
            }

            if(i>=minutes){
                if(grumpy[i-minutes] ==1){
                    extra-= customers[i-minutes];
                }
            }   
            max=Math.max(max,extra);
        }

    return sat+ max;
    }
}
