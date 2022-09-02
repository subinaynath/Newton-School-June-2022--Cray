import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   /* public static int countSum(int arr[], int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        int j=0;
    }*/
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int n = sc.nextInt();
                      long arr[] = new long[n];
                      for(int i=0;i<arr.length;i++){
                          arr[i] = sc.nextLong();
                      }
                       long odd = 0;
                        long even = 0;
                        long  result = 0;
                        for (long i : arr) {
                        if (i % 2 == 0) {
                            even++;
                        } else {
                            long temp = even;
                            even = odd;
                            odd = temp + 1;
                        }
                        result += odd;
                        }
                        System.out.println(result);
    }
}
