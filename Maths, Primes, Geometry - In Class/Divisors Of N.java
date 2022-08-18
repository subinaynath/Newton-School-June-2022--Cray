import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int j = 1; j <= t; j++) {
			int n = sc.nextInt();
			int count = 0;
			int i = 0, k = 2;   //global k
			for (i = 1; i*i<=n; i++) {
				if (n % i == 0) {
					if (i % k == 0) {
						count++;
					}

					if ((n / i) % k == 0) {
						count++;
					}
				}
			}
			i--;
			if ((i * i == n) && (i % k == 0)) {
				count--;
			}
			System.out.println(count);
		}
	}

}
