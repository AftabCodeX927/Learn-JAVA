package Hw;

import java.util.*;

public class GST {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Items ki cost user se input le rahe hain.
        System.out.println("Enter the cost of Pencil");
        float pencil = sc.nextFloat();

        System.out.println("Enter the cost of Pen");
        float pen = sc.nextFloat();

        System.out.println("Enter the cost of Eraser");
        float eraser = sc.nextFloat();

        float totalPrice = (pencil + pen + eraser);
        System.out.println("Total price is : " + totalPrice);

        // GST 18% hai, isliye totalPrice ka 0.18 calculate karte hain.
        float gst = (totalPrice * 0.18f);
        System.out.println("GST is : " + gst);

        float finalbill = (gst + totalPrice);
        System.out.printf("Final Bill is : ₹%.2f " , finalbill);
         
        sc.close();
    }    
}
