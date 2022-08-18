import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      String A = sc.next();
                      int a =A.length();
                        for(int i=a-1;i>=0;i--){
                          System.out.print(A.charAt(i));
                      }
    }
}
