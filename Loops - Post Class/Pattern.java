static void Pattern(int N){
//Enter your code here
System.out.println("*");
for (int i=3; i<=N; i++){
    for (int j=1; j<=i; j++){
        if (j ==1 || j ==i){
            System.out.print("*");
        }
        else {
            System.out.print("^");
        }
    }
    System.out.println();
}
for (int k=0; k<=N; k++){
    System.out.print("*");
}
System.out.println();
}
