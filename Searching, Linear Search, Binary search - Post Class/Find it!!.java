import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long check(long k){
       long left=0;
       long right =(long) Math.sqrt(k);
       if(k ==0) return 0;
       while(left<=right ){
           long mid = (left+right)/2;
           long A = (mid*mid) +(3*mid);
           if(A == k) return mid;
           else if(A>k) right =mid-1;
           else left = mid+1;
       }
       return -1;
    }

    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      long K = sc.nextLong();
                    
                      System.out.print(check(K));
    }
}
