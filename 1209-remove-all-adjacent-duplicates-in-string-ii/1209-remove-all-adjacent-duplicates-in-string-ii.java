class Solution {
    public String removeDuplicates(String s, int k) {
        Stack <Character> st= new Stack<>();
        Stack <Integer> c = new Stack<>();
        for(char ch: s.toCharArray()) {
            if(!st.isEmpty() && st.peek() == ch){
                c.push(c.peek() +1);
            }
            else{
                c.push(1);
            }
            st.push(ch);
            if(c.peek() ==k){
                for(int i=0;i<k;i++){
                    st.pop();
                    c.pop();
                }
            }
        }
        StringBuilder ans= new StringBuilder();
        for(char ch:st){
            ans.append(ch);
        }
    return ans.toString();
    }
}