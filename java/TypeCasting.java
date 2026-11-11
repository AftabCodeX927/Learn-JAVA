// import java.util.*;

// public class TypeCasting {
//     public static void main(String[] args)    {
//         Scanner sc = new Scanner(System.in);
//         float a = 25.12f;
//         int b = (int) a;
//         System.out.println(b);
//         sc.close();
//     }
// }

    // public class TypeCasting{
    //     public static void main(String[] args){
    //         char ch ='b';
    //         int number = ch;
    //         System.out.println(number);
    //     }
    // }

    public class TypeCasting{
    public static void main(String[] args){
        char a = 'a';
        char b = 'b';
        // Character ko int me cast karne par ASCII value milti hai.
        System.out.println((int) (a));
        System.out.println((int) (b));
        // Characters ke beech subtraction bhi ASCII values par hota hai.
        System.out.println(b-a);
    }
}
