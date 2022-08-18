import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void removeTab(char arr[], int n){

        if(n==-1)return;
        removeTab(arr,n-1);
       if(arr[n]!= ' ') System.out.print(arr[n]); 
       
    }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      String s = sc.nextLine();
                      char arr[]= s.toCharArray();
                      int n =arr.length-1;
                      removeTab(arr,n);
    }
}
