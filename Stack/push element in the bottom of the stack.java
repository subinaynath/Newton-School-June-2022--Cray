import java.util.Stack;

class Main {
    public static void putInThe1st(Stack<Integer> st,int k){
        if(st.empty()) {
            st.push(k);
            return;
        }
        int x=st.pop();
        putInThe1st(st,k);
        st.push(x);
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
        putInThe1st(st,k);
        System.out.println(st);

    }
}
