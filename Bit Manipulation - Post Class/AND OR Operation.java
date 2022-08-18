import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      long testCase = sc.nextLong();
                      for (long t=0;t<testCase;t++){
                          long a = sc.nextLong();
                          long b = sc.nextLong();
                          long k = sc.nextLong();
                          if(k==1)System.out.println(a&b);
                          else System.out.println((a&b)|b);
                         
                         
                      }
    }
}
