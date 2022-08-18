import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int gcd(int a, int b){
        int dividend = a, divisor= b;
        while(dividend % divisor >0){
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        return divisor;
    }
    public static int gcdArr(int arr[])
    {
        int max = 1;
        //int result = arr[0];
       for (int i=0;i<arr.length;i++){
           for (int j=0; j<arr.length-1;j++){
              int result= gcd(arr[i],arr[j]);

              if (max<result && i !=j) max= result;
           }
       }
       return max;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[]= new int[N];
        for (int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();

        }
        System.out.print(gcdArr(arr));
    }
}
