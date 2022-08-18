import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                     int T = sc.nextInt();
                     for(int t=0;t<T;t++){
                            int N = sc.nextInt();
                            int X = sc.nextInt();
                            boolean isPresent = false;
                            int arr[] = new int[N];
                            for (int i=0;i<arr.length;i++){
                            arr[i]=sc.nextInt();
                            if(arr[i]==X){
                                System.out.print(i+" ");
                                    isPresent = true;
                                 }
                            }
                           // if(T>1)System.out.print("\n");
                        if(!isPresent)System.out.print("Not found");
                        System.out.println();
                                    
                     }
    }
}
