package Function.practice;

public class swap {
    public static void swap(int a ,int b){
        // Temporary variable value ko save rakhta hai taaki swap possible ho.
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
    public static void main(String[] args) {
        //swap - exchange value
        // int a = 5;
        // int b = 10;

        //swap
        // int temp = a;
        // a = b;
        // b = temp;

        // Java me primitive values method me copy hoke jaati hain.
        swap(10,5);
    //     System.out.println("a = " +a);
    //     System.out.println("b = " +b);
    }
}
