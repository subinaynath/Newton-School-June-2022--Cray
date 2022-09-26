import java.util.*;

public class Interview {
    public static int occurance(int arr[], int target){
        int start=0, end=arr.length-1;
        int fst=-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(arr[mid] == target){
                fst = mid;
                end =mid-1;
            }else if(arr[mid]<target) start=mid+1;
            else end= mid-1;
        }
         start=0; end=arr.length-1;
        int lst=-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(arr[mid] == target){
                lst = mid;
                start =mid+1;
            }else if(arr[mid]<target) start=mid+1;
            else end= mid-1;
        }

        return (lst-fst)+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        int arr[] = { 1, 2, 2, 3, 4, 7, 10, 45, 45 };
//        for(int i=0;i<n;i++) {
//            arr[i] = sc.nextInt();
//        }
        int target = 45;
        System.out.println(occurance(arr,target));


    }
}
