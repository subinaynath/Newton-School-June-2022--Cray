import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner inputTaker = new Scanner(System.in);
        String inputString = inputTaker.nextLine();
        char player1 = inputString.charAt(0);
        char player2 = inputString.charAt(2);

        if(player1 == 'R' || player2 == 'R'){
            System.out.println("R");
        }else if(player1 == 'J' || player2 == 'J'){
            
            if(player1 == 'J'){
                System.out.println(player2);
            }else{
                System.out.println(player1);
            }

        }else{
            System.out.println("D");
        }
    }
}
