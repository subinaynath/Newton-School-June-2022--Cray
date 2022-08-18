import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code herea
                      Scanner sc= new Scanner(System.in);
                      int N=sc.nextInt();
                      int arr[][]=new int[N][N];
                      for( int row=0; row<arr.length;row++){
                          for (int col=0;col<arr[0].length;col++){
                              arr[row][col] = sc.nextInt();
                          }
                      }
                      for (int row=0;row<arr.length;row++){
                          for (int col=0;col<arr[0].length;col++){
                              System.out.print(arr[col][row]+" ");
                          }
                          System.out.println();
                      }
    }
}
