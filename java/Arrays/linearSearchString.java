package Arrays;

public class linearSearchString {
    // Find the fruit in the menu array.
    public static int ls(String menu[], String fruits){
        // Check every menu item one by one.
        for(int i = 0; i < menu.length; i++){
            if(menu[i].equals(fruits)){
             // Return the index if the fruit is found.
             return i;                   
            }
        }
        // Return -1 if the fruit is not found.
        return -1;
    }
    public static void main(String[] args) {

        // Create a menu and choose a fruit.
        String menu[] = {"orange","apple","grapes","cranberry","mango","litchi","banana","carrot","lemon","ginger"};
        String fruits = "cranberry";
        
        // Search for the fruit.
        int index = ls(menu, fruits); 
        if(index == -1){
            // Print this message if the fruit is missing.
            System.out.println("NOT found");
        } else {
            // Print the index if the fruit is found.
            System.out.println("fruit is at index : " + index);
        }
    }
}
