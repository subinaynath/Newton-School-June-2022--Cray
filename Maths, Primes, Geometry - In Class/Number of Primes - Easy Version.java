import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static boolean isPrime(int n){
        for (int i=2; i*i<=n;i++){
            if (n%i==0)return false;
        }return true;
    }

    public static void countPrime(int n){
        int count=0;
        for (int i=2; i<=n; i++){
            if (isPrime(i)) count++;
        }System.out.println(count);
    }

    public static void main (String[] args) {
                      // Your code here
                      Scanner sc= new Scanner(System.in);
                      int T = sc.nextInt();
                        for ( int i=0;i<T;i++){
                            int N = sc.nextInt();
                            countPrime(N);
                      
                        }
    }
}
