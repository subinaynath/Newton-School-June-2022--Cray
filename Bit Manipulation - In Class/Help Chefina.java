import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void isKthBitSet(long n, long k)
    {
        if ((n & (1 << (k - 1))) != 0)
        {
            System.out.println("SET");
        }
        else
        {
            System.out.println("NOT SET");
        }
    }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
        long t;
        t = sc.nextLong();
        while ((t--) != 0)
        {
            long n;
            long k;
            n = sc.nextLong();
            k = sc.nextLong();
            isKthBitSet(n, k);
        }
    }
}
