class Solution {
    public static void insertAtBottom(int val,Stack<Integer>st){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int top=st.pop();
        insertAtBottom(val,st);
        st.push(top);
    }
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()){
            return;
        }
        int val=st.pop();
        reverseStack(st);
        insertAtBottom(val,st);
    }
}
