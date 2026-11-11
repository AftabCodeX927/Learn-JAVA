package Function.practice;

public class factorialOfN {
    // This method calculates and returns the factorial of n.
    public static int factorial(int n){
        // The starting value for factorial calculation is 1.
        int fact = 1;
        
        // Multiply all numbers from 1 to n.
        for(int i = 1; i <= n; i++){
            fact =  fact * i;
        }

        // Return the final factorial value.
        return fact; // factorial of n

        
    }
    public static void main(String[] args) {
        // Call the factorial method and store the returned value in fact.
        int fact = factorial(5);

        // Print the factorial result.
        System.out.println(fact);

    }
}
