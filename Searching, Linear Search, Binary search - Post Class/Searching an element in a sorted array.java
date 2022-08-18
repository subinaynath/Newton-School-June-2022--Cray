static int isPresent(long arr[], int n, long k)
{
	    // Your code here
		int left = 0, right = arr.length - 1;

		while(left <= right) {
			int mid = (left + right) / 2;

			if(arr[mid] == k) {
				return 1;
			} else if(arr[mid] > k) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
}
