package Arrays;

public class linearSearch {
    // Find the key in the number array.
    public static int ls(int numbers[], int key){
        // Check every number one by one.
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
                // Return the index if the key is found.
                return i;
            }
        }
        // Return -1 if the key is not found.
        return -1;
    }
    public static void main(String[] args) {
        // Create an array and choose a key.
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 12;

        
        // Search for the key.
        int index = ls(numbers, key);
        if(index == -1){
            // Print this message if the key is missing.
            System.out.println("NOT found");
        } else {
            // Print the index if the key is found.
            System.out.println("Key is at index : " + index);
        }
    }
}
