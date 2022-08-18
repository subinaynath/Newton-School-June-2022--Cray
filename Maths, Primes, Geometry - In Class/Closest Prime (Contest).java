import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>1){
			for (int i = 0; i < n; i++) {
            int test = n - i;
            if (isPrime(test)) {
                System.out.print(test);
                break;
            }
            test = n + i;
            if (isPrime(test)) {
                System.out.print(test);
                break;
            }
        }
		}else System.out.print(2);
    }
}
