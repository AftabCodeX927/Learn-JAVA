package Function.practice;

public class checkPrimeOrNotOptimized {
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

    public static void main(String[] args) {
        // Print whether 4 is prime or not.
        System.out.println(optimized(4));
        
    }
}
