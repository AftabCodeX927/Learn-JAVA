package loops.print_Pattern;

public class pattern5 {
    public  static void main(String[] args){
        int n = 6;
        char ch = 'A';
        // Outer loop rows control karta hai.
        for(int i = 1;  i <= n; i++){
            // Inner loop current row me characters print karta hai.
        for(int j = 1; j <= i; j++){
        System.out.print(ch);
        ch++;
        }
        System.out.println();
    }
    }
}
