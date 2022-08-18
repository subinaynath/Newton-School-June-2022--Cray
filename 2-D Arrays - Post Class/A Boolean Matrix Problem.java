import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static boolean isElementRepeated(int arr[]) {

        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) count++;
            if(count > 0) return true;
        }
        return false;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int count=0; count<T; count++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int arr[][] = new int[m][n];
            for ( int row=0; row<arr.length; row++){
                for (int col=0; col<arr[0].length; col++){
                    arr[row][col] = sc.nextInt();
                }
            }
            for ( int row=0; row<arr.length; row++){
                for (int col=0; col<arr[0].length; col++){
                    if(isElementRepeated(arr[row])){
                        arr[row][col]=1;
                    }else arr[row][col] = 0;
                    System.out.print(arr[row][col]+" ") ;
                }
                System.out.println();
            }
        }
    }
}
