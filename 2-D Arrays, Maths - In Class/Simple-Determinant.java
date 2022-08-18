import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Main {
    public static int determinant(int arr [][]){
        int s1= (arr[0][0] * arr[1][1]) -(arr[1][0] * arr[0][1]);
        return s1;

    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int matrix [][] = new int [2] [2];
        for ( int row=0;row<2;row++){
            for (int col=0;col<2;col++){
                matrix[row][col] = sc.nextInt();
            }
        }
        System.out.println(determinant(matrix));



    }
}
