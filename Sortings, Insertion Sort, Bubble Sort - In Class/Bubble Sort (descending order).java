import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void descending(int arr[]){
        for( int pass=0; pass<arr.length-1; pass++){
            for(int i=0;i<arr.length-1- pass; i++){
                if(arr[i+1]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int N = sc.nextInt();
                      int arr []= new int[N];
                      for (int i=0; i<N; i++){
                          arr [i] = sc.nextInt();
                      }
                      descending(arr);
                      for (int i=0; i<N; i++){
                          System.out.print(arr[i] +" ");
                      }
    }
}
