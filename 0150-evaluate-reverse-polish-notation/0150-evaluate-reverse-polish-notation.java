class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st = new Stack<>();
        for(String t:tokens) {
            if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){
                int a = st.pop();
                int b = st.pop();
                int result= 0;
                if(t.equals("+")){
                    result = b+a; 
                }
                else if(t.equals("-")){
                    result = b-a;
                }
                else if(t.equals("*")){
                    result=b*a;
                }
                else if(t.equals("/")){
                    result = b/a;
                }
                st.push(result);
            }
            else{
                st.push(Integer.parseInt(t));
            }
        }
    return st.pop();
    }
}