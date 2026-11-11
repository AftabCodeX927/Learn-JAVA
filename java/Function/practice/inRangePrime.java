package Function.practice;

public class inRangePrime {
    public static boolean optimized(int n){
        // Numbers less than or equal to 1 are not prime.
        if(n <= 1){
            return false;
        }

        // 2 is the smallest prime number.
        if(n == 2){
            return true;
        }

        // Check divisibility only up to the square root of n.
        for(int i = 2; i <= Math.sqrt(n); i++){
            // If n is divisible by i, then n is not prime.
            if(n % i == 0){
                return false;
            }
        }
        // If no divisor is found, then n is prime.
        return true;
    }
    public static void inRange(int n){
        // Check every number from 2 to n.
        for(int i = 2; i <= n; i++){
            // Print the number if it is prime.
            if(optimized(i)){
                System.out.print(i+" ");
            }
        } 

        // Move to the next line after printing all prime numbers.
        System.out.println();
    }

    public static void main(String[] args) {
        // Print all prime numbers from 2 to 200.
        inRange(200);        
    }
}
