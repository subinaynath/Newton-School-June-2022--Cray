import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    	public static long countSubarraysWithEqual0and1(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		long count = 0;
		int ps = 0;

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) arr[i] = -1;
		}

		for(int i = 0; i < arr.length; i++) {
			// calculate prefix sum
			ps = ps + arr[i];

			// check if map contains ps
			if(map.containsKey(ps)) {
				int initalCount = map.get(ps);
				count += initalCount;
				map.put(ps, initalCount + 1);
			}else {
				map.put(ps, 1); // first time
			}
		}

		return count;
	}
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc= new Scanner(System.in);
                      int N = sc.nextInt();
                      int arr[] = new int[N];
                      for(int i=0;i<N;i++){
                          arr[i] = sc.nextInt();
                      }
                      System.out.print(countSubarraysWithEqual0and1(arr));
    }
}
