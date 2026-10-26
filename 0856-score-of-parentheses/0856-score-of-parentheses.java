class Solution {    //  TC - O(n)  SC - O(1)
    public int scoreOfParentheses(String s) {
        int dep=0, score=0;
        Stack <Integer> st= new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                dep++;
            }
            else{
                dep--;
                if(s.charAt(i-1) == '('){
                    score += Math.pow(2, dep);
                }
            }
        }
    return score;
    }
}

/*
 // TC - O(n)  SC - O(n)
        int c =0;
        Stack <Integer> st= new Stack<>();
        
        for(int i =0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch =='('){
                st.push(c);
                c=0;
            }
            else{
                c=st.pop() + Math.max(1, 2*c);
            }
        }
    return c;   
    }
}
*/