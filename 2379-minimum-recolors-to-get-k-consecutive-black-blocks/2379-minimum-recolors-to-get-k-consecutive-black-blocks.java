class Solution {
    public int minimumRecolors(String blocks, int k) {
        int c=0;
        for(int i=0;i<k;i++){
            char ch = blocks.charAt(i);
            if(ch=='W'){
                c++;
            }
        }
        int minOp=c;
        for(int i=k;i<blocks.length();i++){
            char ch=blocks.charAt(i);
            char chRem=blocks.charAt(i-k);
            if(ch=='W'){
                c++;
            }
            if(chRem=='W'){
                c--;
            }
            minOp=Math.min(minOp,c);
        }
    return minOp;
    }
}