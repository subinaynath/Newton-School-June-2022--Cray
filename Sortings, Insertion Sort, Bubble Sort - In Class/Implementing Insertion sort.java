import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int T = sc.nextInt();
                      while(T>0){
                          int n = sc.nextInt();
                          int arr[] = new int[n];
                          for(int i=0;i<n;i++){
                              arr[i] = sc.nextInt();
                          }
                          sort(arr);
                           for(int i=0;i<n;i++){
                               System.out.print(arr[i]+" ");
                          }
                          System.out.println();
                            T--;
                      }
    }
}
