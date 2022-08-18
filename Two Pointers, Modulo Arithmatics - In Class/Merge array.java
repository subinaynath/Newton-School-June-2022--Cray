import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int[] merge(int a[], int b[]) {
		int res[] = new int[a.length + b.length];

		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length) {
			if(a[i] <= b[j]) {
				res[k] = a[i];
				i++;
				k++;
			} else {
				res[k] = b[j];
				j++;
				k++;
			}
		}

		while(i < a.length) {
			res[k] = a[i];
			i++;
			k++;
		}

		while(j < b.length) {
			res[k] = b[j];
			j++;
			k++;
		}

		return res;
	}

    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int n = sc.nextInt();
                      int m = sc.nextInt();
                      int arr1[] = new int[n];
                      int arr2[] = new int[m];
                      for(int i=0;i<n;i++){
                          arr1[i] = sc.nextInt();
                      }
                      for(int i=0;i<m;i++){
                          arr2[i] = sc.nextInt();
                      }
                      int res [] =merge(arr1, arr2);
                      for(int i=0;i<res.length;i++){
                         System.out.print(res[i]+" ");
                      }
    
    }
}
