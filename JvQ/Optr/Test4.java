package JvQ.Optr;

public class Test4 {
    public static void main(String[] args) {
        int x = 10 , y = 5;

        // Brackets calculation ka order change kar sakte hain.
        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);

        System.out.println(exp1);
        System.out.println(exp2);
    }
}
