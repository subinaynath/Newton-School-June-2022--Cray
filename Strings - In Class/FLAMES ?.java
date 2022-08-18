import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
					  	String res[]={"Siblings","Friends","Love","Affection","Marriage","Enemy"};
					  Scanner sc = new Scanner(System.in);
					  String A = sc.next();
					  String B = sc.next();
					  char arrA []=A.toCharArray();
					  Arrays.sort(arrA);
					  char arrB []=B.toCharArray();
					  Arrays.sort(arrB);
					  int cnt = arrA.length + arrB.length;
					  int i=0,j=0;
					  while(i<arrA.length && j<arrB.length){
						  int ii = arrA[i];
						  int jj = arrB[j];
						  if(ii == jj){
							   cnt -=2;
						  i++; j++;
						  }else if(ii<jj) i++;
						  else j++;
					  }
					  int lst = cnt%6;
					  System.out.print(res[lst]);
					  


    }
}
