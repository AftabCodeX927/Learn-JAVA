package sorting_algorithm;

public class bubble_sort {
    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
        public static void printArr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,1,3,4,9,22,23,45,99,21,33};
        bubbleSort(arr);
        printArr(arr);
    }
}
