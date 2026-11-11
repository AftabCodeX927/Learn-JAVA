package loops.print_Pattern;

public class pattern2 {
    public static void main(String[] args){
        // Outer loop controls the number of rows.
        for(int i = 1; i <= 4; i++){
            // Inner loop prints stars in decreasing order for each row.
            for(int j = 1; j <= 4-i+1; j++){
                System.out.print("*");
            }

            // Move to the next line after printing one row.
            System.out.println();
        }
    }
}
