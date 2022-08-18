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
				swap(arr, i, j);
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
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }
    public static void waveArray(int arr[],int n){
        for(int i=0;i<n;i+=2){
            swap(arr,i,i+1);
        }
    }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc= new Scanner(System.in);
                      int n = sc.nextInt();
                      int arr[]= new int[n];
                      for(int i=0;i<arr.length;i++){
                          arr[i] = sc.nextInt();
                      }
                      quickSort(arr,0,n-1);
                      waveArray(arr,n-1);
                      for(int i=0;i<arr.length;i++){
                          System.out.print(arr[i]+" ");
                      }

    }
}
