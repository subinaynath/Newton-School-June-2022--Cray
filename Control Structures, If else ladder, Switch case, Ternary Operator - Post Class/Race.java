static char Race(int A,int B,int C){
//Enter your code here
int x=Math.abs(C-A);
int y=Math.abs(C-B);

if (x<y) return 'N';
else if(x>y) return 'S';
else return 'D';

}
