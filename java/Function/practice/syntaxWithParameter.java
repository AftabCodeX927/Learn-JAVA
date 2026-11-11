package Function.practice;
import java.util.*;
    

    public class syntaxWithParameter {
        public static int printSum(int a , int b) { //parameters or formal parameters
        // Method ke andar sum calculate karke return karte hain.
        int sum = a + b;
        return sum;
        

    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User se values lekar method me arguments ke roop me pass karte hain.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = printSum(a,b); //argument or actual parameter
        System.out.println("sum is " +sum);



        sc.close();
    }
}
