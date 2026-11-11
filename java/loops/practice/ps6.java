package loops.practice;

import java.util.Scanner;

public class ps6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to check leap year or not leap year");
        int year = sc.nextInt();
        // Leap year rule: 4 se divisible ho, par 100 se nahi; ya 400 se divisible ho.
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year +" is leap year");
        }  else {
            System.out.println(year +" is not leap year");
        }
        sc.close();
    }
}
