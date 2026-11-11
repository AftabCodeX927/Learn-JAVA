import java.util.*;
public class Area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // User se circle ka radius input le rahe hain.
        float r = sc.nextFloat();
        // Circle area formula: pi * r * r.
        double area = (3.14159 * r * r);    
        System.out.println(area);
        sc.close();
    }
}
