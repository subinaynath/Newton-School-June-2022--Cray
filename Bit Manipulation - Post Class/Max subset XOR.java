import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static final int INT_BITS = 32;
    public static int maxSubarrayXOR(int set[], int n)
        {	int index = 0;
            for (int i = INT_BITS - 1; i >= 0; i--)
            {	int maxInd = index;
            int maxEle = Integer.MIN_VALUE;
            for (int j = index; j < n; j++) {
                if ((set[j] & (1 << i)) != 0 && set[j] > maxEle)
                {
                maxEle = set[j];
                maxInd = j;
                }
            }
            if (maxEle == -2147483648)
                continue;
            int temp = set[index];
            set[index] = set[maxInd];
            set[maxInd] = temp;
            maxInd = index;
            for (int j = 0; j < n; j++) {
                if (j != maxInd && (set[j] & (1 << i)) != 0)
                set[j] = set[j] ^ set[maxInd];
            }
            index++;
            }
            int res = 0;
            for (int i = 0; i < n; i++)
            res ^= set[i];
            return res;
        }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int N = sc.nextInt();
                      int arr[] = new int[N];
                      int max=0;
                      for(int i =0;i<arr.length;i++){
                          arr[i]=sc.nextInt();
                      }
                      System.out.print(maxSubarrayXOR(arr,N));
    }
}
