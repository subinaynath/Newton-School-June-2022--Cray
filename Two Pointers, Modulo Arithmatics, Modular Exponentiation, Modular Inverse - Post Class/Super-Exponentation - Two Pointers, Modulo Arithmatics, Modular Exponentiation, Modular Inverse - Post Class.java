import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long toThePower(long a, long b,long d) {
		
		if(b == 0) return 1;
		
		long powerHalf = (toThePower(a, b/2,d)) %d;
        long res =(powerHalf*powerHalf)%d;
		
		if(b % 2 == 1) // odd
			return (res*a)%d;
		else return res;
	}
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int T = sc.nextInt();
                      for(int t=0;t<T;t++){
                          long a =sc.nextLong();
                          long b =sc.nextLong();
                          long c =sc.nextLong();
                          long d =1000000007;
                          long powerbc =toThePower(b,c,d-1);
                          long powerabc =toThePower(a,powerbc,d);
                          System.out.println(powerabc);
                      }
    }
}
