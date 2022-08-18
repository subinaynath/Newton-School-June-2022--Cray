import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
//first non repeat
class Main {

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
                if(map.containsKey(s.charAt(i))){
                    int initialfrq =map.get(s.charAt(i));
                    map.put(s.charAt(i), initialfrq+1);
                }else map.put(s.charAt(i),1);
        }
        for(int i=0;i<s.length();i++){
           int ch= s.charAt(i);
            if(map.get(s.charAt(i)) ==1) {
                System.out.println(i);
                break;
            }else{
               if (i == s.length() - 1)
                System.out.println(-1);
            }
        }
    }
}
