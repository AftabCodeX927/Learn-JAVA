package loops.practice;

public class Ps4 {
    public static void main(String[] args){
        //print reverse of a number
//       int n = 10899;
//        while( n > 0){
//            int lastDigit = n % 10; //lastDigit
//            System.out.print(lastDigit);
//            n /= 10; //lastDigit remove

        //print reverse the given number
        int n = 10899;
        int reverse = 0;
        // Last digit nikal kar reverse number ke end me add karte jaate hain.
        while(n > 0){
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n /= 10;
        }
        System.out.println(reverse);
    }
}
