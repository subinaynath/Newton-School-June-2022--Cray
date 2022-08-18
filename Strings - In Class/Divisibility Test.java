import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
					  Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = str.charAt(str.length()-1);
		if(c=='0'){
			int sum = 0;
			for(int i=0; i<str.length(); i++){
			sum += (int) str.charAt(i);
		}
			if (sum%3==0){
				System.out.print("Yes");
			}
		}else {
			System.out.print("No");
		}
		
	}
}
