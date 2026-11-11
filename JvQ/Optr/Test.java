package JvQ.Optr;

public class Test {
    public static void main(String[] args){
        int x = 2, y = 5;

        // Integer division me decimal part remove ho jaata hai.
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));

        System.out.print(exp1 + " , ");
        System.out.print(exp2);
    }    
}
