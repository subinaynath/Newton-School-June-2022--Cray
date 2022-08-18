import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum =0;
        int [] arr = new int[N];
        for (int i=0;i<N;i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
   
        }
        System.out.println(sum);
    }
}
