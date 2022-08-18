import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.BigInteger;
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[]= str.split(" ");
        BigInteger a = new BigInteger(arr[0]);
        BigInteger b = new BigInteger(arr[1]);
        System.out.println(a.add(b));

    }
}
