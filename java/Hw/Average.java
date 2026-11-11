package Hw;

import java.util.*;
public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // User se three numbers input le rahe hain.
        System.out.println("Enter the value of A");
        int a = sc.nextInt();
        
        System.out.println("enter the value of B");
        int b = sc.nextInt();

        System.out.println("Enter the value of c");
        int c = sc.nextInt();

        // Average nikalne ke liye total ko 3 se divide karte hain.
        float avg = (float)((a + b + c) / 3);
        System.out.println("Average of these number :" + avg);

        sc.close();
    }
}
