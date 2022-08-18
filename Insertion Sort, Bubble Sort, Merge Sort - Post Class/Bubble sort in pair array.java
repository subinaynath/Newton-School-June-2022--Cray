/*
class Pair { 
    int x; 
    int y; 
  
    // Constructor 
public Pair(int x, int y) 
    { 
        this.x = x; 
        this.y = y; 
    } 
} 
*/ 

static Pair[] SortPair(Pair arr[], int n)  { 
 //enter your code here
 Arrays.sort(arr, new secondelement());
return arr;
 }
 static class  secondelement implements Comparator<Pair> 
{
    public int compare(Pair a, Pair b)
    {
        if(a.x==b.x)
        {
            return b.y-a.y;
        }
        return b.x - a.x;
    }
}
