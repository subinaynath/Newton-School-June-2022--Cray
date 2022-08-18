import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int gcd(int a,int b){
		int dividend = a, divisor = b;

		while(dividend % divisor > 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		return divisor;
	}
    
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int n = sc.nextInt();
                      int m = sc.nextInt();
                      System.out.println(gcd(n,m));
    }
}
