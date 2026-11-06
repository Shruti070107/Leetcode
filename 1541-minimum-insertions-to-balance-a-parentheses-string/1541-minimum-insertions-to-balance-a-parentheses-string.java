class Solution {
    public int minInsertions(String s) {
        int need=0,insert=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                need+=2;
                if(need%2==1){
                    need--;
                    insert++;
                }
            }
                else{
                    need--;
                    if(need<0){
                        insert++;
                        need=1;
                    }
                }
            }
        return insert+need;
    }
}