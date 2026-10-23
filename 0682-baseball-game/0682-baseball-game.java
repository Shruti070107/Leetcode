class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st = new Stack<>();

        for(String op:operations){
            if(op.equals("+")) {
                int b = st.pop();
                int a = st.peek();
                st.push(b);
                st.push(a+b);
            }
            else if(op.equals("C")) {
                st.pop();
            }
            else if(op.equals("D")) {
                st.push(2 * st.peek());
            }
            else{
            st.push(Integer.parseInt(op));
            }
        }
        
        int tot = 0;
        for(int score :st) {
            tot+= score;
        }
    return tot;
    }
}