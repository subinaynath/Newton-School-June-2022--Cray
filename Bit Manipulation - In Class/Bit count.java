import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      long N = sc.nextLong();
                      long count = 0;
                     while(N>0){
                           count += N & 1;
			                N >>= 1;
		
                      }
                      System.out.print(count);
    }
}
