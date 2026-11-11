package Arrays;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        int marks[] = new int[166];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phy number :");
        marks[0] = sc.nextInt(); //phy

        System.out.print("Enter che number :");
        marks[1] = sc.nextInt(); //che

        System.out.print("Enter math number :");
        marks[2] = sc.nextInt(); //math
        marks[2] += 1;

        System.out.println("Enter phy number is : " + marks[0]);
        System.out.println("Enter che number is : " + marks[1]);
        System.out.println("Enter math number is : " + marks[2]);
        
        System.out.println("total number of enter :" + (marks[0] + marks[1] + marks[2]));

        System.out.println(marks.length);
        sc.close();
    }
}

