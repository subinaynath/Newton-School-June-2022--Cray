static int Power(int n,int p)
{
      // Your code here
      if(p == 0) return 1;

		int x = Power(n, p - 1);
		return n * x;
}
