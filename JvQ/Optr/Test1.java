package JvQ.Optr;

public class Test1 {
    public static void main(String[] arga){
        int x = 200 , y = 50 , z = 100;
        // && operator me dono conditions true honi chahiye.
        if(x > y && y > z){
            System.out.println("Hello");
        }
        if(z > y && z < x){
            System.out.println("Java");
        }
        if((y + 200) < x && (y + 150) < z){
            System.out.println("Hello Java");
        }

    }
}
