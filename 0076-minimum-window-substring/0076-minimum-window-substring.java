class Solution {
    public String minWindow(String s, String t) {
        int n =s.length();
        int m =t.length();
        
        if(n<m){
            return "";
        }
        int[] hash=new int[256];
        for(int i=0;i<m;i++){
            hash[t.charAt(i)]++;
        }

        int l=0,r=0;
        int minLen=Integer.MAX_VALUE;
        int sInd= -1,cnt=0;

        while(r<n){
            char rChar=s.charAt(r);
            if(hash[rChar] >0){
                cnt++;
            }
            hash[rChar]--;

            while(cnt==m){
                if(r-l+1 <minLen){
                    minLen=r-l+1;
                    sInd=l;
                }

                char lChar=s.charAt(l);
                hash[lChar]++;
                if(hash[lChar] >0){
                    cnt--;
                }
                l++;
            }
            r++;
        }
    return sInd== -1 ? "" :s.substring(sInd,sInd+minLen);
    }
}
