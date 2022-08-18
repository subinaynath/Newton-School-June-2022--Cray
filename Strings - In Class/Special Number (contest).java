import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static boolean check(String str)
    {
        int n = str.length();
        int digitSum = 0;
        for (int i=0; i<n; i++)
            digitSum += (str.charAt(i)-'0');
        return (digitSum % 3 == 0);
    }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                        String A =sc.next();
                      //long b =sc.nextLong(); //Long.parseLong(A);
                      if(check(A))System.out.print("Yes");
                      else System.out.print("No");
    } 
}
