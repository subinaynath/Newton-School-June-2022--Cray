public static int[] implementMergeSort(int arr[], int start, int end)
    {
        // Your code here
       // You can have your own function where you will use 
      // start and end position for divide purpose  
              if(start == end) {
              int res[] = new int[1];
              res[0] = arr[start];
              return res;
            }

            int mid = (start + end) / 2;

            int firstHalf[] = implementMergeSort(arr, start, mid);
            int secondHalf[] = implementMergeSort(arr, mid + 1, end);


            int res[] = merge(firstHalf, secondHalf);
            return res;
    }
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
