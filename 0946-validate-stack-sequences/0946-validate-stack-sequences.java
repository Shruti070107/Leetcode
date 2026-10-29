// T.C - O(n)  &&  S.C. - O(1)
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int top =-1;
        int j =0;

        for(int x :pushed) {
            pushed[++top] = x;

            while(top >=0 && pushed[top] == popped[j]) {
                top--;
                j++;
            }
        }
    return top == -1;
    }
}

// T.C - O(n)  &&  S.C. - O(n)
/*
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st =new Stack<>();
        int j =0;

        for(int x :pushed) {
            st.push(x);

            while(!st.isEmpty() && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }
    return st.isEmpty();
    }
}
*/