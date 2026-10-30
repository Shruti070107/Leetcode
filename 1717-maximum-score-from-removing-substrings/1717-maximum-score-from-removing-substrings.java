class Solution {
    public int maximumGain(String s, int x, int y) {
        int score=0;

        if(x>= y){
            score += removePair(s,'a','b',x);
            s= removeRem(s,'a','b');
            score +=removePair(s,'b','a',y);
        }
        else{
            score += removePair(s,'b','a',y);
            s= removeRem(s,'b','a');
            score +=removePair(s,'a','b',x);

        }
    return score;   
    }
    private int removePair(String s, char fir,char sec,int points){
        Stack <Character> st= new Stack<>();
        int score=0;
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && st.peek()==fir && ch== sec){
                st.pop();
                score+=points;
            }
            else{
                st.push(ch);
            }
        }
    return score;
    }

    private String removeRem(String s, char fir,char sec){
        Stack <Character> st= new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && st.peek()== fir && ch== sec){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
    StringBuilder res= new StringBuilder();
    for(char ch: st){
        res.append(ch);
    }
    return res.toString();
    }
}