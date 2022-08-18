import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int partition(int arr[], int pivot, int start, int end) {
    
        int i = start, j = start;
        while(i <= end) {
        if(arr[i] <= pivot) {
        // region 1
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j]= temp;
        i++;
        j++;
        }else {
        // region 2
        i++;
        }
        }
        return j - 1;
        }

public static void quickSort(int arr[], int start, int end) {

        if(start >= end) return;

        int pivot = arr[end];
        int pi = partition(arr, pivot, start, end);
        quickSort(arr, start, pi - 1);
        quickSort(arr, pi + 1, end);
        }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int n = sc.nextInt();
                      int arr[] = new int[n];
                      for(int i=0;i<n;i++){
                          arr[i] = sc.nextInt();
                      }
                      int target = sc.nextInt();
                      quickSort(arr,0,n-1);
                      int start=0,end=n-1;
                      boolean isFound= false;
                      while(start<end){
                          int tempT =(arr[start]+arr[end]);
                          if(tempT==target){
                              System.out.print("Pair found "+"("+arr[end]+", "+arr[start]+")");
                              isFound = true;
                              start++; end --;
                              break;
                          }else if(tempT>target) end--;
                          else start++;
                      }
                      if(isFound== false)
                      System.out.print("Pair not found");

    }
}
