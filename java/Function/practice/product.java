package Function.practice;

public class product {
    public static int pro(int a, int b){
        // Method ke andar product calculate hota hai aur return hota hai.
        int pro = a * b;
        return pro;
        // System.out.println("product is = " +product);
    }
    public static void main(String[] args) {
        // Returned value ko main ke local variable me store karna padta hai.
        int pro = pro(2,5);
        System.out.println("product is = " +pro);

    }
}
