import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int N = sc.nextInt();

                      int sumArr =0;
                      int sumNn = 0;
                      
                      int naturalNumber[] = new int[N];
                      for (int i=1;i<=naturalNumber.length;i++){
                          
                          sumNn = sumNn + i;
                      }
                      int arr[] = new int[N-1];
                      for (int i=0;i<arr.length;i++){
                          arr[i] = sc.nextInt();
                          sumArr +=arr[i];
                      }
                      int element = sumNn - sumArr;
                      System.out.println(sumNn - sumArr);
                      
                      

    }
}
