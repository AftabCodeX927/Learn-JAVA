package JvQ.Optr;

public class Test2 {
    public static void main(String[] args){
        int x , y , z;
        // Chained assignment se teeno variables me same value set hoti hai.
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x +" " + y + " " + z);
    }
}
