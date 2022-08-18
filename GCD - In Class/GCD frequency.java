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
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int N = sc.nextInt();
                      int sum = 0;
                      int arr[] = new int [N];
                      for (int i=0;i<arr.length;i++){
                          arr[i] = sc.nextInt();
                      }
                      for (int i=0;i<arr.length;i++){
                          int count=0;
                        for(int j=0;j<arr.length;j++){
                            if (arr[i] == arr[j]) count++;
                        }     
                            sum  += gcd(arr[i], count) ;      
                      }
                      System.out.print(sum);
    }
}
