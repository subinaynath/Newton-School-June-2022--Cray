import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc = new Scanner(System.in);
					  int a = sc.nextInt();
					  int b = sc.nextInt();
					  int c = sc.nextInt();
					  int d = sc.nextInt();
					  int e = sc.nextInt();
					  int per = (a+b+c+d+e)/5;
					  if (per>=80){
						  System.out.println("A");
					  }else if (per>=60 && per<80){
						  System.out.println("B");
					  }else if (per>=40 && per<60){
						  System.out.println("C");
					  }else  {
						  System.out.println("D");
					  }

	}
}
