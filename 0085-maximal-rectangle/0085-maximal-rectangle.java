class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix ==null|| matrix.length ==0 || matrix[0].length ==0) {
            return 0;
        }

        int rows =matrix.length;
        int cols =matrix[0].length;
        int heights[]= new int[cols];
        int area =0;

        for(int i = 0;i <rows;i++){
            for(int j =0;j <cols;j++){
                if(matrix[i][j] == '1'){
                    heights[j] +=1;
                } else{
                    heights[j] =0;
                }
            }
            area =Math.max(area, largestRectangleArea(heights));
        }
    return area;
    }

    private int largestRectangleArea(int[] heights) {
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
    
