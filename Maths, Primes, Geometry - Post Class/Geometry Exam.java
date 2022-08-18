import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        double ax=sc.nextDouble();
        double ay=sc.nextDouble();
        double bx=sc.nextDouble();
        double by=sc.nextDouble();
        double cx=sc.nextDouble();
        double cy=sc.nextDouble();
        
        if ((by - ay) / (bx - ax) != (cy - by) / (cx - bx) && (by - ay) * (by - ay) + (bx - ax) * (bx - ax) == (cy - by) * (cy - by) + (cx - bx) * (cx - bx))
        {
            System.out.print("Yes\n");
        }
        else
        {
            System.out.print("No\n");
        }

    }
}
