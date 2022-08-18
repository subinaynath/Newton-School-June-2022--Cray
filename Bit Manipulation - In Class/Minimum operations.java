import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int minimumOneBitOperations(int n)
    {
        return minimumOneBitOperations(n, 0);
    }

    public static int minimumOneBitOperations(int n, int res)
    {
        if (n == 0)
        {
            return res;
        }

        int b = 1;
        while ((b << 1) <= n)
        {
            b = b << 1;
        }
        return minimumOneBitOperations((b >> 1) ^ b ^ n, res + b);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();

        System.out.print(minimumOneBitOperations(N));

    }
}
