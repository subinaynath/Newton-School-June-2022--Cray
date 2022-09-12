import java.util.Stack;

class Main {
    //for push the elemnet in the last of the Stack
    public static void pushAtTheBottoom(Stack<Integer> st,int k){
        if(st.isEmpty()){
            st.push(k);
            return;
        }
        int top=st.pop();
        pushAtTheBottoom(st,k);
        st.push(top);

    }
    //for reverse the stack by pushing element last in the stack
    public static void reverseTheStack(Stack<Integer> st){
        if(st.isEmpty()) return;
        int x =st.pop();
        reverseTheStack(st);
        pushAtTheBottoom(st,x);
    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int k=0;
        System.out.println(st);
        reverseTheStack(st);
        System.out.println(st);

    }
}
