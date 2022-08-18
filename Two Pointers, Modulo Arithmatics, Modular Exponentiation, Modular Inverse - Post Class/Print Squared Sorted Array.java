import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int T = sc.nextInt();
                      for(int t=0;t<T;t++){
                          int n = sc.nextInt();
                          int arr[] = new int[n];
                          for(int i=0;i<arr.length;i++){
                              arr[i] = sc.nextInt();
                              arr[i] *=arr[i];
                          }
                            Arrays.sort(arr);
                            for(int i=0;i<arr.length;i++){
                                System.out.print(arr[i]+" ");
                          }
                          System.out.println();
                      }
    }
}
