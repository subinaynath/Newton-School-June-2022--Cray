import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        HashSet<String> list = new HashSet<>(5);
        for(int i=0;i<5;i++){
            list.add("'"+sc.next()+"'");
        }
         ArrayList<String> list1 = new ArrayList<String>(list);
        Collections.sort(list1); 
        System.out.println(list1);
    }
}
