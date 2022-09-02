import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int N = sc.nextInt();
                      int M = sc.nextInt();
                      //taking input & make array prefix sum
                      int arr[][] = new int[N+1][M+1];
                      for(int i=1;i<=N;i++){
                          for(int j=1;j<=M;j++){
                              arr[i][j] = sc.nextInt();
                              //making prefix sum
                              arr[i][j] += arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1];
                          }
                      }
                      int test = sc.nextInt();
                      for(int t=0;t<test;t++){
                          int x1 = sc.nextInt();
                          int y1 = sc.nextInt();
                          int x2 = sc.nextInt();
                          int y2 = sc.nextInt();
                          
                          int sum=0;  
                          insum =  arr[x2][y2] - arr[x1-1][y2] - arr[x2][y1-1] + arr[x1-1][y1-1];
                          System.out.println(sum);            
                      }
                      
    }
}
