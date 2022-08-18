import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                        String a = sc.next();
                        for(int i=0;i<a.length();i+=2){
                            System.out.print(a.charAt(i)+" ");
                        }
    }
}
