import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import static java.lang.Math.pow;

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void nthprimedigitsnumber(long n)
    {
        // Finding the length of n-th number
        long len = 1;
 
        // Count of numbers with len-1 digits
        long prev_count = 0;
        while (true) {
            // Count of numbers with i digits
            long curr_count = (long)(prev_count + pow(4, len));
 
            // if i is the length of such number
            // then n<4*(4^(i-1)-1)/3 and n>= 4*(4 ^ i-1)/3
            // if a valid i is found break the loop
            if (prev_count < n && curr_count >= n)
                break;
 
            // check for i + 1
            len++;
 
            prev_count = curr_count;
        }
 
        // Till now we have covered 'prev_count' numbers
 
        // Finding ith digit at ith place
        for (int i = 1; i <= len; i++) {
            // j = 1 means 2 j = 2 means ...j = 4 means 7
            for (long j = 1; j <= 4; j++) {
                // if prev_count + 4 ^ (len-i) is less
                // than n, increase prev_count by 4^(x-i)
                if (prev_count + pow(4, len - i) < n)
                    prev_count += pow(4, len - i);
 
                // else print the ith digit and break
                else {
                    if (j == 1)
                        System.out.print("2");
                    else if (j == 2)
                        System.out.print("3");
                    else if (j == 3)
                        System.out.print("5");
                    else if (j == 4)
                        System.out.print("7");
                    break;
                }
            }
        }
        System.out.println();
    }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner (System.in);
                      int T = sc.nextInt();
                      for(int t=0;t<T;t++){
                          int N = sc.nextInt();
                          nthprimedigitsnumber(N);
                      }
    }
}
