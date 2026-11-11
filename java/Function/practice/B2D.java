package Function.practice;

public class B2D {
    public static void bin2Dec(int binNum){
        int myNum = binNum;
        int power = 0;
        int decNum = 0;
        
        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, power));
            power++;
            binNum = binNum/10;
        }
        System.out.println("decimal  of "+ myNum +" = "+ decNum);
        // return decNum;
    }
    public static void main(String[] args) {
        bin2Dec(10100011);
        
    }
}
