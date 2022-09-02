import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code herearr
                      Scanner sc = new Scanner(System.in);
                      int totalToy = sc.nextInt();
                      int Q = sc.nextInt();
                      int arr[] = new int[totalToy];
                      for(int i=0;i<arr.length;i++){
                          arr[i] = sc.nextInt();
                      }
                       Arrays.sort(arr);
                       for(int i=1;i<=Q;i++){
                           int k = sc.nextInt();
                           int totalBuy = totalToy/(k+1);
                           if(totalToy%(k+1) != 0) totalBuy++;
                           int res =0;
                           for(int j=0;j<totalBuy;j++){
                               res +=arr[j];
                           }
                           System.out.println(res);
                       }
                    
//2 5 10 20 50 100


    }
}
