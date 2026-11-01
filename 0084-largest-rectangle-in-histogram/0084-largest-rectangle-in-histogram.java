class Solution {
    public int largestRectangleArea(int[] heights) {
        int n =heights.length;
        int l[]=new int[n];
        int r[]=new int[n];
        Stack <Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }
        r[i]= st.empty()? n:st.peek();
        st.push(i);
        }

        while(!st.isEmpty()){
            st.pop();
        }
        
        
        for(int i=0; i<=n-1;i++){
            while(st.size()>0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }
        l[i]= st.empty()?-1:st.peek();
        st.push(i);
        }
   
    int ans=0;
    for(int i =0;i<n;i++){
        int width= r[i]- l[i]-1;
        int currArea= heights[i] * width;
        ans= Math.max(ans,currArea);
    }
    return ans;
    }
}