package loops.practice;
    import java.sql.SQLOutput;
    import java.util.Scanner;
public class Ps1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        // if-else ladder se number positive, zero, ya negative check karte hain.
        if(number > 0){
            System.out.println(number + " number is +ve" );
        } else if(number == 0) {
            System.out.println(number + " number is neutral");
        } else {
            System.out.println(number + " number is negative");
        }
    }
}
