public static void printSpiral(int arr[][]) {
		int minr = 0, maxr = arr.length - 1, minc = 0, maxc = arr[0].length -1;
	
		int valuesLeftToPrint = arr.length * arr[0].length;
		
		while(valuesLeftToPrint > 0) {
			
			// print top wall
			for(int col = minc; col <= maxc; col++) {
				System.out.println(arr[minr][col]);
				valuesLeftToPrint--;
			}
			minr++;
			
			// print right wall
			for(int row = minr; row <= maxr; row++) {
				System.out.println(arr[row][maxc]);
				valuesLeftToPrint--;
			}
			maxc--;
			
			// print bottom wall
			for(int col = maxc; col >= minc; col--) {
				System.out.println(arr[maxr][col]);
				valuesLeftToPrint--;
			}
			maxr--;
			
			// print left wall
			for(int row = maxr; row >= minr; row--) {
				System.out.println(arr[row][minc]);
				valuesLeftToPrint--;
			}
			minc++;
		}
	}
