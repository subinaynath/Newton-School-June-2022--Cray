import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long get(long ed, long cnt){
                        long d = cnt;
                        if (d > ed) 
                            d = ed;
                        cnt -= d;
                        return cnt + d * (2 * ed - d + 1) / 2;
}
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                            long n, p, k; 
                            n = sc.nextLong();
                            p = sc.nextLong();
                            k = sc.nextLong();
                            long l = 1l, r = 10000000000l;
                    
                            while(l + 1 < r){
                                long m = (l + r) / 2;
                                if ( get(m, k) + get(m, n - k + 1) - m > p) r = m;
                                else l = m;
                            }
                        System.out.println((long)l);
                    
                        
    }
}
