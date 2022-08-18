import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
  public static int singleDigit(int n){
    if(n%10==0 && n/10==0) return 0;
    int sum = (n%10 + singleDigit(n/10));
    if(sum>9) return singleDigit(sum);
    else return sum;
  }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int N = sc.nextInt();
                      System.out.print(singleDigit(N));

    }
}
