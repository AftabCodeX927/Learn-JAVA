package Function.practice;

public class checkPrimeOrNot {
    public static boolean isPrime(int n){
        // Prime numbers start from 2, so 0, 1 and negative numbers are not prime.
        if (n <= 1) {
            return false;
        }

        boolean isPrime = true;

        // Check if n is divisible by any number from 2 to n-1.
        for(int i = 2; i <= n-1; i++){
            if(n % i == 0){  // completely divisible means not prime
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
    public static void main(String[] args) {
        // Check whether 12 is prime or not.
        System.out.println(isPrime(12));
    }
}
