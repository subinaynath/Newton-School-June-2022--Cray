static long  Sum(long  n) 
    { 
  //Enter your code here
  if(n ==0)return n;
  long a =n%10;
  return a+Sum(n/10);
    }
