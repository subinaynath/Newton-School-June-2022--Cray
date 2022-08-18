static int MagicNumber(int N){
//Enter your code here
    int magNo = 0;

    for(int i=0;i<=1000;i++){
        if(checkIfContain7And9(N-i)){
            magNo = N-i;
            break;
        }
        if(checkIfContain7And9(N+i)){
            magNo = N+i;
            break;
        }
        
    }
    return magNo;
}

static boolean checkIfContain7And9(int n){
    boolean ifSeven = false;
    boolean ifNine = false;

    while(n>0){
        int rem = n%10;

        if(rem == 7)
            ifSeven = true;
        if(rem == 9)
            ifNine = true;

        n = n/10;
    }
    return (ifSeven && ifNine);
}
