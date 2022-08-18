import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int [N];
        for (int i=0; i<N; i++){
            arr[i] =sc.nextInt();
        }
        for (int i=0; i<N; i++){
            sum +=arr[i]*arr[i];
        }
        double mean = (double)sum/N;
        double sq_root=Math.sqrt(mean);
        System.out.printf("%.6f" ,sq_root);
    }
}
