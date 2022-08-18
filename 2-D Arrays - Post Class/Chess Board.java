import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int zero =0;
        int one =0;
        short arr [][] = new short[N][N];
       
        for (int row=1;row<=arr.length;row++){
            for(int col=1; col<=arr[0].length;col++){
                int totalIndex = (row+col)%2; //0/1
                arr[row-1][col-1]=sc.nextShort();
                if (totalIndex == arr[row-1][col-1]) zero++;
                else one++;
            }
        }//checking
        System.out.print(Math.min(one,zero));
    }
}
