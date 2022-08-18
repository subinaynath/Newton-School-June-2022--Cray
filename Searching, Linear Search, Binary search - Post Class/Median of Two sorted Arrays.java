import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        int[] mid = new int[2];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int i = 0, j = 0, count = 0, z = 0;
        int midium = (n + m) / 2;
        while (count < midium + 1) {
            int temp = 0;
            if (arr1[i] <= arr2[j]) {
                temp = arr1[i];
                i++;
                count++;
            } else if (arr1[i] > arr2[j]) {
                temp = arr2[j];
                j++;
                count++;
            }
            if (count >= midium ) {
                mid[z] = temp;
                z++;
            }
        }
        double a = mid[0];
        double b = mid[1];
        if((n+m)%2 == 1) System.out.printf(String.format("%.2f", b));
        else System.out.printf(String.format("%.2f",(a+b)/2));
    }
}
