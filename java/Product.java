import java.util.*;
public class Product {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Do numbers input lekar unka product calculate karte hain.
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float product = a * b;
        System.out.println(product);
        sc.close();
    }
}
