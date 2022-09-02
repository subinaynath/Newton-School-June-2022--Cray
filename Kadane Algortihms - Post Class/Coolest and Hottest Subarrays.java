import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long coolness(long arr[]){
        long maxEnd=arr[0], max=arr[0],minEnd=arr[0],min=arr[0];
        //find cool(Max xontinious sum)
        for(int i=1;i<arr.length;i++){
            if(maxEnd>0) maxEnd +=arr[i];
            else maxEnd =arr[i];
            if(max<maxEnd) max=maxEnd;
        }
        // find negetive window(Hotness)
        for(int i=1; i<arr.length;i++){
            if(minEnd<0) minEnd += arr[i];
            else minEnd = arr[i];
            if(minEnd<min) min =minEnd;
        }
        long res = max -min;
        return res;
    }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int N = sc.nextInt();
                      long arr[] = new long[N];
                      for(int i=0;i<arr.length;i++){
                          arr[i] = sc.nextLong();
                      }
                      System.out.print(coolness(arr));
                      
    }
}
