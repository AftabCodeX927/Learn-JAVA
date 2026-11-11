import java.util.*;
public class Sum {
    public static void main(String[] args){
        // User se do integer values input le rahe hain.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the value of a");
        int a = sc.nextInt();
        System.out.println("Enetr the value of b");
        int b = sc.nextInt();
        // Dono values ko add karke result print karte hain.
        int sum = a+b;
        System.out.println("The sum of a & b is : " +sum);
        sc.close();
    }
}
