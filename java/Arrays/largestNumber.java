package Arrays;

public class largestNumber {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for(int i = 0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest numbers is :" + smallest);
        return largest;
    }
    public static void main(String[] args) {
    int numbers[] = {4,3,5,6,2,7,3,9,8};
        System.out.println("The largest numbers is :" + getLargest(numbers));

    }
}
