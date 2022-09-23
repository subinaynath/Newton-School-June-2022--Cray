// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
/*1 2 3 4
  5 6 7 8
  9 10 11 12
  13 14 15 16
*/
class Interview {
    public static void antiCloclSpiral(int arr[][]){
        int i, k = 0, l = 0, m=arr.length-1, n=arr[0].length-1;
        int lefttopr=m*n;
        while(lefttopr >0){
            for (i = k; i <= n; ++i) {
                System.out.print(arr[i][l] + " ");
                lefttopr--;
            }
            l++;
            for (i = l; i <=n; ++i) {
                System.out.print(arr[m][i] + " ");
                lefttopr--;
            }
            m--;
            for (i = m; i >= k; --i) {
                System.out.print(arr[i][n] + " ");
                lefttopr--;
            }
            n--;
            for (i = n; i >= l; --i) {
                System.out.print(arr[k][i] + " ");
                lefttopr--;
            }
            k++;
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        antiCloclSpiral(arr);
    }
}
