import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

static int findUinque(int arr[]){
        // Do XOR of all elements and return
        int res = arr[0];
        for (int i = 1; i <arr.length; i++)
            res = res ^ arr[i];
     
        return res;
    }    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int N = sc.nextInt();
                      int arr[] = new int[N];
                      for (int i=0;i<N;i++){
                          arr[i] = sc.nextInt();
                      }
                      System.out.print(findUinque(arr));
    }
}
