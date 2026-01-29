class Solution {
    public static void insert(int val,Stack<Integer>st){
        if(st.isEmpty() || st.peek()<=val){
            st.push(val);
            return;
        }
        int top=st.pop();
        insert(val,st);
        st.push(top);
    }
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()){
            return;
        }
        int t=st.pop();
        sortStack(st);
        insert(t,st);
    }
}