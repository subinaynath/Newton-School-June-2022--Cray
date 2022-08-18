import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static boolean checkIfSortRotated(int arr[], int n)
    {
                int x = 0, y = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) x++;
            else y++;
        }
        if (x == 1 || y == 1) {
            if (arr[n - 1] < arr[0]) x++;
            else y++;
            if (x == 1 || y == 1)
                return true;
        }
        return false;
    }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int testCase = sc.nextInt();
                      for(int t=0;t<testCase;t++){
                        int N = sc.nextInt();
                        int arr[] = new int[N];
                        for(int i=0;i<arr.length;i++) {
                            arr[i] = sc.nextInt();
                        } 
                        if(checkIfSortRotated(arr,N))System.out.println("Yes");
                        else System.out.println("No");
                      }
    }
}
