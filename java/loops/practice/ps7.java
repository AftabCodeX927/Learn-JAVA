package loops.practice;
import java.util.*;
public class ps7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your number");
            int n = sc.nextInt();
            // 10 ke multiple par loop break ho jaata hai.
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);

        }while(true);
    }
}
