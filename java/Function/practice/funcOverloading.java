package Function.practice;

public class funcOverloading {
    
    // Using Parameter 

    // function to calculate sum of 2 number
    // public static int sum(int a, int b){
    //     return a+b;
    // }
    // // function to calculate sum of 3 number
    // public static int sum(int a, int b, int c) {
    //     return a+b+c;
    // }

    // Using Data types

    // function to calculate integers number 
    public static int sum(int a, int b){
        return  a+b;
    }

    // Same method name with float parameters is method overloading.
    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        // Calls the integer version of sum.
        System.out.println(sum(5,3));

        // Calls the float version of sum.
        System.out.println(sum(3.5f, 4.8f));
    }
}
