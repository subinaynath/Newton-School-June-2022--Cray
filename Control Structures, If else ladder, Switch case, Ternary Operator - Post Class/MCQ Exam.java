import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int max(int x, int y){
		if (x>y){
			return x;
		}else 
		return y;
	}
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc = new Scanner(System.in);
					  int a = sc.nextInt();
					  int b = sc.nextInt();
					  int c = sc.nextInt();
					  int d = sc.nextInt();
					  int m1 = max(a,b);
					  int m2 = max(c,d);
					  int result = max(m1,m2);
					  System.out.println(result);
	}
}
