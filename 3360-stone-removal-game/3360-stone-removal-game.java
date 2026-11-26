class Solution {
    public boolean canAliceWin(int n) {
        int k = 10;
        boolean t = true;
        while(n >= k){
            n = n - k;
            k--;
            t = !t;
        }
        return !t;
    }
}
