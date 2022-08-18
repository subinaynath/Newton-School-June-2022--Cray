import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static long maxSubArraySum(long a[])
    {
        int size = a.length;
        long max_so_far = Long.MIN_VALUE, max_ending_here = 0;
  
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int T =sc.nextInt();
                      for(int t=0;t<T;t++){
                          int n = sc.nextInt();
                          long arr[] = new long[n];
                          for(int i=0;i<n;i++){
                              arr[i] = sc.nextLong();
                          }
                          long res= maxSubArraySum(arr);
                          System.out.println(res);
                      }

    }
}
