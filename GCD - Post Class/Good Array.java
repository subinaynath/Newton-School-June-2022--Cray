import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                        Scanner sc=new Scanner(System.in);
                        int N = sc.nextInt();
                        int count=0;
                        int arr[]=new int[N];
                        for (int i=0;i<arr.length;i++){
                            arr[i] = sc.nextInt();
                            if (arr[i]%2 != 0){
                                arr[i]+=1;
                                count++;
                            }
                        }
                        System.out.print(count);
    }
}
