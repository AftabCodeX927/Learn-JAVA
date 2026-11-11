package loops.practice;
import java.util.*;
public class ps8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter your number");
            int n = sc.nextInt();
            // continue current iteration skip karke loop ko next input par le jaata hai.
            if(n%10==0){
                System.out.println("Your code is enough");
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}
