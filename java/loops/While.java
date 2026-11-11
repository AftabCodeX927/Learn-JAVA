package loops;
import java.util.*;
public class While {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        // 1 se n tak numbers ko add karne ke liye while loop use kiya hai.
        while(i <= n){
            sum += i;
            i++;
            
        }
        System.out.println(sum);
        sc.close();
    
    }
}
