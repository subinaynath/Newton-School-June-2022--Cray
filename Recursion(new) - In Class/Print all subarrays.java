static void PrintSubarrays(int Arr[], int N){
//Enter your code here
for (int i=0; i <N; i++) 
		{
			for (int j=i; j<N; j++) {
                
				for (int k=i; k<=j; k++){
					System.out.print( Arr[k]+" "); 
				}
				System.out.println();
			}
		}
}
