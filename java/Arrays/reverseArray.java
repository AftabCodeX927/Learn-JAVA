package Arrays;

public class reverseArray {
    public static void reverse(int numbers[]){
        int first = 0, last = numbers.length-1;

        while(first < last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {10,4,6,8,2,3,4,5,46,2,6,43,54,23,45,2,7,4,87,896,33,2,23,4,4,333343,45443,76};
        
        reverse(numbers);

        //print     
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
