import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long maxCircularSum(int a[]){
        long maxeh =a[0], max=a[0],mineh=a[0],min=a[0];
        long sum=a[0];
        for(int i=1;i<a.length;i++){
            maxeh = Math.max(maxeh+a[i], a[i]);
            max= Math.max(max, maxeh);
            mineh = Math.min(mineh+a[i], a[i]);
            min= Math.min(min, mineh);
            sum += a[i];
        }
        if(min == sum) return max;
        return Math.max(sum-min, max);

    }
    public static void main (String[] args)throws IOException {
                      // Your code here
                     /* Scanner sc = new Scanner(System.in);
                      int T = sc.nextInt();
                      for(int t=0; t<T;t++){
                          int N = sc.nextInt();
                          int arr[] = new int[N];
                          for(int i=0;i<N;i++){
                              arr[i] = sc.nextInt();
                          }
                          System.out.println(maxCircularSum(arr));
                      }*/
                      BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
                      int T = Integer.parseInt(br.readLine());
                      for(int t=0;t<T;t++){
                          int N = Integer.parseInt(br.readLine());
                         String str[] =br.readLine().trim().split(" ");   
                          int arr[] = new int[N];
                          for(int i=0;i<N;i++){
                              arr[i] = Integer.parseInt(str[i]);
                          }
                          System.out.println(maxCircularSum(arr));
                      }

    }
}
