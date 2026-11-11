package Hw;

public class Tricky {
    public static void main(String[] args){
        byte b = 4;
        int $ = 24;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        // Mixed data types wali expression ka final result double me store hota hai.
        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);
        System.out.println($);
    }
}
