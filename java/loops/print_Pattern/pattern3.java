package loops.print_Pattern;

public class pattern3 {
    public static void main(String[] args){
        // Outer loop controls the number of rows.
        for(int i = 1; i <= 4; i++){
            // Inner loop prints numbers from 1 to the current row number.
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }

            // Move to the next line after completing one row.
            System.out.println();
        }
    }
}
