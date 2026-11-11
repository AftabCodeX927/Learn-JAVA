package Function.practice;

public class binomialCoefficient  {
    // This method calculates factorial of a number using a loop.
    public static int factorial(int n) {
        int fact = 1;

        // Multiply all numbers from 1 to n.
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // This method calculates nCr using the formula: n! / (r! * (n-r)!).
    public static int binoCoff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binoCoff = fact_n / (fact_r * fact_nmr);
        return binoCoff;
    }
    public static void main(String[] args) {
        // Print the binomial coefficient of 5C2.
        System.out.println(binoCoff(5, 2));
        
    }
}
