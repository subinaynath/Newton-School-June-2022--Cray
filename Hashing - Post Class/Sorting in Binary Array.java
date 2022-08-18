import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   public static void swap (int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

   public static void binarySort(int arr[], int pivot){
       int i=0, j=-1;
       for( i=0;i<arr.length;i++){
           if(arr[i]<=pivot){
               j++;
               swap(arr,i,j);
           }
       }
   }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int N = sc.nextInt();
                      int arr[]= new int[N];
                      for(int i=0;i<N;i++){
                          arr[i] = sc.nextInt();
                      }
                      binarySort(arr,0);
                      for(int el:arr){
                          System.out.print(el+" ");
                      }
    }
}
