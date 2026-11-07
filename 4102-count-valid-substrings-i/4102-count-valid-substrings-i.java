class Solution {
    public long countValidSubstrings(String s) {
        long n=s.length();
        long tot=n*(n+1)/2;
        int ind=-1;
        long inval=0;
         for(int i=2;i<s.length();i++){
             if(s.charAt(i-2)=='a' && s.charAt(i-1)=='b' && s.charAt(i)=='c'){
                 ind=i-2;
             }
             if(ind!=-1){
                inval+= ind+1;
             }
         }
    
        return tot-inval;
    }
}