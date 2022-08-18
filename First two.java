static int firstTwo(int N){
//Enter your code here
ArrayList<Integer> st = new ArrayList<Integer>();
while (N/10 >0){
    int a = N%10;
    N = N/10;
    st.add(0,a);
}
st.add(0,N);
//System.out.print(st);
int res[] = new int[2];
res[0]= st.get(1);
res[1] =st.get(0);
return(res[0]*10)+res[1];
}
