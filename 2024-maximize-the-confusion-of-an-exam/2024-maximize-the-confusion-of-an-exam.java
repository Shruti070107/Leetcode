class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        int ans=0,l=0,t=0,f=0;
        
        for(int r=0;r<s.length();r++){
            if(s.charAt(r)== 'T') {
                t++;
            }
            else {
                f++;
            }
            
            while(t>k && f>k){
                if(s.charAt(l)=='T') {
                    t--;
                }
                else {
                    f--;
                }
                l++;
            }
            
            ans=Math.max(ans,r-l+1);
        }     
    return ans;
    }
}
