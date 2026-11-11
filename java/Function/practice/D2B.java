package Function.practice;

public class D2B {
    public static void dec2Bin(int n){
        int myNum = n;
        int power = 0;
        int binNum = 0;
        while(n>0){
            int rem = n%2;
            binNum = binNum + (rem * (int)Math.pow(10, power));
            power++;
            n = n/2;
        }
        System.out.println("binary form of "+ myNum +" = "+binNum);
    }
    public static void main(String[] args) {
        dec2Bin(7);
    }
}
